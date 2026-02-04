<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <!-- Codificación de Caracteres -->
        <meta charset="UTF-8">

        <!-- Configuración inicial de ancho y escala -->
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <!-- Título de la página -->
        <title>IBM Java</title>

        <!-- Hoja de estilo -->
        <link rel="stylesheet" href="<core:url value="/res/css/estilo.css" />">
    </head>
    <body>
        <h1>Welcome ${uname} to IBM</h1>
        <a href="employee/form">Create Employee</a>
    </body>
</html>
