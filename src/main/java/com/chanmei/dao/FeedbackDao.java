package com.chanmei.dao;

import com.chanmei.entity.Feedback;

public interface FeedbackDao {
	//查找
	Feedback findFeedbackById(Integer feedbackid);
	
	//根据名称查找
	Feedback findFeedbackByName(String account);
	
	//新增反馈
	void addFeedback(Feedback feedback);
	
	//修改
	void updateFeedback(Feedback feedback);
	
	//删除
	void deleteFeedback(Feedback feedback);
}
