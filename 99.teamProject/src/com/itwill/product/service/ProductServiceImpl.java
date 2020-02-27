package com.itwill.product.service;

import java.util.ArrayList;

import com.itwill.product.dao.ProductDaoImpl;
import com.itwill.product.dto.Product;

public class ProductServiceImpl implements ProductService {
	private static ProductServiceImpl _instance;
	ProductDaoImpl pdi;
	
	private ProductServiceImpl() throws Exception {
		pdi = new ProductDaoImpl();
	}
	
	public static ProductServiceImpl getProductService() throws Exception {
		if(_instance==null) {
			_instance = new ProductServiceImpl();
		}
		return _instance;
	}

	@Override
	public ArrayList<Product> getProductList() throws Exception {
		return pdi.selectAll();
	}

	@Override
	public Product getProductDetail(int pNO) throws Exception {
		return pdi.selectKey(pNO);
	}

	@Override
	public int setProduct(Product prod) throws Exception {
		return pdi.create(prod);
	}

}
