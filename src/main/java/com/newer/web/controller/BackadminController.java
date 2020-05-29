package com.newer.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.HtmlUtils;

import com.newer.domain.Backadmin;
import com.newer.domain.Result;
import com.newer.service.BackadminService;

@RestController
public class BackadminController {

	@Autowired
	private BackadminService backadminService;

	@RequestMapping("/login")
	public Result login(@RequestBody Backadmin backadmin, HttpSession session) {
		String adminname = backadmin.getAdminname();
		adminname = HtmlUtils.htmlEscape(adminname);

		Backadmin Backadmins = backadminService.selectBackadmin(adminname, backadmin.getPassword());
		if (Backadmins != null) {
			session.setAttribute("Backadmins", Backadmins);
			return new Result(200);
		} else {
			return new Result(400);
		}
	}

}
