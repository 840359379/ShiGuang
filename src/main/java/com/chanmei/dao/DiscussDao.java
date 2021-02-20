package com.chanmei.dao;

import com.chanmei.entity.Discuss;

public interface DiscussDao {
	//查找
	Discuss findDiscussById(String account);
	
	//新增说说
	void addDiscuss(Discuss dsiDiscuss);
	
	//修改
	void updateDiscuss(Discuss discuss);
	
	//删除
	void deleteDiscuss(Discuss discuss);
}
