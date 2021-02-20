package com.chanmei.dao;

import com.chanmei.entity.Activity;

public interface ActivityDao {
	//查找
	Activity findActivityById(Integer activityid);
	
	//新增活动
	void addActivity(Activity activity);
	
	//修改活动
	void updateActivity(Activity activity);
	
	//删除活动
	void deleteActivity(Activity activity);

}
