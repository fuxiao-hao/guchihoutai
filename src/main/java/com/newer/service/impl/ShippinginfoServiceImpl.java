package com.newer.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.newer.dao.ShippinginfoMapper;
import com.newer.domain.Shippinginfo;
import com.newer.dto.ShippinginfoDto;
import com.newer.service.ShippinginfoService;

import jdk.nashorn.internal.runtime.Undefined;
import tk.mybatis.mapper.entity.Example;
@Service
public class ShippinginfoServiceImpl implements ShippinginfoService{
	@Autowired
	private ShippinginfoMapper shippinginfoMapper;
	@Override
	public List<Shippinginfo> find() {
		List<Shippinginfo> shippinginfos=this.shippinginfoMapper.selectAll();
		return shippinginfos;
	}

	@Override
	public boolean save(Shippinginfo shippinginfo) {
		shippinginfo.setModifiedtime(new Date());
		return this.shippinginfoMapper.insert(shippinginfo)>0?true:false;
	}

	@Override
	public boolean update(Shippinginfo shippinginfo) {     
		shippinginfo.setModifiedtime(new Date());
		return this.shippinginfoMapper.updateByPrimaryKey(shippinginfo)>0?true:false;
	}

	@Override
	public boolean delete(Integer id) {
		return this.shippinginfoMapper.deleteByPrimaryKey(id)>0?true:false;
	}

	@Override
	public PageInfo<Shippinginfo> pagecheck(ShippinginfoDto shippinginfoDto) {
		PageHelper.startPage(shippinginfoDto.getPage(), shippinginfoDto.getPageSize());
		Example example=new Example(Shippinginfo.class);
		if (shippinginfoDto.getKey()!=null) {
			example.createCriteria().andLike("shipname","%"+shippinginfoDto.getKey()+"%");			
		}if (shippinginfoDto.getKey()!=null) {
			example.createCriteria().andLike("shipcontact","%"+shippinginfoDto.getKey()+"%");			
		}
		List<Shippinginfo> list=this.shippinginfoMapper.selectByExample(example);
		PageInfo<Shippinginfo> pageInfo=new PageInfo<Shippinginfo>(list);
		return pageInfo;
	}

	@Override
	public Shippinginfo findid(String shipid) {
		Example example=new Example(Shippinginfo.class);
		example.createCriteria().andEqualTo("shipid", shipid);
		return this.shippinginfoMapper.selectOneByExample(example);
	}
	
}
