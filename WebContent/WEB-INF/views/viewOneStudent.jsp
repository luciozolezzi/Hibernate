<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ver un estudiante</title>
</head>

<body>
	<h3>Alumno Ejemplo</h3>

	<table>
		<tr>
			<th width="40">ID</th>
			<th width="80">Nombre</th>
			<th width="80">Apellido</th>
			<th width="80">Legajo</th>
			<th width="80">Regional</th>
		</tr>
		<tr>
			<td>${alumno.id}</td>
			<td>${alumno.nombre}</td>
			<td>${alumno.apellido}</td>
			<td>${alumno.legajo}</td>
			<td>${alumno.regional}</td>
		</tr>
	</table>
</body>
</html>