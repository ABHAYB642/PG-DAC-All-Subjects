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
<form action="editemp" method="post">
Enter ID: <input type="number" name="id" value="${e.empid}" readonly/>
Enter Name: <input type="text" name="name" value="${e.ename}" required/>
Enter salary: <input type="number" name="sal" value="${e.sal}" required/>
<button>Submit</button>
</form>
</body>
</html>