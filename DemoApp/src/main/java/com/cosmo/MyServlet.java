package com.cosmo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException
	{
		PrintWriter out = response.getWriter();
		out.print("Hi");
		
		ServletContext ctx = getServletContext();
		String str = ctx.getInitParameter("name");
		out.println(str);
	}
}
