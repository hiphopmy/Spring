package com.itwill.customer.dto;

public class CustomerSQL {
	
	// 회원 가입
	public static final String CREATE = "insert into customer(cEmail, cPassword, cBirth, cTel, cSex) values(?, ?, ?, ?, ?)";
	
	// 회원 정보 수정
	public static final String UPDATE = "update customer set cPassword=?, cBirth=?, cTel=?, cSex=? where cEmail=?";
	
	// 회원 탈퇴
	public static final String REMOVE = "delete from customer where cEmail=?";
	
	// 회원 1명 보기
	public static final String FIND_ONE = "select cEmail, cBirth, cTel, cSex from customer where cEmail=?";
	
	// 회원 전체 보기
	public static final String FIND_ALL = "select cEmail, cBirth, cTel, cSex from customer";
	
	// 회원 존재여부 체크
	public static final String EXISTED = "select count(*) cnt from customer where cEmail=?";

}
