package com.chanmei.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.chanmei.service.Userservice;

@Controller
@RequestMapping("/test")
public class text {
	
	@Autowired
	private Userservice userservice;
	
	@RequestMapping(value = "/look/{account}",method = RequestMethod.GET)
	private String look(@PathVariable String account) {
		System.out.println(userservice.getUserId(account));
		return "test";
	}
}
