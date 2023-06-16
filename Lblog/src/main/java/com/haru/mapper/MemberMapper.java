package com.haru.mapper;

import com.haru.model.MemberVO;

public interface MemberMapper {

	/* 회원가입 등록 */
	public void register(MemberVO member) throws Exception;
	
	/* 로그인 */	
	public MemberVO login(MemberVO member) throws Exception;
	
	/* 아이디 중복 체크 */
	public MemberVO idCheck(MemberVO member)throws Exception;
	
	/* 비밀번호 찾기 */
	public MemberVO searchPw(MemberVO member)throws Exception;
	
	/* 아이디 찾기 */
	public MemberVO searchId(MemberVO member)throws Exception;
}
