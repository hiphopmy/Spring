package com.itwill.customer.service;

import java.util.ArrayList;

import com.itwill.customer.Exception.EmailNotFoundException;
import com.itwill.customer.Exception.ExistedException;
import com.itwill.customer.dao.CustomerDaoImpl;
import com.itwill.customer.dto.Customer;

public class CustomerService {
	private CustomerDaoImpl customerDaoImpl;
	
	public CustomerService() throws Exception {
		customerDaoImpl = new CustomerDaoImpl();
	}
	
	/*
	 * 회원 가입
	 */
	public int create(Customer customer) throws ExistedException, Exception {
		if (customerDaoImpl.existedEmail(customer.getcEmail())) {
			throw new ExistedException(customer.getcEmail() + "은 이미존재하는 이메일입니다");
		}
		return customerDaoImpl.create(customer);
	}
	
	/*
	 * 회원 정보 수정
	 */
	public int update(Customer customer)throws Exception {
		return customerDaoImpl.update(customer);
	}
	
	/*
	 * 회원 탈퇴
	 */
	public int remove(String cEmail) throws Exception {
		return customerDaoImpl.remove(cEmail);
	}
	
	/*
	 * 회원 1명 보기
	 */
	public Customer findOne(String cEmail)throws EmailNotFoundException, Exception {
		Customer findOne = customerDaoImpl.findOne(cEmail);
		if(findOne == null) {
			throw new EmailNotFoundException(cEmail + "은 존재하지 않는 이메일입니다.");
		}
		return findOne;
	}
	
	/*
	 * 회원 전체 보기
	 */
	public ArrayList<Customer> findAll() throws Exception{
		return customerDaoImpl.findAll();
	}
	
	/*
	 * 이메일 중복체크
	 */
	public boolean isDuplcateEmail(String cEmail) throws Exception{
		boolean isExist = customerDaoImpl.existedEmail(cEmail);
		if(isExist) {
			return true;
		} else {
			return false;
		}
	}
}
