package com.pack.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.pack.model.vendor;
import com.pack.service.LoginServiceImpl;

/**
 * Servlet implementation class LoginController
 */
//@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		int id=Integer.parseInt(request.getParameter("userid"));
		String password=request.getParameter("password");
		vendor v=new vendor(id,password);
		boolean val=new LoginServiceImpl().checkLogin(v);
		if(val)
		{
			pw.println("Login Succesfull");
			int i=new LoginServiceImpl().getCount(v);
			pw.println(i);
			if(i==3)
			{
				pw.println("Attempt locked!!!");
			}
			else
			{
				int j=new LoginServiceImpl().setZeroCount(v);
				pw.println("setzerocount"+j);
			}
			String username=new LoginServiceImpl().getUsername(v);
			v.setUsername(username);
			float rating=new LoginServiceImpl().getRating(v);
			v.setRating(rating);
			String contact=new LoginServiceImpl().getContact(v);
			v.setContact(contact);
			String address=new LoginServiceImpl().getAddress(v);
			v.setAddress(address);
			HttpSession hs=request.getSession();
			hs.setAttribute("vendor", v);
			hs.setAttribute("username", v.getUsername());
			hs.setAttribute("rating", v.getUserid());
			hs.setAttribute("contact", v.getContact());
			hs.setAttribute("address", v.getAddress());
			RequestDispatcher rd=request.getRequestDispatcher("/listproduct.jsp");
			rd.forward(request, response);
		}
		else
		{
			int i=new LoginServiceImpl().getCount(v);
			if(i==3)
			{
				pw.println("attempt locked!!!");
			}
			else
			{
				int j=new LoginServiceImpl().incrementCount(v,i);
				RequestDispatcher rd=request.getRequestDispatcher("/index.html");
				rd.forward(request, response);
			}
		}
		pw.close();
	}

}

