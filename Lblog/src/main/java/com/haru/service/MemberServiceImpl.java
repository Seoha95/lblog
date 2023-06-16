package com.haru.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haru.mapper.MemberMapper;
import com.haru.model.MemberVO;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	private MemberMapper mapper;
	
	// 회원가입 등록
	@Override
	public void register(MemberVO member) throws Exception{
		mapper.register(member);
	}

	// 로그인
	@Override
	public MemberVO login(MemberVO member) throws Exception {
		
		MemberVO MEMBER = mapper.login(member);
		return MEMBER;
		
	}

	// 아이디 중복체크
	@Override
	public MemberVO idCheck(MemberVO member) throws Exception {
		MemberVO MEMBER  = mapper.idCheck(member);
		return MEMBER;
	}

	//비밀번호 찾기
	@Override
	public MemberVO searchPw(MemberVO member) throws Exception {
		MemberVO MEMBER =mapper.searchPw(member);
		return MEMBER;
	}

	//아이디 찾기
	@Override
	public MemberVO searchId(MemberVO member) throws Exception {
		MemberVO MEMBER =mapper.searchId(member);
		return MEMBER;
	}
	
	
}
