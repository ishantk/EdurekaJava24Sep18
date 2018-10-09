package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edureka.db.JDBCHelper;
import co.edureka.model.User;


@WebServlet({ "/LoginUserServlet", "/Login" })
public class LoginUserServlet extends HttpServlet {
	
	// Login Servlet can handle on post requests
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		User user = new User();
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		
		JDBCHelper helper = new JDBCHelper();
		helper.createConnection();
		boolean login = helper.loginUser(user);
		helper.closeConnection();
		
		response.setContentType("text/html"); // MIME Type
		PrintWriter out = response.getWriter();
		
		// Writing HTML Response
		out.print("<html><body><center><b>");
		
		if(login){
			out.print("<h3>"+user.email+" Logged in Successfully !!</h3>");
		}else{
			out.print("<h3>"+user.name+" Not Logged in Successfully !!</h3>");
		}
		
		//out.print("Data Received: "+user.toString());
		out.print("</b></center></body></html>");
		
	}

}
