package com.chanmei.dao;

import com.chanmei.entity.User;

public interface Userdao {
	//查找
	User queryUserId(String account);

	//根据用户名和密码查找
    User findUserByNameAndPassword(String name, String password);

	//注册
    void addUser(User user);

    //修改
    void updateUser(User user);

    //删除
    void deleteUser(String account);
	
}
