package com.itwill.customer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.itwill.customer.dto.Customer;
import com.itwill.customer.dto.CustomerSQL;

public class CustomerDaoImpl implements CustomerDao {
	private DataSource dataSource;
	
	public CustomerDaoImpl() throws Exception {
		InitialContext ic = new InitialContext();
		dataSource = (DataSource) ic.lookup("java:/comp/env/jdbc/OracleDB");
	}
	
	/*
	 * 회원 가입
	 */
	@Override
	public int create(Customer customer) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		String create = CustomerSQL.CREATE;
		try {
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(create);
			pstmt.setString(1, customer.getcEmail());
			pstmt.setString(2, customer.getcPassword());
			pstmt.setString(3, customer.getcBirth());
			pstmt.setString(4, customer.getcTel());
			pstmt.setString(5, customer.getcSex());
			int rows = pstmt.executeUpdate();
			return rows;
		} finally {
			if (pstmt != null)
				pstmt.close();
			if (con != null)
				con.close();
		}
	}
	
	/*
	 * 회원 정보 수정
	 */
	@Override
	public int update(Customer customer) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		String update = CustomerSQL.UPDATE;
		try {
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(update);
			pstmt.setString(1, customer.getcPassword());
			pstmt.setString(2, customer.getcBirth());
			pstmt.setString(3, customer.getcTel());
			pstmt.setString(4, customer.getcSex());
			pstmt.setString(5, customer.getcEmail());
			int rows = pstmt.executeUpdate();
			return rows;
		} finally {
			if (pstmt != null)
				pstmt.close();
			if (con != null)
				con.close();
		}
	}
	
	/*
	 * 회원 탈퇴
	 */
	@Override
	public int remove(String cEmail) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		String remove = CustomerSQL.REMOVE;
		try {
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(remove);
			pstmt.setString(1, cEmail);
			int rows = pstmt.executeUpdate();
			return rows;
		} finally {
			if (pstmt != null)
				pstmt.close();
			if (con != null)
				con.close();
		}
	}
	
	/*
	 * 회원 1명 보기
	 */
	@Override
	public Customer findOne(String cEmail) throws Exception {
		Customer customer = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String findOne = CustomerSQL.FIND_ONE;
		try {
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(findOne);
			pstmt.setString(1, cEmail);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				customer = new Customer(rs.getString("cEmail"),
						rs.getString("cPassword"), rs.getString("cBirth"),
						rs.getString("cTel"), rs.getString("cSex"));
			}
		} finally {
			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (con != null)
				con.close();
		}
		return customer;
	}
	
	/*
	 * 회원 전체 보기
	 */
	@Override
	public ArrayList<Customer> findAll() throws Exception {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String findAll = CustomerSQL.FIND_ALL;
		try {
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(findAll);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				customerList.add(new Customer(
						rs.getString("cEmail"),
						rs.getString("cPassword"),
						rs.getString("cBirth"),
						rs.getString("cTel"),
						rs.getString("cSex")));
			}
		} finally {
			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (con != null)
				con.close();
		}
		return customerList;
	}
	
	/*
	 * 회원 존재여부 체크
	 */
	public boolean existedEmail(String cEmail) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String existed = CustomerSQL.EXISTED;
		try {
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(existed);
			pstmt.setString(1, cEmail);
			rs = pstmt.executeQuery();
			int count = 0;
			if (rs.next()) {
				count = rs.getInt("cnt");
			}
			if (count == 1) {
				return true;
			} else {
				return false;
			}
		} finally {
			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (con != null)
				con.close();
		}
	}

}
