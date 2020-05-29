package com.newer.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.newer.domain.Shippinginfo;
import com.newer.dto.ShippinginfoDto;


public interface ShippinginfoService {
	public List<Shippinginfo> find();
	public Shippinginfo findid(String shipid);
	public boolean save(Shippinginfo shippinginfo);
	
	public boolean update(Shippinginfo shippinginfo);
	
	public boolean delete(Integer id);
	
	public PageInfo<Shippinginfo> pagecheck(ShippinginfoDto shippinginfoDto);
}
