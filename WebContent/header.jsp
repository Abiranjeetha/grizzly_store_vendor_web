<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel = "stylesheet" type="text/css" href="form.css">
<style>
#user
{
float:right
}
</style>
</head>
<body>
<form action="/grizzly-store-vendor-web/LogoutController" method="post">
<h1>Grizzly 
<img alt="not available" src="grizzly.png" width="40"> 
store
<input type="text" id="text" placeholder="search">
<div id="user">Welcome, <%=session.getAttribute("username") %>
<input type="submit" value="Logout" id="btn"> </div>
</h1>
</form>
</body>
</html>