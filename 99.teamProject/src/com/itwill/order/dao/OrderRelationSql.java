package com.itwill.order.dao;

public class OrderRelationSql {
	
	//주문시퀀스, 총 제품 수량, 총금액, 결재수단, 상태[1.배송중 2.배송완료 3.취소됨], 고객이메일
	public static String INSERT_ORDER = "Insert into Ord(oNo, oCnt, oAmount, oCharge, oSts, cEMail, aNo) " 
									+ "VALUES(ORD_ONO_SEQ.nextval, ?, ?, ?, ?, ?, ?)";
			
	public static String UPDATE_ORDER = "Update Ord " +
										"set oCnt =? , oAmount = ? , oCharge=? , oSts=?, cEmail=? " +
										"Where oNo = ?";
			
	public static String DELETE_ORDER = "Delete From Ord Where oNo = ?";
	
	
	
}
