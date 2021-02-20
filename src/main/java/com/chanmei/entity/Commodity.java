package com.chanmei.entity;

//…Ã∆∑±Ì

public class Commodity {
	private String commodityid;
	private String goods;
	private String synopsis;
	private int price;
	private String portrait;
	private String behind;
	public String getCommodityid() {
		return commodityid;
	}
	public void setCommodityid(String commodityid) {
		this.commodityid = commodityid;
	}
	public String getGoods() {
		return goods;
	}
	public void setGoods(String goods) {
		this.goods = goods;
	}
	public String getSynopsis() {
		return synopsis;
	}
	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
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
	public String getBehind() {
		return behind;
	}
	public void setBehind(String behind) {
		this.behind = behind;
	}
	public Commodity(String commodityid, String goods, String synopsis, int price, String portrait, String behind) {
		super();
		this.commodityid = commodityid;
		this.goods = goods;
		this.synopsis = synopsis;
		this.price = price;
		this.portrait = portrait;
		this.behind = behind;
	}
	public Commodity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Commodity [commodityid=" + commodityid + ", goods=" + goods + ", synopsis=" + synopsis + ", price="
				+ price + ", portrait=" + portrait + ", behind=" + behind + "]";
	}
	
}
