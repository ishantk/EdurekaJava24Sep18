package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edureka.db.JDBCHelper;
import co.edureka.model.User;


@WebServlet({ "/RegisterUserServlet", "/Register" })
public class RegisterUserServlet extends HttpServlet {

	// Acts as Constructor
	public void init(ServletConfig config) throws ServletException {
		System.out.println("==inti executed==");
	}

	// Acts as Destructor
	public void destroy() {
		System.out.println("==destroy executed==");
	}

	// Handle Request and Send Back Response !!
	// service can handle both get and post requests !!
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("==service executed==");
		// request -> we can extract data coming from Client
		// response-> we can send back data to Client
		
		// 1. Fetch Data from Request by Client
		User user = new User();
		user.name = request.getParameter("txtName");
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		
		// 2. Save data in Table
		JDBCHelper helper = new JDBCHelper();
		helper.createConnection();
		int i = helper.registerUser(user);
		helper.closeConnection();
		
		// 3. Share Response  
		// Share A Response to the Client
		response.setContentType("text/html"); // MIME Type
		PrintWriter out = response.getWriter();
		
		// Writing HTML Response
		out.print("<html><body><center><b>");
		
		if(i>0){
			out.print("<h3>"+user.name+" Registered Successfully !!</h3>");
		}else{
			out.print("<h3>"+user.name+" Not Registered Successfully !!</h3>");
		}
		
		//out.print("Data Received: "+user.toString());
		out.print("</b></center></body></html>");
	}

}
