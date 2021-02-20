package com.chanmei.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chanmei.dao.Userdao;
import com.chanmei.entity.User;
import com.chanmei.service.Userservice;

@Service
public class Userserviceimol implements Userservice{
	
	@Autowired
	private Userdao userdao;
	
	@Override
	public User getUserId(String account) {
		return userdao.queryUserId(account);
	}
}
