<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Details</title>
</head>
<body>
	<c:if test="${not empty message}">
		<div class="alert alert-info">${message}</div>
	</c:if>
	<a href="${pageContext.request.contextPath}/employee/form" class="btn">Add
		New Employee</a>
	<h2>Employee Details:</h2>
	<table border="1">
		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Email</th>
				<th>Phone</th>
				<th>Update</th>
				<th>Delete</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${employees}" var="emp">
				<tr>
					<td>${emp.id}</td>
					<td>${emp.name}</td>
					<td>${emp.email}</td>
					<td>${emp.phone}</td>
					<td><form
							action="${pageContext.request.contextPath}/employee/update"
							method="get">
							<input type="hidden" name="id" value="${emp.id}" />
							<button type="submit">Update</button>
						</form></td>
					<td><form
							action="${pageContext.request.contextPath}/employee/delete"
							method="post">
							<input type="hidden" name="id" value="${emp.id}" />
							<button type="submit">Delete</button>
						</form></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>