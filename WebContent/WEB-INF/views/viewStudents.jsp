<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ver Alumnos</title>
</head>
<body>s

	<h3>Lista de Alumnos</h3>
	
	<table>
	<tr>
		<th width="40">ID</th>
		<th width="80">Nombre</th>
		<th width="80">Apellido</th>
		<th width="80">Legajo</th>
		<th width="80">Regional</th>
	</tr>
	<c:forEach items="${alumnos}" var="alumno">
		<tr>
			<td>${alumno.id}</td>
			<td>${alumno.nombre}</td>
			<td>${alumno.apellido}</td>
			<td>${alumno.legajo}</td>
			<td>${alumno.regional}</td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>