package com.chanmei.entity;

import java.sql.Timestamp;

//˵˵

public class Share {
	private String shareid;
	private String account;
	private Timestamp establish;
	private String condition;
	private String activityid;
	private String title;
	private String content;
	public String getShareid() {
		return shareid;
	}
	public void setShareid(String shareid) {
		this.shareid = shareid;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public Timestamp getEstablish() {
		return establish;
	}
	public void setEstablish(Timestamp establish) {
		this.establish = establish;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public String getActivityid() {
		return activityid;
	}
	public void setActivityid(String activityid) {
		this.activityid = activityid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Share(String shareid, String account, Timestamp establish, String condition, String activityid, String title,
			String content) {
		super();
		this.shareid = shareid;
		this.account = account;
		this.establish = establish;
		this.condition = condition;
		this.activityid = activityid;
		this.title = title;
		this.content = content;
	}
	public Share() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Share [shareid=" + shareid + ", account=" + account + ", establish=" + establish + ", condition="
				+ condition + ", activityid=" + activityid + ", title=" + title + ", content=" + content + "]";
	}
	
}
