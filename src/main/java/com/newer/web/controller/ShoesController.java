package com.newer.web.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageInfo;
import com.newer.domain.Shoes;
import com.newer.dto.MsgDto;
import com.newer.dto.ShoesDto;
import com.newer.service.ShoesService;

@RestController
@RequestMapping("/shoes")
public class ShoesController {
    @Autowired
    private ShoesService shoesService;
    
    @RequestMapping("/find")
    public List<Shoes> find(){
    	return shoesService.find();
    }
   
    @RequestMapping("/saveupload")
	public String saveupload(Shoes shoes,MultipartFile img,HttpSession session) throws IllegalStateException, IOException {
    	String path="images";
		if(img!=null && !"".equals(img.getOriginalFilename())) {
			 
			String oldName=img.getOriginalFilename();
			 
			String ext=oldName.substring(oldName.lastIndexOf("."));
		 
			String newName=UUID.randomUUID()+ext;
			 
			String realpath= session.getServletContext().getRealPath("images")+"/"+newName;
		 
			img.transferTo(new File(realpath));
			System.out.println(path+"/"+newName);
			return path+"/"+newName;
		}
		return null;	
	}
    @RequestMapping("/save")
	public MsgDto save(Shoes shoes) {
		boolean bool= this.shoesService.save(shoes);
   		if (bool) {
   			return new MsgDto(true,"添加成功");
   		} else {
   			return new MsgDto(true,"添加失败");
   		}
		
	}
    @RequestMapping("/updates")
   	public MsgDto update(Shoes shoes) {
   		boolean bool= this.shoesService.update(shoes);
   		if (bool) {
   			return new MsgDto(true,"修改成功");
   		} else {
   			return new MsgDto(true,"修改失败");
   		}
   	}
    @RequestMapping("/delete")
	public MsgDto delete(Integer id) {
    	boolean bool= this.shoesService.delete(id);
		if (bool) {
			return new MsgDto(true,"删除成功");
		} else {
			return new MsgDto(true,"删除失败");
		}
	}
    @RequestMapping("/pagecheck")
    public PageInfo<Shoes> pagecheck(ShoesDto shoesDto) {
    	PageInfo<Shoes> pagecheck= this.shoesService.pagecheck(shoesDto);
		return pagecheck;
	}
    @RequestMapping("/findid")
    public Shoes findid(String shoesid) {
    	return this.shoesService.findid(Integer.parseInt(shoesid));
    }
}
