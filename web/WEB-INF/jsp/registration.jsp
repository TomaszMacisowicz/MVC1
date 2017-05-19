<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
<style>
.error {
	color: #ff0000;
	font-style: bold;
}
</style>
</head>
<body topmargin="100" leftmargin="100">
<form:form action="registration.html" method="POST" commandName="registration">
<table align="center">
	<tr>
		<th>Username:</th>
		<td>
			<form:input path="username"/>
			<form:errors path="username" cssClass="error" />
		</td>
	</tr>

	<tr>
		<th>Password:</th>
		<td>
			<form:password path="password"/>
			<form:errors path="password" cssClass="error" />	
		</td>
	</tr>
	<tr>
		<th></th>
		<td><input type="submit" value="Register" /></td>
	</tr>
</table>
</form:form>
</body>
</html>