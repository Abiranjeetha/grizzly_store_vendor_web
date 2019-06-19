package com.pack.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pack.model.Product;
import com.pack.service.ProductServiceImpl;

/**
 * Servlet implementation class ViewproductController
 */
//@WebServlet("/ViewproductController")
public class ViewproductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewproductController() {
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
		int id=Integer.parseInt(request.getParameter("pid"));
		Product p=new ProductServiceImpl().viewProduct(id);
		if(p!=null)
		{
			request.setAttribute("singleproduct", p);
			request.setAttribute("pid", p.getPid());
			request.setAttribute("pcategory", p.getPcategory());
			request.setAttribute("pname", p.getPname());
			request.setAttribute("pdescription", p.getPcategory());
			request.setAttribute("pprice", p.getPprice());
			request.setAttribute("pbrand", p.getPbrand());
			request.setAttribute("rating", p.getRating());
			RequestDispatcher rd=request.getRequestDispatcher("/viewproduct.jsp");
			rd.include(request,response);
		}
	}

}
