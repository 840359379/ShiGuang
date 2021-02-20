package com.chanmei.entity;

import java.sql.Timestamp;

//ÆÀÂÛ

public class Discuss {
	private String account;
	private String name;
	private String shareid;
	private Timestamp establish;
	private String content;
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShareid() {
		return shareid;
	}
	public void setShareid(String shareid) {
		this.shareid = shareid;
	}
	public Timestamp getEstablish() {
		return establish;
	}
	public void setEstablish(Timestamp establish) {
		this.establish = establish;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "Discuss [account=" + account + ", name=" + name + ", shareid=" + shareid + ", establish=" + establish
				+ ", content=" + content + "]";
	}
	public Discuss(String account, String name, String shareid, Timestamp establish, String content) {
		super();
		this.account = account;
		this.name = name;
		this.shareid = shareid;
		this.establish = establish;
		this.content = content;
	}
	
	public Discuss() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
