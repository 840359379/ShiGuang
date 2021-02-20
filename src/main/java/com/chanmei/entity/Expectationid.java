package com.chanmei.entity;

import java.sql.Timestamp;

//ÆÚÅÎ

public class Expectationid {
	private String expectationid;
	private String account;
	private String name;
	private Timestamp establish;
	private String content;
	public String getExpectationid() {
		return expectationid;
	}
	public void setExpectationid(String expectationid) {
		this.expectationid = expectationid;
	}
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
	public Expectationid(String expectationid, String account, String name, Timestamp establish, String content) {
		super();
		this.expectationid = expectationid;
		this.account = account;
		this.name = name;
		this.establish = establish;
		this.content = content;
	}
	public Expectationid() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Expectationid [expectationid=" + expectationid + ", account=" + account + ", name=" + name
				+ ", establish=" + establish + ", content=" + content + "]";
	}
	
}
