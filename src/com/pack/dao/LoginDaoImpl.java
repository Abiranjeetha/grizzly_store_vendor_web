package com.pack.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.pack.JdbcConnection;
import com.pack.model.vendor;

public class LoginDaoImpl implements LoginDao {

	public LoginDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean checkLogin(vendor v) {
		// TODO Auto-generated method stub
		Connection con=null;
		boolean ret=false;
		try
		{
			con=JdbcConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("select userid,password from vendor where userid=? and password=?");
			ps.setInt(1, v.getUserid());
			ps.setString(2, v.getPassword());
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				ret=true;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return ret;
	}

	@Override
	public int getCount(vendor v) {
		// TODO Auto-generated method stub
		Connection con=null;
		int i=0;
		try
		{
			con=JdbcConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("select count from vendor where userid=?");
			ps.setInt(1, v.getUserid());
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				i=rs.getInt(1);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return i;
	}

	@Override
	public String getUsername(vendor v) {
		// TODO Auto-generated method stub
		Connection con=null;
		String str=null;
		try
		{
			con=JdbcConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("select username from vendor where userid=?");
			ps.setInt(1, v.getUserid());
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				str=rs.getString(1);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return str;
	}

	@Override
	public float getRating(vendor v) {
		// TODO Auto-generated method stub
		Connection con=null;
		float f=0;
		try
		{
			con=JdbcConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("select rating from vendor where userid=?");
			ps.setInt(1, v.getUserid());
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				f=rs.getFloat(1);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return f;
	}

	@Override
	public String getContact(vendor v) {
		// TODO Auto-generated method stub
		Connection con=null;
		String str=null;
		try
		{
			con=JdbcConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("select contact from vendor where userid=?");
			ps.setInt(1, v.getUserid());
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				str=rs.getString(1);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return str;
	}

	@Override
	public String getAddress(vendor v) {
		// TODO Auto-generated method stub
		Connection con=null;
		String str=null;
		try
		{
			con=JdbcConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("select address from vendor where userid=?");
			ps.setInt(1, v.getUserid());
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				str=rs.getString(1);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return str;
	}

	@Override
	public int setZeroCount(vendor v) {
		// TODO Auto-generated method stub
		Connection con=null;
		int j=0;
		try
		{
			con=JdbcConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("update vendor set count=0 where userid=?");
			ps.setInt(1, v.getUserid());
			j=ps.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return j;
	}

	@Override
	public int incrementCount(vendor v, int i) {
		// TODO Auto-generated method stub
		Connection con=null;
		int j=0;
		try
		{
			con=JdbcConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("update vendor set count=? where userid=?");
			ps.setInt(1, i+1);
			ps.setInt(2, v.getUserid());
			j=ps.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return j;
	}

}
