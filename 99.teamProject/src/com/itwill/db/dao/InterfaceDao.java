package com.itwill.db.dao;

import java.util.ArrayList;

import com.itwill.product.dto.Product;

public interface InterfaceDao {
	
	int create(Product prod) throws Exception;
	
	int update(Product prod) throws Exception;
	
	int delete(int pNO) throws Exception;
	
	ArrayList<Product> selectAll() throws Exception;
	
	Product selectKey(int pNO) throws Exception;
	
}
