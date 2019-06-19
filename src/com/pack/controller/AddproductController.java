package com.pack.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pack.model.Product;
import com.pack.service.ProductServiceImpl;

/**
 * Servlet implementation class AddproductController
 */
//@WebServlet("/AddproductController")
public class AddproductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddproductController() {
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
		int pid=Integer.parseInt(request.getParameter("pid"));
		String pcategory=request.getParameter("pcategory");
		String pname=request.getParameter("pname");
		String pdescription=request.getParameter("pdescription");
		float pprice=Float.parseFloat(request.getParameter("pprice"));
		Product p=new Product(pcategory,pid,pname,pdescription,pprice);
		int i=new ProductServiceImpl().addProduct(p);
		if(i==1)
		{
			List<Product>l=new ProductServiceImpl().listProduct();
			request.setAttribute("prdlist",l);
			RequestDispatcher rd=request.getRequestDispatcher("/listproduct.jsp");
			rd.forward(request, response);
		}
		else
		{
			pw.println("Not updated successfully");
		}
	}

}
