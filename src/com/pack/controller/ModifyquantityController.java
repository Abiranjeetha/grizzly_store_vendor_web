package com.pack.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pack.dao.ProductDaoImpl;
import com.pack.model.vendors;
import com.pack.service.ProductServiceImpl;

/**
 * Servlet implementation class ModifyquantityController
 */
//@WebServlet("/ModifyquantityController")
public class ModifyquantityController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifyquantityController() {
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
		int quan=Integer.parseInt(request.getParameter("quantity"));
		int id=Integer.parseInt(request.getParameter("pid"));
		int j=new ProductDaoImpl().modifyQauntity(quan,id);
		if(j==1)
		{
			List<vendors>l=new ProductServiceImpl().listVendors();
			request.setAttribute("vndlist",l);
			RequestDispatcher rd=request.getRequestDispatcher("/listvendors.jsp");
			rd.forward(request, response);
		}
	}

}
