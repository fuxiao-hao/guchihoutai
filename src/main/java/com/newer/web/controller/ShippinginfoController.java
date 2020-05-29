package com.newer.web.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.github.pagehelper.PageInfo;
import com.newer.domain.Shippinginfo;
import com.newer.dto.MsgDto;
import com.newer.dto.ShippinginfoDto;
import com.newer.service.ShippinginfoService;

@RestController
@RequestMapping("/shippinginfo")
public class ShippinginfoController {
    @Autowired
    private ShippinginfoService shippinginfoService;
    
    @RequestMapping("/find")
    public List<Shippinginfo> find(){
    	return this.shippinginfoService.find();
    }
    @RequestMapping("/save")
	public MsgDto save(Shippinginfo shippinginfo) {
		boolean bool= this.shippinginfoService.save(shippinginfo);
		if (bool) {
			return new MsgDto(true,"添加成功");
		} else {
			return new MsgDto(true,"添加失败");
		}
	}
    @RequestMapping("/updates")
   	public MsgDto update(Shippinginfo shippinginfo) {
   		boolean bool= this.shippinginfoService.update(shippinginfo);
   		if (bool) {
   			return new MsgDto(true,"修改成功");
   		} else {
   			return new MsgDto(true,"修改失败");
   		}
   	}
    @RequestMapping("/delete")
	public MsgDto delete(Integer id) {
    	boolean bool= this.shippinginfoService.delete(id);
		if (bool) {
			return new MsgDto(true,"删除成功");
		} else {
			return new MsgDto(true,"删除失败");
		}
	}
    @RequestMapping("/pagecheck")
    public PageInfo<Shippinginfo> pagecheck(ShippinginfoDto shippinginfoDto) {
    	PageInfo<Shippinginfo> pagecheck= this.shippinginfoService.pagecheck(shippinginfoDto);
		return pagecheck;
	}
    @RequestMapping("/findid")
    public Shippinginfo findid(String shipid) {
    	return 	this.shippinginfoService.findid(shipid);
    }
}
