package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet({ "/WelcomeUserServlet", "/Welcome", "/Home" })
public class WelcomeUserServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html"); // MIME Type
		PrintWriter out = response.getWriter();
		
		/*String email="NA";
		
		Cookie[] ckArr = request.getCookies();
		System.out.println(ckArr);
		if(ckArr != null){
			for(Cookie ck : ckArr){
				
				out.print(ck.getName()+" : "+ck.getValue()+"<br/>");
				
				if(ck.getName().equals("keyEmail")){
					email = ck.getValue();
				}
			}
		}*/
		
		// Extracting Data from URL
		//String name = request.getParameter("name");
		//String email = request.getParameter("email");
		
		// Extracting Data from Hidden Form Fields
		//String name = request.getParameter("txtName");
		//String email = request.getParameter("txtEmail");
		
		// Extract Data from HttpSession Object
		HttpSession session = request.getSession();
		String name = (String)session.getAttribute("keyName");
		String email = (String)session.getAttribute("keyEmail");
		
		String welcome = "Welcome "+name+", "+email+"<br/> Its: "+new Date();
		
		// Writing HTML Response
		out.print("<html><body><center><b>");
		out.print("<h3>"+welcome+"</h3>");
		out.print("</b></center></body></html>");
	}

}
