<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrar un nuevo alumno</title>
</head>

<body>
	<h3>Ingresar los datos del alumno:</h3>


	<form:form modelAttribute="alumno" action="register" method="post">
		<table>
			<tr>
				<td>Nombre:</td>
				<td><form:input id="nombre" path="nombre" /></td>
			</tr>
			<tr>
			<tr>
				<td>Apellido:</td>
				<td><form:input id="apellido" path="apellido" /></td>
			</tr>
			<tr>
			<tr>
				<td>Legajo:</td>
				<td><form:input id="legajo" path="legajo" /></td>
			</tr>
			<tr>
			<tr>
				<td>Regional:</td>
				<td><form:input id="regional" path="regional" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Aceptar"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>