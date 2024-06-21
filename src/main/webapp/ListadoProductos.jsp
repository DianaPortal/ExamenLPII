<%@ page import="java.util.List" %>
<%@ page import="model.TblProductocl2" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listado de Productos</title>
</head>
<body bgcolor="#E6E6FA">
    <h1 align="center">Listado de Productos</h1>
    <h2 align="center">
        <a href="RegistrarProductos.jsp" style="text-decoration: none;">Registrar Productos</a>
    </h2>
    
    <table align="center" border="2">
        <tr>
            <th>Codigo</th>
            <th>Nombre</th>
            <th>Precio Venta</th>
            <th>Precio Compra</th>
            <th>Estado</th>
            <th>Descripcion</th>
        </tr>
        
        <%
        List<TblProductocl2> listadoproducto = (List<TblProductocl2>) request.getAttribute("listadoproductos");
        if (listadoproducto == null || listadoproducto.isEmpty()) {
        %>
            <tr>
                <td colspan="6" align="center">No se encontraron productos.</td>
            </tr>
        <%
        } else {
            for (TblProductocl2 lis : listadoproducto) {
        %>
        <tr>
            <td><%= lis.getIdProductoCL2() %></td>
            <td><%= lis.getNombreCL2() %></td>
            <td><%= lis.getPrecioVentaCL2() %></td>
            <td><%= lis.getPrecioCompCL2() %></td>
            <td><%= lis.getEstadoCL2() %></td>
            <td><%= lis.getDescripCL2() %></td>
        </tr>
        <%
            }
        }
        %>
    </table>
</body>
</html>
