package com.itwill.etc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.itwill.db.RdbmsDao;
import com.itwill.etc.dto.Board;
import com.itwill.etc.dto.BoardDaoSQL;

public class BoardDBImpl extends RdbmsDao implements BoardDao{
	
	@Override
	public int create(Board board) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		con = this.getConnection();
		pstmt = con.prepareStatement(BoardDaoSQL.insertSQL);
		pstmt.setString(1, board.getbTitle());
		pstmt.setString(2, board.getbContent());
		pstmt.setString(3, board.getcEmail());
		int insertCount = pstmt.executeUpdate();
		
		return insertCount;
	}

	@Override
	public int update(Board board) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		con = this.getConnection();
		pstmt = con.prepareStatement(BoardDaoSQL.updateSQL);
		pstmt.setString(1, board.getbTitle());
		pstmt.setString(2, board.getbContent());
		pstmt.setInt(3, board.getbNo());
		int updateCount = pstmt.executeUpdate();
		
		return updateCount;
	}

	@Override
	public int delete(int bNo) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		con = getConnection();
		pstmt = con.prepareStatement(BoardDaoSQL.deleteSQL);
		pstmt.setInt(1, bNo);
		
		return 0;
	}

	@Override
	public ArrayList<Board> selectAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Board selectKey(int pNO) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
