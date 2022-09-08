<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insertar cliente</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/estilo.css"/>
</head>
<body>

<form:form action="insertandocliente" modelAttribute="objcliente" method="post">
<h1>Ingrese los datos del cliente.</h1>
<div class="tablaactulizar">
  <table class="customTable">
  
  <tr>
  <td>Nombre: </td>
  <td>
  <form:input path="nombre" /> 
  <form:errors path="nombre" style="color:red" />
  </td>
  </tr>
  
  <tr>
  <td>Apellido: </td>
  <td><form:input path="apellido"/> <form:errors path="apellido" style="color:red" /> </td>
  </tr>
  
  <tr>
  <td>Telefono: </td>
  <td><form:input path="telefono"/>  <form:errors path="telefono" style="color:red" /></td>
  </tr>
  
  <tr>
  <td>Sexo: </td>
  <td>
  <form:select path="sexo"> 
  <form:option value="Masculino"> Masculino</form:option>
  <form:option value="Femenino"> Femenino</form:option>
  </form:select>
  </td>
  </tr>
  
  <tr>
  <td>Email: </td>
  <td><form:input path="email"/> <form:errors path="email" style="color:red" /></td>
  </tr>
  
  <tr>
  <td colspan="2"> 
  <input class="button" type="submit" value="Insertar"> 
 <INPUT TYPE="BUTTON" class="button" VALUE="Cancelar" ONCLICK="window.location.href='lista'; return false;"/> 
  </td>
  </tr>
  
  </table>
  </div>
 
</form:form>
</body>
</html>