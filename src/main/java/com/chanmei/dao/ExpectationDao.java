package com.chanmei.dao;

import com.chanmei.entity.Expectationid;

public interface ExpectationDao {
	//查找
	Expectationid findExpectationidById(Integer expectionid);
	
	//根据账户和名称查找
	Expectationid findExpectationidByAccountAndName(String account,String name);
	
	//修改
	void updateExpection(Expectationid expectationid);
	
	//删除
	void deleteExpecion(Expectationid expectationid);
}
