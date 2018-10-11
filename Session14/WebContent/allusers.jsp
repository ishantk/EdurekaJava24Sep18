<%@page import="co.edureka.model.User"%>
<%@ page import="java.util.ArrayList"%>
<%@page import="co.edureka.db.JDBCHelper"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>All Users</title>
</head>
<body>

	<center>
	<br/>
	<br/>
	<h3>All Users Registered with LMS:</h3>
	<%
	
		JDBCHelper helper = new JDBCHelper();
		helper.createConnection();
		ArrayList<User> users = helper.getUsers();
		helper.closeConnection();
	%>
	
	<table>
		<tr>
			<th>UID</th>
			<th>NAME</th>
			<th>EMAIL</th>
		</tr>
		
		
	<%
		for(User user : users){
			out.print("<tr>");
			out.print("<td>"+user.uid+"</td>");
			out.print("<td>"+user.name+"</td>");
			out.print("<td>"+user.email+"</td>");
			out.print("</tr>");
		}
	
	%>		
		
	</table>
	
	</center>

</body>
</html>