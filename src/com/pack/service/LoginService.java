package com.pack.service;

import com.pack.model.vendor;

public interface LoginService {
	public boolean checkLogin(vendor v);
	public int getCount(vendor v);
	public String getUsername(vendor v);
	public float getRating(vendor v);
	public String getContact(vendor v);
	public String getAddress(vendor v);
	public int setZeroCount(vendor v);
	public int incrementCount(vendor v,int i);
}
