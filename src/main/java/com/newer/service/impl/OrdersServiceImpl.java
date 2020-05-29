package com.newer.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.newer.dao.OrdersMapper;
import com.newer.domain.Orders;
import com.newer.dto.OrdersDto;
import com.newer.service.OrdersService;

import tk.mybatis.mapper.entity.Example;

@Service
public class OrdersServiceImpl implements OrdersService{
	@Autowired
	private OrdersMapper ordersMapper;

	@Override
	public List<Orders> find() {
		List<Orders> orders=this.ordersMapper.selectAll();
		return orders;
	}

	@Override
	public boolean save(Orders orders) {
		return this.ordersMapper.insertSelective(orders)>0?true:false;
	}

	@Override
	public boolean update(Orders orders) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");//设置日期格式
		orders.setTrackingnumber(sdf.format(new Date()));
		orders.setDeliverytime(new Date());;
		return this.ordersMapper.updateByPrimaryKeySelective(orders)>0?true:false;
		}

	@Override
	public boolean delete(Integer id) {
		return this.ordersMapper.deleteByPrimaryKey(id)>0?true:false;
	}

	@Override
	public PageInfo<Orders> pagecheck(OrdersDto ordersDto) {
		PageHelper.startPage(ordersDto.getPage(), ordersDto.getPageSize());
		Example example=new Example(Orders.class);
		if (ordersDto.getKey()!=null) {
			example.createCriteria().andLike("orderId","%"+ordersDto.getKey()+"%");			
		}if (ordersDto.getKey()!=null) {
			example.createCriteria().andLike("trackingnumber","%"+ordersDto.getKey()+"%");			
		}
		List<Orders> list=this.ordersMapper.selectByExample(example);
		PageInfo<Orders> pageInfo=new PageInfo<Orders>(list);
		return pageInfo;
	}

	
}
