package com.itwill.cart.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.sql.DataSource;

import com.itwill.cart.dto.Cart;
import com.itwill.db.RdbmsDao;

public class CartDaoImpl extends RdbmsDao implements CartDao {	

	@Override
	public int create(int cQty, int cPrice, int pNo, String cEmail) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = getConnection();
			//insert into cart (cNo, cQty, cPrice, pNo, cEmail) values(Cart_cNo_SEQ.NEXTVAL, ?, ?, ?, ?');
			pstmt = con.prepareStatement(CartSQL.CART_INSERT);
			pstmt.setInt(1,0);
			pstmt.setInt(2,0);
			pstmt.setInt(3,0);
			pstmt.setString(4,"");
			
		}catch(Exception e) {
			
		}
		return 0;
		
	}
	
	public boolean isDuplicate(String cEmail, int p_no) {
		Connection con = null;
		PreparedStatement pstmt = null;
		boolean isDuplicate = false;
		try {
			
		}catch(Exception e) {
			
		}
		return isDuplicate;
	}

	@Override
	public int update(Cart cart) throws Exception {
		return 0;
		
	}

	@Override
	public int delete(int cNo) throws Exception {
		return 0;
		
	}

	@Override
	public ArrayList<Cart> selectAll() throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		ArrayList<Cart> cartList = null;
		pstmt = con.prepareStatement(CartSQL.CART_SELCT_ALL);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			
		}
		return null;
	}

	@Override
	public Cart selectKey(int cNo) throws Exception {
		
		return null;
	}
	
}
