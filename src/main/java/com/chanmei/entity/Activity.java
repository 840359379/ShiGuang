package com.chanmei.entity;

import java.sql.Timestamp;

//»î¶¯

public class Activity {
	private String activityid;
	private String name;
	private String synopsis;
	private int quantity;
	private Timestamp start;
	private Timestamp finish;
	private int price;
	private String portrait;
	public String getActivityid() {
		return activityid;
	}
	public void setActivityid(String activityid) {
		this.activityid = activityid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSynopsis() {
		return synopsis;
	}
	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Timestamp getStart() {
		return start;
	}
	public void setStart(Timestamp start) {
		this.start = start;
	}
	public Timestamp getFinish() {
		return finish;
	}
	public void setFinish(Timestamp finish) {
		this.finish = finish;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPortrait() {
		return portrait;
	}
	public void setPortrait(String portrait) {
		this.portrait = portrait;
	}
	@Override
	public String toString() {
		return "Activity [activityid=" + activityid + ", name=" + name + ", synopsis=" + synopsis + ", quantity="
				+ quantity + ", start=" + start + ", finish=" + finish + ", price=" + price + ", portrait=" + portrait
				+ "]";
	}
	public Activity(String activityid, String name, String synopsis, int quantity, Timestamp start, Timestamp finish,
			int price, String portrait) {
		super();
		this.activityid = activityid;
		this.name = name;
		this.synopsis = synopsis;
		this.quantity = quantity;
		this.start = start;
		this.finish = finish;
		this.price = price;
		this.portrait = portrait;
	}
	public Activity() {
		super();
		// TODO Auto-generated constructor stub
	}
}
