package com.chanmei.dao;

import com.chanmei.entity.Share;

public interface ShareDao {
	//查找
	Share findShareById(Integer shareid);
	
	//新增说说
	void addShare(Share share);
	
	//修改说说
	void updateShare(Share share);
	
	//删除
	void deleteShare(Share share);
}
