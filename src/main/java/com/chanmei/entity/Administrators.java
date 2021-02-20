package com.chanmei.entity;

//π‹¿Ì‘±

public class Administrators {
	private String account;
	private String name;
	private String password;
	private String phone;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Administrators [account=" + account + ", name=" + name + ", password=" + password + ", phone=" + phone
				+ "]";
	}
	public Administrators() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Administrators(String account, String name, String password, String phone) {
		super();
		this.account = account;
		this.name = name;
		this.password = password;
		this.phone = phone;
	}
	
}
