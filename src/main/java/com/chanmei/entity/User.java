package com.chanmei.entity;

import java.sql.Date;

//”√ªß

public class User {
	private String account;
	private String password;
	private String name;
	private Date phone;
	private String establish;
	private String condition;
	private int vip;
	private String portrait;
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getPhone() {
		return phone;
	}
	public void setPhone(Date phone) {
		this.phone = phone;
	}
	public String getEstablish() {
		return establish;
	}
	public void setEstablish(String establish) {
		this.establish = establish;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public int getVip() {
		return vip;
	}
	public void setVip(int vip) {
		this.vip = vip;
	}
	public String getPortrait() {
		return portrait;
	}
	public void setPortrait(String portrait) {
		this.portrait = portrait;
	}
	public User(String account, String password, String name, Date phone, String establish, String condition, int vip,
			String portrait) {
		super();
		this.account = account;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.establish = establish;
		this.condition = condition;
		this.vip = vip;
		this.portrait = portrait;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [account=" + account + ", password=" + password + ", name=" + name + ", phone=" + phone
				+ ", establish=" + establish + ", condition=" + condition + ", vip=" + vip + ", portrait=" + portrait
				+ "]";
	}
	
}
