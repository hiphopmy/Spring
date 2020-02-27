package com.itwill.order.dto; 

import java.util.Date;

public class OrderDTO {
	private int oNo;
	private int oCnt;
	private int oAmount;
	private String ChargeWay;
	private int oSts;
	private Date oDate;
	private String cEmail;
	private int aNo;
	
	public int getoNo() {
		return oNo;
	}
	public void setoNo(int oNo) {
		this.oNo = oNo;
	}
	public int getoCnt() {
		return oCnt;
	}
	public void setoCnt(int oCnt) {
		this.oCnt = oCnt;
	}
	public int getoAmount() {
		return oAmount;
	}
	public void setoAmount(int oAmount) {
		this.oAmount = oAmount;
	}
	public String getChargeWay() {
		return ChargeWay;
	}
	public void setChargeWay(String chargeWay) {
		ChargeWay = chargeWay;
	}
	public int getoSts() {
		return oSts;
	}
	public void setoSts(int oSts) {
		this.oSts = oSts;
		
	}
	public Date getDate() {
		return oDate;
	}
	public String getcEmail() {
		return cEmail;
	}
	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}
	public int getaNo() {
		return aNo;
	}
	public void setaNo(int aNo) {
		this.aNo = aNo;
	}
	
	
	
	
}
