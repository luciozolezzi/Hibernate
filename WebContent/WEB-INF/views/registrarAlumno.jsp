<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrar un nuevo alumno</title>
</head>

<body>
	<h3>Ingresar los datos del alumno:</h3>
  
	<form:form method="POST" action="/alumnos/register">

		<form:label path="nombre">
			<spring:message text="Nombre" />
		</form:label>
		<form:input path="nombre" />
		
		<form:label path="apellido">
			<spring:message text="Apellido" />
		</form:label>
		<form:input path="apellido" />
		
		<form:label path="legajo">
			<spring:message text="Legajo" />
		</form:label>
		<form:input path="legajo" />
		
		<form:label path="regional">
			<spring:message text="Regional" />
		</form:label>
		<form:input path="regional" />
		
		
	</form:form>
</body>
</html>