<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Example</title>
</head>
<body>
    <center>${msg}</center>
	<h1 style="color: red; text-align: center">Book Registration</h1>

	<form:form mothod="post" action="submitStudent" modelAttribute="std">
	
		<br>
		<center>
			Student Name:
			<form:input path="studentName" />
			<form:errors path="studentName" />
			
		</center>
		<br>
		<center>
			<input type="submit" value="Submit" />
		</center>
	</form:form>


</body>
</html>