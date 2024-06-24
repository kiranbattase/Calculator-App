package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//step1 get the data
		int num1=Integer.parseInt (request.getParameter("FirstNumber"));
		int num2=Integer.parseInt (request.getParameter("SecondNumber"));
		String operation = request.getParameter("operation");
		
		//step2 process the data
		int result = 0;
		switch(operation)
		{
		case "+": result = num1 + num2;
		break;
		case "-": result = num1 - num2;
		break;
		case "*": result = num1 * num2;
		break;
		case "/": result = num1 / num2;
		break;
		case "%": result = num1 % num2;
		break;
		}
		
		//step3 Rendere the response to client
		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		writer.println("</body>");
		writer.println("Result : "+ result);
		writer.println("</html>");


	}

}
