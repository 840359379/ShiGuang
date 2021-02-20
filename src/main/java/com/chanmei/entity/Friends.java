package com.chanmei.entity;

//¹Ø×¢

public class Friends {
	private String account;
	private String name;
	private String accountcover;
	private String namecover;
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
	public String getAccountcover() {
		return accountcover;
	}
	public void setAccountcover(String accountcover) {
		this.accountcover = accountcover;
	}
	public String getNamecover() {
		return namecover;
	}
	public void setNamecover(String namecover) {
		this.namecover = namecover;
	}
	public Friends(String account, String name, String accountcover, String namecover) {
		super();
		this.account = account;
		this.name = name;
		this.accountcover = accountcover;
		this.namecover = namecover;
	}
	public Friends() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "friends [account=" + account + ", name=" + name + ", accountcover=" + accountcover + ", namecover="
				+ namecover + "]";
	}
	
}
