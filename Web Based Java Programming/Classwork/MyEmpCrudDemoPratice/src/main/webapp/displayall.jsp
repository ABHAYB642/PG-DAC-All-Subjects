<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border=5>
<tr>
<th>EmpId</th>
<th>EmpName</th>
<th>EmpSal</th>
<th>DELETE</th>
<th>Edit</th>
</tr>
<c:forEach var="emp" items="${glist}">
<tbody>
<tr>
<td>${emp.empid}</td>
<td>${emp.ename}</td>
<td>${emp.sal}</td>
<td><a href="deleteemp?eid=${emp.empid}">Delete</a></td>
<td><a href="editemp?eid=${emp.empid}">Edit</a></td>
</tr>
</tbody>


</c:forEach>

</table>
<a href="addemp.jsp" >Add New Employee</a>
</body>
</html>