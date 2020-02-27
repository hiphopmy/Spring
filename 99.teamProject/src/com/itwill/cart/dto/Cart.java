package com.itwill.cart.dto;

public class Cart {
	private int cNo;
	private int cQty;
	private int cPrice;
	private int pNo;
	private String cEmail;
	
	public Cart() {
		
	}

	public Cart(int cNo, int cQty, int cPrice, int pNo, String cEmail) {
		super();
		this.cNo = cNo;
		this.cQty = cQty;
		this.cPrice = cPrice;
		this.pNo = pNo;
		this.cEmail = cEmail;
	}

	public int getcNo() {
		return cNo;
	}

	public void setcNo(int cNo) {
		this.cNo = cNo;
	}

	public int getcQty() {
		return cQty;
	}

	public void setcQty(int cQty) {
		this.cQty = cQty;
	}

	public int getcPrice() {
		return cPrice;
	}

	public void setcPrice(int cPrice) {
		this.cPrice = cPrice;
	}

	public int getpNo() {
		return pNo;
	}

	public void setpNo(int pNo) {
		this.pNo = pNo;
	}

	public String getcEmail() {
		return cEmail;
	}

	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}

	@Override
	public String toString() {
		return "Cart [cNo=" + cNo + ", cQty=" + cQty + ", cPrice=" + cPrice + ", pNo=" + pNo + ", cEmail=" + cEmail
				+ "]";
	}
	
	

}
