package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/LoginFilter")
public class LoginFilter implements Filter {

    
	public void destroy() {
		System.out.println("==Filter destroy==");
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		response.setContentType("text/html"); // MIME Type
		PrintWriter out = response.getWriter();
		
		String email = request.getParameter("txtEmail");
		String password = request.getParameter("txtPassword");
		
		// Before chain.doFilter is executed, Pre-Processing Works
		
		out.print("<h3>LoginFilter - PreProcessing</h3>");
		
		if(!email.isEmpty()  &&  !password.isEmpty()){
			chain.doFilter(request, response); // -> LoginUserServlet
		}else{
			out.print("<h3>LoginFilter - Enter Valid Details First</h3>");
		}
		
		
		
		// After chain.doFilter is executed, Post-Processing Works
		out.print("<h3>LoginFilter - PostProcessing</h3>");
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("==Filter init==");
	}

}
