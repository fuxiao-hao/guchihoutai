package com.newer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.newer.dao.OrderdetailMapper;
import com.newer.domain.Orderdetail;
import com.newer.service.OrderdetailService;
@Service
public class OrderdetailServiceImpl implements OrderdetailService{
	@Autowired
	private OrderdetailMapper orderdetailMapper;
	@Override
	public List<Orderdetail> find() {
		List<Orderdetail> orderdetails=this.orderdetailMapper.selectAll();
		return orderdetails;
	}

	@Override
	public boolean save(Orderdetail orderdetail) {
		return this.orderdetailMapper.insert(orderdetail)>0?true:false;
	}

	@Override
	public boolean update(Orderdetail orderdetail) {
		return this.orderdetailMapper.updateByPrimaryKey(orderdetail)>0?true:false;
	}

	@Override
	public boolean delete(Integer id) {
		return this.orderdetailMapper.deleteByPrimaryKey(id)>0?true:false;
	}

	
}
