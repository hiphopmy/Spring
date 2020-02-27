package com.itwill.product.service;

import java.util.ArrayList;

import com.itwill.product.dto.Product;

public interface ProductService {

	ArrayList<Product> getProductList() throws Exception;
	
	Product getProductDetail(int pNO) throws Exception;
	
	int setProduct(Product prod) throws Exception;
	
	
}
