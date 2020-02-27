package com.itwill.etc.dto;

public class BoardDaoSQL {
	public static final String insertSQL = 
			"insert into board values(BOARD_BNO_SEQ.nextval, '?', '?', sysdate, '?');";
	public static final String updateSQL = 
			  "update board "
			+ "set btitle = '?', bcontent = '?', bdate = sysdate "
			+ "where bNo = '?';";
	public static final String deleteSQL = "delete from board where bno='?';";
	public static final String selectKeySQL = "select * from board where bno = ?;";
	public static final String selectAllSQL = "select * from board;";
	
}
