package com.itwill.order.dao;

public class OrderService {
	public static OrderService _getInstance=null;
	private OrderDao orderDao=null;
	private OrderService() {
		orderDao = new OrderDao();
	}
	public static OrderService getInstance(){
		if(_getInstance==null) {
			_getInstance = new OrderService();
		}
		return _getInstance;
	}
	
	
}
