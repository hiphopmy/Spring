package com.itwill.address.dto;

import com.itwill.customer.dto.Customer;

public class Address {
	private int aNo; 
	private String aName;
	private String address;
	private String aPhone;
	private Customer cEmail;
	
	public Address() {
	}

	public Address(int aNo, String aName, String address, String aPhone, Customer cEmail) {
		this.aNo = aNo;
		this.aName = aName;
		this.address = address;
		this.aPhone = aPhone;
		this.cEmail = cEmail;
	}
	
	
	
	public int getaNo() {
		return aNo;
	}

	public void setaNo(int aNo) {
		this.aNo = aNo;
	}

	public String getaName() {
		return aName;
	}

	public void setaName(String aName) {
		this.aName = aName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getaPhone() {
		return aPhone;
	}

	public void setaPhone(String aPhone) {
		this.aPhone = aPhone;
	}

	public Customer getcEmail() {
		return cEmail;
	}

	public void setcEmail(Customer cEmail) {
		this.cEmail = cEmail;
	}

	@Override
	public String toString() {
		return "Address [aNo=" + aNo + ", aName=" + aName + ", address=" + address + ", aPhone=" + aPhone + "]\n";
	}
	
	
	

}
