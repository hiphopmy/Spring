package com.itwill.order.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.itwill.order.dto.*;

public class OrderDao implements OrderDaoImpl{
	
	private DataSource ds = null;
	
	
	public OrderDao() {
		try {
			InitialContext ic = new InitialContext();
			ds = (DataSource) ic.lookup("java:/comp/env/jdbc/OracleDB");
			
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Override
	public int InsertOrder(OrderDTO order) {
		// TODO Auto-generated method stub
		Connection conn=null;
		PreparedStatement pstmt=null;
		int inCnt=0;
		//ResultSet rs = null;
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(OrderRelationSql.INSERT_ORDER);
			pstmt.setInt(1, order.getoCnt());
			pstmt.setInt(2, order.getoAmount());
			pstmt.setString(3, order.getChargeWay());
			pstmt.setInt(4, order.getoSts());
			pstmt.setString(5, order.getcEmail());
			pstmt.setInt(6, order.getaNo());
			
			inCnt = pstmt.executeUpdate();
			
			return inCnt;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return inCnt;
	}

	@Override
	public int UpdateOrder(int oNo) {
		// TODO Auto-generated method stub
		return ;
	}

	@Override
	public int deleteOrder(int oNo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public OrderDTO findOrder(int oNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<OrderDTO> entireOrderList() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
