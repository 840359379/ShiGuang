package com.chanmei.dao;

import com.chanmei.entity.Administrators;
import com.chanmei.entity.User;

public interface AdministratorsDao {
	//查找
	Administrators findAdministratorsByAccount(String account);
	
	//根据管理员名称和密码查找
	Administrators findAdministratorsByNameAndPassword(String name,String password);
	
	//修改管理员
	void updateAdministrators(Administrators administrators);
	
	//修改用户
	void updateAdministratorsUser(User user);
	
	//删除用户
	void deleteAdministratorsUser(String account);
}
