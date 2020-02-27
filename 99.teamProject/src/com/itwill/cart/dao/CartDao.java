package com.itwill.cart.dao;

import java.util.ArrayList;

import com.itwill.cart.dto.Cart;

public interface CartDao {
	public int create(Cart cart) throws Exception;
	
	public int update(Cart cart) throws Exception;
	
	public int delete(int cNo) throws Exception;
	
	public ArrayList<Cart> selectAll() throws Exception;
	
	public Cart selectKey(int cNo) throws Exception;
	
	
	

	

	
}
