package com.itwill.cart.dao;

public class CartSQL {
	public final static String CART_INSERT = 
			"insert into cart (cNo, cQty, cPrice, pNo, cEmail) values(Cart_cNo_SEQ.NEXTVAL, ?, ?, ?, ?');";
	
	public final static String CART_UPDATE = 
			"";
	
	public final static String CART_DELETE =
			"delete from cart where cNo =?;";
	
	public final static String CART_SELECT_cNo =
			"select * from cart where cNo = ?;";
	
	public final static String CART_SELECT_cEmail =
			"select * from cart where cEmail=?;";
	
	public final static String CART_SELCT_ALL = 
			"";
}
