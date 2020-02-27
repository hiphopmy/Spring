package com.itwill.customer.dao;

import java.util.ArrayList;

import com.itwill.customer.dto.Customer;
import com.itwill.db.dao.InterfaceDao;
import com.itwill.product.dto.Product;

public interface CustomerDao {
	
	public int create(Customer customer) throws Exception;
	
	public int update(Customer customer) throws Exception;
	
	public int remove(String cEmail) throws Exception;
	
	public Customer findOne(String cEmail) throws Exception;
	
	public ArrayList<Customer> findAll() throws Exception;
	
}