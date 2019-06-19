package com.pack.model;

public class vendors {
	private String pname;
	private int id;
	private int stock;
	private int req;
	private int buffer;
	private int price;
	private int pending;
	private float rating;
	public vendors() {
		// TODO Auto-generated constructor stub
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getReq() {
		return req;
	}
	public void setReq(int req) {
		this.req = req;
	}
	public int getBuffer() {
		return buffer;
	}
	public void setBuffer(int buffer) {
		this.buffer = buffer;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPending() {
		return pending;
	}
	public void setPending(int pending) {
		this.pending = pending;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public vendors(String pname, int id, int stock, int req, int buffer, int price, int pending, float rating) {
		super();
		this.pname = pname;
		this.id = id;
		this.stock = stock;
		this.req = req;
		this.buffer = buffer;
		this.price = price;
		this.pending = pending;
		this.rating = rating;
	}

}
