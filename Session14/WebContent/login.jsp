<%@page import="co.edureka.db.JDBCHelper"%>
<%@page import="co.edureka.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>

	   <h3>Logging In ${param.txtEmail} !!</h3>

<%
		
		User user = new User();
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
	
		JDBCHelper helper = new JDBCHelper();
		helper.createConnection();
		boolean login = helper.loginUser(user);
		helper.closeConnection();
		
		if(login){
			
			// Session Tracking
			// 1. Cookies
			Cookie ck1 = new Cookie("keyEmail",user.email);
			Cookie ck2 = new Cookie("keyName","Mike Watson");
			
			int age = 20;
			Cookie ck3 = new Cookie("keyAge",String.valueOf(age));
			
			response.addCookie(ck1);
			response.addCookie(ck2);
			response.addCookie(ck3);
			
			//2. URL Re-Writing
			//3. Hidden Form Fields
			
			//4. HttpSession Object
			session.setAttribute("keyEmail", user.email);
			session.setAttribute("keyName", "Mike Watson");
			
			//5. PageContext Object
			pageContext.setAttribute("keyName", "Mike Watson", PageContext.SESSION_SCOPE);
			
	%>
		<%-- <h3><%= user.email %> Logged In Successfully !!</h3>
		<a href="welcome.jsp">Enter Home</a> --%>
		
		<jsp:forward page="welcome.jsp"/>
		
	<%		
		}else{
	%>
		<h3><%= user.email %> Not Logged In Successfully !!</h3>
	<%	
		// Redirect to any Servlet/JSP/Web Resource
		response.sendRedirect("https://www.google.co.in");
		}
	%>


</body>
</html>