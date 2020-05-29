package com.newer.service;

import java.util.List;
import com.newer.domain.Orderdetail;

public interface OrderdetailService {
	public List<Orderdetail> find();

	public boolean save(Orderdetail orderdetail);
	
	public boolean update(Orderdetail orderdetail);
	
	public boolean delete(Integer id);
}
