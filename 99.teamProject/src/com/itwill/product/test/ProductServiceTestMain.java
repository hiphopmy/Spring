package com.itwill.product.test;

import java.util.ArrayList;

import com.itwill.product.dto.Product;
import com.itwill.product.service.ProductServiceImpl;

public class ProductServiceTestMain {

	public static void main(String[] args) {
		try {
			ArrayList<Product> prodList = ProductServiceImpl.getProductService().getProductList();
			for (Product product : prodList) {
				System.out.println(product.toString());
			}
		} catch (Exception e) {
			System.out.println("null");
			e.printStackTrace();
		}
		
	}

}
