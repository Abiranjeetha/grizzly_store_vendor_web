package com.pack.model;

public class vendor {
	private int userid;
	private String username;
	private String password;
	private float rating;
	private String contact;
	private String address;
	private int count;
	public vendor() {
		// TODO Auto-generated constructor stub
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public vendor(int userid, String password) {
		super();
		this.userid = userid;
		this.password = password;
	}
	public vendor(int userid, String username, String password, float rating, String contact, String address,
			int count) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.rating = rating;
		this.contact = contact;
		this.address = address;
		this.count = count;
	}
	
}
