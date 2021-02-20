package com.chanmei.entity;

//·´À¡

public class Feedback {
	private String feedbackid;
	private String account;
	private String content;
	private String shareid;
	public String getFeedbackid() {
		return feedbackid;
	}
	public void setFeedbackid(String feedbackid) {
		this.feedbackid = feedbackid;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getShareid() {
		return shareid;
	}
	public void setShareid(String shareid) {
		this.shareid = shareid;
	}
	public Feedback(String feedbackid, String account, String content, String shareid) {
		super();
		this.feedbackid = feedbackid;
		this.account = account;
		this.content = content;
		this.shareid = shareid;
	}
	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Feedbackid [feedbackid=" + feedbackid + ", account=" + account + ", content=" + content + ", shareid="
				+ shareid + "]";
	}
	
}
