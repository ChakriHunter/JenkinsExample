<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Example</title>
</head>
<body>




<h1 style="color:red;text-align:center"> Students Report </h1>
<c:choose>
    <c:when test="${!empty  allStu}">
       <table>
         <tr> <th>SsnId</th><th>First Name</th></tr>
          <c:forEach var="dto"  items="${allStu}">
              <tr>
                 <td>${dto.studentId}</td>
                 <td>${dto.studentName}</td>
              </tr>
          </c:forEach>
       </table>
    </c:when>
    <c:otherwise>
        <h1 style="color:red;text-align:center"> No Records found </h1>
    </c:otherwise>
</c:choose>
<br><br>
 <a href="#">home</a>




</body>
</html>