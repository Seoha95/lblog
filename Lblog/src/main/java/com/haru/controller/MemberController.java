package com.haru.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.haru.model.MemberVO;
import com.haru.service.MemberService;

@Controller
@RequestMapping("/members/")
public class MemberController{
	
	  private static final Logger log = LoggerFactory.getLogger(MemberController.class);

	  @Autowired
	  private MemberService memberSerivce;
	  
	  
	  @GetMapping("/login")
	  public String loginForm() throws Exception{
		  log.info("로그인 페이지 이동");
		  
		  return "/members/loginForm";
	  }
	  
	  @PostMapping("/login")
	  public String login(MemberVO member, HttpSession session) throws Exception {
		  log.info("로그인 후 메인페이지 이동");
		  
		  MemberVO vo = memberSerivce.login(member);
		  
		  if(vo != null) {
			  session.setAttribute("memId", vo.getId());
			  return "redirect:/";
		  }
		  return "/members/loginForm";
	  }
	  
	  @RequestMapping("/logout")
	  public String logOut(HttpSession session) throws Exception{
		  log.info("logout 하기");
		  
		  session.invalidate();
		  
		  return  "redirect:/";
	  }
	  
	  @GetMapping("/join")
	  public String joinForm() {
		  log.info("회원가입 페이지 이동");
		  
		  return "/members/joinForm";
	  }
	  
	  @ResponseBody
	  @PostMapping("/idCheck")
	  public String idCheck(MemberVO member)throws Exception{
		  log.info("id 중복체크");
		  MemberVO m =  memberSerivce.idCheck(member); 
		  String message=null;
		  
		  if(m==null) {
			  message = "success";
		  }else {
			  message = "fail";
		  }
		  
		return message;
	  }
	  
	  @PostMapping("/join")
	  public String createMember(MemberVO member) throws Exception{
		  log.info("회원가입 등록 후 로그인 페이지 이동");
		  
		  memberSerivce.register(member);
		  
		  log.info("회원 등록 성공");
		  
		  return "/members/loginForm";
	  }
	  
	  @GetMapping("/searchPw")
	  public String FindPwForm() throws Exception{
		  log.info("비밀번호 찾기 페이지 이동");
		  
		  return "/members/searchPwForm";
	  }
	  
	  @PostMapping("/pwFind")
	  public String pwSearch(@RequestParam("id")String id, @RequestParam("name")String name,MemberVO member, Model model){
		  log.info("비밀번호 찾기");
		  
		  try {
		  member.setId(id);
		  member.setName(name);
		  
		  
		  model.addAttribute("pwInfo", memberSerivce.searchPw(member));
		  }catch(Exception e){
			e.printStackTrace();
		  }
		  return "/members/pwInfoForm";
	  }
	  
	  
	  @GetMapping("/searchId")
	  public String FindIdForm() throws Exception{
		  log.info("비밀번호 찾기 페이지 이동");
		  
		  return "/members/searchIdForm";
	  }
	  
	  @PostMapping("/idFind")
	  public String idSearch(@RequestParam("name")String name, @RequestParam("pw1")String pw1,MemberVO member, Model model){
		  log.info("아이디 찾기");
		  
		  try {
			  member.setName(name);	  
			  member.setPw1(pw1);
		  
		  model.addAttribute("idInfo", memberSerivce.searchId(member));
		  }catch(Exception e){
			 e.printStackTrace();
		  }
		  return "/members/idInfoForm";
	  }
}
