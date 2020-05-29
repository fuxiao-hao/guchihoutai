package com.newer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newer.dao.BackadminMapper;
import com.newer.domain.Backadmin;

@Service
public class BackadminService {

	@Autowired
	private BackadminMapper backadminMapper;

	public Backadmin selectBackadmin(String adminname,String password) {
		Backadmin backadmin = backadminMapper.selectBackadmin(adminname);
		if (backadmin != null&&backadmin.getPassword().equalsIgnoreCase(password))
			return backadmin;
		else
			return null;

	}

//	// 查询管理员信息
//	public List<Backadmin> listBackuser() {
//		return backadminMapper.listBackuser();
//	}
//
//	public List<Backadmin> findBackadminByName(String name) {
//		return backadminMapper.findBackadminByName(name);
//	}
//
//	// 添加管理员
//	public int insterBackadmin(Backadmin backadmin) {
//		return backadminMapper.insterBackadmin(backadmin);
//	}
//
//	// 删除管理员信息
//	public int delectBackadmin(int backadmin) {
//		return backadminMapper.delectBackadmin(backadmin);
//	}
//
//	// 修改管理员信息
//	public int updateBackadmin(Backadmin backadmin) {
//		return backadminMapper.updateBackadmin(backadmin);
//	}

}
