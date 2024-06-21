<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Registrar Producto</title>
</head>
<body bgcolor="#E6E6FA">
    <h1 align="center">Registrar Producto</h1>
    <form action="ControladorProducto" method="post">
        <table align="center">
            <tr>
                <td>Nombre</td>
                <td><input type="text" name="nombre" required></td>
            </tr>
            <tr>
                <td>Precio Venta</td>
                <td><input type="text" name="precioVenta" required></td>
            </tr>
            <tr>
                <td>Precio Compra</td>
                <td><input type="text" name="precioCompra" required></td>
            </tr>
            <tr>
                <td>Estado</td>
                <td>
                    <select name="estado" required>
                        <option value="habilitado">Habilitado</option>
                        <option value="inhabilitado">Inhabilitado</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>Descripción</td>
                <td><input type="text" name="descripcion" required></td>
            </tr>
            <tr>
                <td colspan="2" style="text-align:center">
               	 <input type="submit" value="Registrar" style="background-color: #DDB4E8; color: white;" onmouseover="this.style.backgroundColor='#C794E3 ';" onmouseout="this.style.backgroundColor='#B573C6 ';">
                </td>
            </tr>
        </table>
    </form>
</body>


</html>


