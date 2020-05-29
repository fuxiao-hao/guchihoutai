package com.newer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.newer.dao.ShoesMapper;
import com.newer.domain.Shippinginfo;
import com.newer.domain.Shoes;
import com.newer.dto.ShoesDto;
import com.newer.service.ShoesService;

import tk.mybatis.mapper.entity.Example;
@Service
public class ShoesServiceImpl implements ShoesService{
	@Autowired
	private ShoesMapper shoesMapper;

	@Override
	public List<Shoes> find() {
		List<Shoes> shoes=this.shoesMapper.selectAll();
		return shoes;
		}

	@Override
	public boolean save(Shoes shoes) {
		return this.shoesMapper.insertSelective(shoes)>0?true:false;
	}

	@Override
	public boolean update(Shoes shoes) {
		return this.shoesMapper.updateByPrimaryKeySelective(shoes)>0?true:false;
	}

	@Override
	public boolean delete(Integer id) {
		return this.shoesMapper.deleteByPrimaryKey(id)>0?true:false;
	}

	@Override
	public PageInfo<Shoes> pagecheck(ShoesDto shoesDto) {
		PageHelper.startPage(shoesDto.getPage(), shoesDto.getPageSize());
		Example example=new Example(Shoes.class);
		if (shoesDto.getKey()!=null) {
			example.createCriteria().andLike("shoesname","%"+shoesDto.getKey()+"%");			
			example.createCriteria().andLike("status","%"+shoesDto.getKey()+"%");			
		}
		List<Shoes> list=this.shoesMapper.selectByExample(example);
		PageInfo<Shoes> pageInfo=new PageInfo<Shoes>(list);
		return pageInfo;
	}

	@Override
	public Shoes findid(Integer shoesid) {
		Example example=new Example(Shoes.class);
		example.createCriteria().andEqualTo("shoesid", shoesid);
		return this.shoesMapper.selectOneByExample(example);
	}

	
}
