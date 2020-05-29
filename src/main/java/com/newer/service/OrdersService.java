package com.newer.service;

import java.util.List;
import com.github.pagehelper.PageInfo;
import com.newer.domain.Orders;
import com.newer.dto.OrdersDto;

public interface OrdersService {
	public List<Orders> find();

	public boolean save(Orders orders);
	
	public boolean update(Orders orders);
	
	public boolean delete(Integer id);
	
	public PageInfo<Orders> pagecheck(OrdersDto ordersDto);
}
