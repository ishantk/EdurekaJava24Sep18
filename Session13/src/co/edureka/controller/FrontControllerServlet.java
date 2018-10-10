package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet({ "/FrontControllerServlet", "/Front" })
public class FrontControllerServlet extends HttpServlet {
	
	// Front Controller shall act as receptionist.
	// Any Request in the entire application will be sent to Front Controller.
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Share A Response to the Client
		response.setContentType("text/html"); // MIME Type
		PrintWriter out = response.getWriter();
		
		String type = request.getParameter("txtType");
		
		// This is Response by FrontController
		out.print("<html><body><center><b>");
		
		String today = "Today is: "+new Date();
		
		out.print("<h3>"+today+"</h3>");
		out.print("</b></center></body></html>");
		
		// Logic to check where to dispatch which request !!
		if(type.equals("register")){
			RequestDispatcher dispatcher = request.getRequestDispatcher("Register");
			dispatcher.forward(request, response);
		}else{
			RequestDispatcher dispatcher = request.getRequestDispatcher("Login");
			//dispatcher.forward(request, request);
			dispatcher.include(request, response);
			
			//response.sendRedirect("https://google.co.in");
			//System.out.println("Rediected");
		}
		
	}

}
