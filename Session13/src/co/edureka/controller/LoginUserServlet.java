package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
			// Session Tracking
			// 1. Cookies
			//   Cookie is a HashMap i.e. a Key Value Pair. Both key and value must be String.
			//Cookie ck1 = new Cookie("keyName", "John Watson");
			//Cookie ck2 = new Cookie("keyEmail", user.email);
			
			//response.addCookie(ck1);
			//response.addCookie(ck2);
			
			//System.out.println("==Cookies Added=="+ck1.getName()+":"+ck2.getName());
			
			//2. URL RE-Writing
			//out.print("<a href='Home?name=John&email="+user.email+"'>Enter Home</a>");
			
			//3. Hidden Form Fields
			/*String form = "<form action='Home' method='post'>"
					+ "<input type='hidden' name='txtName' value='John Watson'/>"
					+ "<input type='hidden' name='txtEmail' value='"+user.email+"'/>"
					+ "<input type='submit' value='Enter Home'/>"
					+ "</form>";
			
			out.print(form);*/
			
			//4. HttpSession Object
			HttpSession session = request.getSession();
			session.setAttribute("keyName", "John"); // keyName can be any name of your choice
			session.setAttribute("keyEmail", user.email);
			out.print("<a href='Home'>Enter Home</a>");
		}else{
			out.print("<h3>"+user.name+" Not Logged in Successfully !!</h3>");
			response.sendRedirect("https://google.co.in");
		}
		
		//out.print("Data Received: "+user.toString());
		out.print("</b></center></body></html>");
		
	}

}
