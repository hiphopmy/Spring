package com.itwill.etc.dto;

import java.util.Date;

public class Board {
	private int bNo;
	private String bTitle;
	private String bContent;
	private Date bDate;
	private String cEmail;
	
	public Board() {
		// TODO Auto-generated constructor stub
	}

	public Board(int bNo, String bTitle, String bContent, Date bDate, String cEmail) {
		super();
		this.bNo = bNo;
		this.bTitle = bTitle;
		this.bContent = bContent;
		this.bDate = bDate;
		this.cEmail = cEmail;
	}

	public int getbNo() {
		return bNo;
	}

	public void setbNo(int bNo) {
		this.bNo = bNo;
	}

	public String getbTitle() {
		return bTitle;
	}

	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}

	public String getbContent() {
		return bContent;
	}

	public void setbContent(String bContent) {
		this.bContent = bContent;
	}

	public Date getbDate() {
		return bDate;
	}

	public void setbDate(Date bDate) {
		this.bDate = bDate;
	}

	public String getcEmail() {
		return cEmail;
	}

	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}

	@Override
	public String toString() {
		return "EctDTO [bNo=" + bNo + ", bTitle=" + bTitle + ", bContent=" + bContent + ", bDate=" + bDate + ", cEmail="
				+ cEmail + "]";
	}
	
	
}
