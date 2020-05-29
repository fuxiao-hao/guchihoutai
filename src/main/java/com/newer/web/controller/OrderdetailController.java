package com.newer.web.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.newer.domain.Orderdetail;
import com.newer.dto.MsgDto;
import com.newer.service.OrderdetailService;

@RestController
@RequestMapping("/orderdetail")
public class OrderdetailController {
    @Autowired
    private OrderdetailService orderdetailService;
    
    @RequestMapping("/find")
    public List<Orderdetail> find(){
    	return orderdetailService.find();
    }
   
    @RequestMapping("/save")
	public MsgDto save(Orderdetail orderdetail) {
		boolean bool= this.orderdetailService.save(orderdetail);
		if (bool) {
			return new MsgDto(true,"添加成功");
		} else {
			return new MsgDto(true,"添加失败");
		}
	}
    @RequestMapping("/update")
   	public MsgDto update(Orderdetail orderdetail) {
   		boolean bool= this.orderdetailService.update(orderdetail);
   		if (bool) {
   			return new MsgDto(true,"修改成功");
   		} else {
   			return new MsgDto(true,"修改失败");
   		}
   	}
    @RequestMapping("/delete")
	public MsgDto delete(Integer id) {
    	boolean bool= this.orderdetailService.delete(id);
		if (bool) {
			return new MsgDto(true,"删除成功");
		} else {
			return new MsgDto(true,"删除失败");
		}
	}
    
}
