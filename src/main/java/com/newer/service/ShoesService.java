package com.newer.service;

import java.util.List;
import com.github.pagehelper.PageInfo;
import com.newer.domain.Shoes;
import com.newer.dto.ShoesDto;

public interface ShoesService {
	public List<Shoes> find();
	public Shoes findid(Integer shoesid);
	public boolean save(Shoes shoes);
	
	public boolean update(Shoes shoes);
	
	public boolean delete(Integer id);
	
	public PageInfo<Shoes> pagecheck(ShoesDto shoesDto);
}
