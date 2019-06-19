package com.pack.service;

import com.pack.dao.LoginDaoImpl;
import com.pack.model.vendor;

public class LoginServiceImpl implements LoginService {

	public LoginServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean checkLogin(vendor v) {
		// TODO Auto-generated method stub
		return new LoginDaoImpl().checkLogin(v);
	}

	@Override
	public int getCount(vendor v) {
		// TODO Auto-generated method stub
		return new LoginDaoImpl().getCount(v);
	}

	@Override
	public String getUsername(vendor v) {
		// TODO Auto-generated method stub
		return new LoginDaoImpl().getUsername(v);
	}

	@Override
	public float getRating(vendor v) {
		// TODO Auto-generated method stub
		return new LoginDaoImpl().getRating(v);
	}

	@Override
	public String getContact(vendor v) {
		// TODO Auto-generated method stub
		return new LoginDaoImpl().getContact(v);
	}

	@Override
	public String getAddress(vendor v) {
		// TODO Auto-generated method stub
		return new LoginDaoImpl().getAddress(v);
	}

	@Override
	public int setZeroCount(vendor v) {
		// TODO Auto-generated method stub
		return new LoginDaoImpl().setZeroCount(v);
	}

	@Override
	public int incrementCount(vendor v,int i) {
		// TODO Auto-generated method stub
		return new LoginDaoImpl().incrementCount(v,i);
	}

}
