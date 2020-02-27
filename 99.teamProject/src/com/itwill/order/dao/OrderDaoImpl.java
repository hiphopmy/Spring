package com.itwill.order.dao;

import java.util.ArrayList;

import com.itwill.order.dto.OrderDTO;

public interface OrderDaoImpl {
	public int InsertOrder(OrderDTO order); 
	public int UpdateOrder(int oNo);
	public int deleteOrder(int oNo);
	public OrderDTO findOrder(int oNo);
	public ArrayList<OrderDTO> entireOrderList();
	
	
}
