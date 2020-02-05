package com.sai;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet
{
   public void service(HttpServletRequest req) throws IOException
    {
	int i=Integer.parseInt(req.getParameter("num1"));
	int j=Integer.parseInt(req.getParameter("num2"));
	int percent_value=(i*j)/100;
	//int k= i-((i*j)\100);
	int new_price=i-percent_value;
	
	System.out.println("result is"+new_price);
     }
}
