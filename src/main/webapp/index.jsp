<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body bgcolor="#E6E6FA">
<h1 align="center">
Ingresar al Sistema
</h1>
<form action="ControladorProducto" method="post">
<table align="center" border="2">
<tr>
	<td>usuario</td>
	<td><input type="text" name="usuario"></td>
</tr>

<tr>
	<td>password</td>
	<td><input type="text" name="password"></td>
</tr>


<tr>
<td colspan="2" style="text-align:center">
<input type="submit" value="Registrar">
</td>
</tr>

</table>

</form>

</body>
</html>
