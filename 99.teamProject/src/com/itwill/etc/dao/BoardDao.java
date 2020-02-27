package com.itwill.etc.dao;

import java.util.ArrayList;

import com.itwill.etc.dto.Board;


public interface BoardDao {
	
	int create(Board board) throws Exception;
	
	int update(Board board) throws Exception;
	
	int delete(int bNo) throws Exception;
	
	ArrayList<Board> selectAll() throws Exception;
	
	Board selectKey(int pNo) throws Exception;
	
}
