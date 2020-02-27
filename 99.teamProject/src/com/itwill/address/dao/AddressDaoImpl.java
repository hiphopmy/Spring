package com.itwill.address.dao;

import java.util.ArrayList;

import com.itwill.db.RdbmsDao;
import com.itwill.db.dao.InterfaceDao;
import com.itwill.product.dto.Product;

public class AddressDaoImpl extends RdbmsDao implements InterfaceDao{

	
	
	@Override
	public int create(Product prod) throws Exception {
		
		return 0;
	}

	@Override
	public int update(Product prod) throws Exception {
		return 0;
	}

	@Override
	public int delete(int pNO) throws Exception {
		return 0;
	}

	@Override
	public ArrayList<Product> selectAll() throws Exception {
		return null;
	}

	@Override
	public Product selectKey(int pNO) throws Exception {
		return null;
	}

}
