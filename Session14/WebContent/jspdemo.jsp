<%@page import="co.edureka.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="errorpage.jsp" %>  
<%@ page buffer="8kb" %>
<%@ page isThreadSafe="true" %>

<%@ include file="printdate.jsp" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP</title>

</head>
<body>
	<h3>Welcome to JSP Demo</h3>
	
	
	<%-- num3 cannot be resolved here as it is created below
	 <h3>num3 is: <% out.print(num3); %></h3> --%>
	
	
	<%-- pi is created in declaration tag and cane be accessed anywhere --%>
	<h3>pi is: <% out.print(pi); %></h3>
	
	<h3>Scriptlet Tag in JSP:</h3>
	<% 
		int num1 = 10;
		int num2 = 20;
		int num3 = num1+num2;
		
		for(int i=1;i<=10;i++){
			out.print(num3+" "+i+"'s are "+(num3*i)+"<br/>");
		}
	
	%>
	<h3>num3 is: <% out.print(num3); %></h3>
	
	<h3>Declaration Tag in JSP:</h3>
	
	<%!
		
		int[] arr = {10, 20, 30, 40, 50};
	
		double pi = 3.14;
	
		double areaOfCircle(double radius){
			double area = pi * radius * radius;
			return area;
		}
	
	%>
	<h3>pi is: <% out.print(pi); %></h3>
	<h3>Area if Circle with radius 3.45 is: <% out.print(areaOfCircle(3.45)); %></h3>
	
	<h3>pi again is: <%= pi %></h3>
	<h3>Area of Circle with radius 5.45 is: <%= areaOfCircle(5.45) %></h3>
	
	<i>
		<jsp:include page="printdate.jsp"/>
	</i>
	
	
	<%
		User user = new User();
		user.setName("John");
		user.setEmail("john@example.com");
	%>
	
	<h4>Name: <%= user.getName() %></h4>
	<h4>Email: <%= user.getEmail() %></h4>
	
	<jsp:useBean id="uRef" class="co.edureka.model.User"/>
	<jsp:setProperty property="name" name="uRef" value="Jennie"/>
	<jsp:setProperty property="email" name="uRef" value="jennie@example.com"/>
	
	<h4>Name: <jsp:getProperty property="name" name="uRef"/></h4>
	<h4>Email: <jsp:getProperty property="email" name="uRef"/></h4>
	
	<%
		/*try{
			out.print("<b>arr[10] is: "+arr[10]+"</b>");
		}catch(Exception e){
			out.print("Something Went Wrong !!"+e);
		}*/
		
		//out.print("<b>arr[10] is: "+arr[10]+"</b>");
	%>
	
	<h3>JSTL Demo</h3>
	<c:forEach var="i" begin="1" end="10">
		<c:out value="${i}"/>
		<br/>
	</c:forEach>
	
	<c:set var="age" value="${30}"/>
	
	<c:redirect url="https://www.google.co.in"/>
	
</body>
</html>