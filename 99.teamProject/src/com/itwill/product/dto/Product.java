package com.itwill.product.dto;

public class Product {
	private int pNO;
	private String pName;
	private String pDesc;
	private int pPrice;
	private double pPoint;
	private int pStockQty;
	private String pUnit;
	
	
	public Product() {}

	public Product(int pNO, String pName, String pDesc, int pPrice, double pPoint, int pStockQty, String pUnit) {
		this.pNO = pNO;
		this.pName = pName;
		this.pDesc = pDesc;
		this.pPrice = pPrice;
		this.pPoint = pPoint;
		this.pStockQty = pStockQty;
		this.pUnit = pUnit;
	}

	public int getpNO() {
		return pNO;
	}
	public void setpNO(int pNO) {
		this.pNO = pNO;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpDesc() {
		return pDesc;
	}
	public void setpDesc(String pDesc) {
		this.pDesc = pDesc;
	}
	public int getpPrice() {
		return pPrice;
	}
	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}
	public double getpPoint() {
		return pPoint;
	}
	public void setpPoint(double pPoint) {
		this.pPoint = pPoint;
	}
	public int getpStockQty() {
		return pStockQty;
	}
	public void setpStockQty(int pStockQty) {
		this.pStockQty = pStockQty;
	}
	public String getpUnit() {
		return pUnit;
	}
	public void setpUnit(String pUnit) {
		this.pUnit = pUnit;
	}
	
	@Override
	public String toString() {
		return "Product [pNO=" + pNO + ", pName=" + pName + ", pDesc=" + pDesc + ", pPrice=" + pPrice + ", pPoint="
				+ pPoint + ", pStockQty=" + pStockQty + ", pUnit=" + pUnit + "]";
	}
	
	
	
}
