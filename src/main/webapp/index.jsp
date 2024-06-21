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
<form action="ControladorUsuario" method="post">
<table align="center" border="2">
<tr>
	<td>Usuario</td>
    <td><input type="text" name="usuario" placeholder="Usuario" required></td>
</tr>
<tr>
	<td>Password</td>
    <td><input type="password" name="password" placeholder="Contraseña" required></td>
</tr>
<tr>
    <td>
        <input type="submit" value="Ingresar" style="background-color: #DDB4E8; color: white;" onmouseover="this.style.backgroundColor='#C794E3 ';" onmouseout="this.style.backgroundColor='#B573C6 ';">
    </td>
</tr>

</table>
</form>
</body>


</html>
