package com.chanmei.dao;

import com.chanmei.entity.Commodity;

public interface CommodityDao {
	//查找
	Commodity findCommodityById(Integer commodityid);
	
	//根据活动名称查找
	Commodity findCommodityByName(String goods);
	
	//添加活动
	void addCommodity(Commodity commodity);
	
	//修改活动内容
	void updatCommodity(Commodity commodity);
	
	//删除活动
	void deleteCommodity(Commodity commodity);
}
