package com.chanmei.dao;

import com.chanmei.entity.Friends;

public interface FriendsDao {
	//根据用户名和账号查找
	Friends findFriendsByName(String account, String name);
	
	//新增粉丝
	void addFriends(Friends friends);
	
	//修改
	void updateFriends(Friends friends);
	
	//删除
	void deleteFriends(Friends friends);
	
}
