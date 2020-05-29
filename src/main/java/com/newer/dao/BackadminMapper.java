package com.newer.dao;



import org.apache.ibatis.annotations.Select;

import com.newer.domain.Backadmin;

import tk.mybatis.mapper.common.Mapper;


public interface BackadminMapper extends Mapper<Backadmin>{

	@Select("select * from backadmin where adminname=#{adminname}")
	// 登录
	public Backadmin selectBackadmin(String adminname);

//	// 查询管理员信息
//	public List<Backadmin> listBackuser();
//
//	public List<Backadmin> findBackadminByName(String name);
//
//	// 添加管理员
//	public int insterBackadmin(Backadmin backadmin);
//
//	// 删除管理员信息
//	public int delectBackadmin(int backadmin);
//
//	// 修改管理员信息
//	public int updateBackadmin(Backadmin backadmin);

}
