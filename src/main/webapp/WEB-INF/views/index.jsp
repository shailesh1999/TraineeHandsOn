<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="createTrainee" method="post">
		<table>
			<tr><td>Name</td><td><input type="text" name="name"></td></tr>
			<tr><td>Cohort Code</td><td><input type="text" name="cohort_code"></td></tr>
			<tr><td>Email</td><td><input type="email" name="email"></td></tr>
			<tr><td><input type="submit" value="Create"></td></tr>
		</table>
	</form>
	
	<table border="1">	
		<tr>
			<th>Trainee ID</th><th>Name</th><th>Cohort Code</th><th>Email</th>
		</tr>
		<c:forEach var="s" items="${TraineeList}">
			<tr>
				<td>${s.empId}</td>
				<td>${s.name}</td>
				<td>${s.cohort_code}</td>
				<td>${s.email}</td>
				<td><a href="removeTrainee?empid=${s.empId}">Remove</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>