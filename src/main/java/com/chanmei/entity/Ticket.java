package com.chanmei.entity;

import java.sql.Timestamp;

//√≈∆±

public class Ticket {
	private String account;
	private String ticketid;
	private String activityid;
	private int price;
	private float discount;
	private Timestamp establish;
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getTicketid() {
		return ticketid;
	}
	public void setTicketid(String ticketid) {
		this.ticketid = ticketid;
	}
	public String getActivityid() {
		return activityid;
	}
	public void setActivityid(String activityid) {
		this.activityid = activityid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	public Timestamp getEstablish() {
		return establish;
	}
	public void setEstablish(Timestamp establish) {
		this.establish = establish;
	}
	public Ticket(String account, String ticketid, String activityid, int price, float discount, Timestamp establish) {
		super();
		this.account = account;
		this.ticketid = ticketid;
		this.activityid = activityid;
		this.price = price;
		this.discount = discount;
		this.establish = establish;
	}
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Ticket [account=" + account + ", ticketid=" + ticketid + ", activityid=" + activityid + ", price="
				+ price + ", discount=" + discount + ", establish=" + establish + "]";
	}
	
}
