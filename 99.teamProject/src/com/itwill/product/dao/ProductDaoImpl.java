package com.itwill.product.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.itwill.db.RdbmsDao;
import com.itwill.db.dao.InterfaceDao;
import com.itwill.product.dto.Product;

public class ProductDaoImpl extends RdbmsDao implements InterfaceDao   {
	
	public ProductDaoImpl() throws Exception {
	}

	@Override
	public int create(Product prod) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		String qry = "insert into product (pNo, pName, pDesc, pPrice, pPoint, pStockQty, pUnit)";
		qry +=" values (Product_pNO_SEQ.nextval, ?, ?, ?, ?, ?, ?)";
		try {
			con = getConnection();
			pstmt = con.prepareStatement(qry);
			pstmt.setString(1, prod.getpName());
			pstmt.setString(2, prod.getpDesc());
			pstmt.setInt(3, prod.getpPrice());
			pstmt.setDouble(4, prod.getpPoint());
			pstmt.setInt(5, prod.getpStockQty());
			pstmt.setString(6, prod.getpUnit());
			int rows = pstmt.executeUpdate();
			return rows;
		} finally {
			if(pstmt!=null)pstmt.close();
			releaseConnection(con);
		}
	}

	@Override
	public int update(Product prod) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		String  qry = "update product ";
				qry +="set pName = ?, ";
				qry +="    pDesc = ?, ";
				qry +="    pPrice = ?, ";
				qry +="    pStockQty = ?, ";
				qry +="    pUnit = ?";
				qry +=" where pNo = ?";

		try {
			con = getConnection();
			pstmt = con.prepareStatement(qry);
			pstmt.setString(1, prod.getpName());
			pstmt.setString(2, prod.getpDesc());
			pstmt.setInt(3, prod.getpPrice());
			pstmt.setInt(4, prod.getpStockQty());
			pstmt.setString(5, prod.getpUnit());
			pstmt.setInt(6, prod.getpNO());
			int rows = pstmt.executeUpdate();
			return rows;
		} finally {
			if(pstmt!=null)pstmt.close();
			releaseConnection(con);
		}
	}

	@Override
	public int delete(int pNO) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		String qry = "delete from product where pNo = ? ";
		try {
			con = getConnection();
			pstmt = con.prepareStatement(qry);
			pstmt.setInt(1, pNO);
			int rows = pstmt.executeUpdate();
			return rows;
		} finally {
			if(pstmt!=null)pstmt.close();
			releaseConnection(con);
		}
	}

	@Override
	public ArrayList<Product> selectAll() throws Exception {
		ArrayList<Product> productList = new ArrayList<Product>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String qry = "select pNo, pName, pDesc, pPrice, pPoint, pStockQty, pUnit from product";
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(qry);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				productList.add(new Product(
						rs.getInt("pNo"),
						rs.getString("pName"),
						rs.getString("pDesc"),
						rs.getInt("pPrice"),
						rs.getDouble("pPoint"),
						rs.getInt("pStockQty"),
						rs.getString("pUnit")
						));
			}
		} finally {
			if(rs!=null)rs.close();
			if(pstmt!=null)pstmt.close();
			releaseConnection(con);
		}
		
		
		return productList;
	}

	@Override
	public Product selectKey(int pNO) throws Exception {
		Product product = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String qry = "select pNo, pName, pDesc, pPrice, pPoint, pStockQty, pUnit from product";
		       qry += " where pNo = ?";
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(qry);
			pstmt.setInt(1, pNO);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				product = new Product(
						rs.getInt("pNo"),
						rs.getString("pName"),
						rs.getString("pDesc"),
						rs.getInt("pPrice"),
						rs.getDouble("pPoint"),
						rs.getInt("pStockQty"),
						rs.getString("pUnit")
						);
			}
		} finally {
			if(rs!=null)rs.close();
			if(pstmt!=null)pstmt.close();
			releaseConnection(con);
		}
		
		
		return product;
	}

}
