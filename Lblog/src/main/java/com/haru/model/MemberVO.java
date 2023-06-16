package com.haru.model;

public class MemberVO {
	/*회원 아이디*/
	private String id;
	/*회원 비밀번호*/
	private String pw1;
	/*회원 이름*/
	private String name;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw1() {
		return pw1;
	}
	public void setPw1(String pw1) {
		this.pw1 = pw1;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "MembersVO [id=" + id + ", pw1=" + pw1 + ", name=" + name + "]";
	}
	
	

}
