<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<!-- Codificación de Caracteres -->
<meta charset="UTF-8">

<!-- Configuración inicial de ancho y escala -->
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<!-- Título de la página -->
<title>Login</title>

<!-- Hoja de estilo -->
<link rel="stylesheet" href="<core:url value="/res/css/estilo.css" />">
</head>
<body>
	<h1>Login Page</h1>
	<form action="/springmvc/login" method="post">
		<div class="container">
			<label for="uname"><b>Username</b></label> <input type="text"
				placeholder="Enter Username or Email" name="uname" required>
			<br> <label for="psw"><b>Password</b></label> <input
				type="password" placeholder="Enter Password" name="psw" required>
			<br>
			<button type="submit">Login</button>
		</div>
	</form>
</body>
</html>
