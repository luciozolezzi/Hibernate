<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrar un nuevo alumno</title>
</head>

<body>
	<h3>Ingresar los datos del alumno:</h3>

	<form action="registerStudent" method="post">
		<table>
			<tr>
				<td>Nombre</td>
				<td><input name="nombre" /></td>
			</tr>
			<tr>
				<td>Apellido</td>
				<td><input name="apellido" /></td>
			</tr>
			<tr>
				<td>Legajo</td>
				<td><input name="legajo" /></td>
			</tr>
			<tr>
				<td>Regional</td>
				<td><input name="regional" /></td>
			</tr>
		</table>
		<input type="submit" value="Registrar Alumno" />
	</form>
</body>
</html>