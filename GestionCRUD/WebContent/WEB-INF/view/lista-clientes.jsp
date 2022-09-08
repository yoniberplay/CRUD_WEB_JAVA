<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Clientes</title>

<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/estilo.css"/>

</head>
<body>
	<h1 id="id1">Lista de clientes</h1>
	<div class="center">
	<table class="customTable">
		<tr>
			<th>NOMBRE</th>
			<th>APELLIDO</th>
			<th>TELEFONO</th>
			<th>SEXO</th>
			<th>EMAIL</th>
			<th>MODIFICAR</th>
			<th>ELIMINAR</th>
		</tr>
		
		<c:forEach var="i" items="${lista}">
		<c:url var="linkactualizar" value="/cliente/actulizarForm">
		<c:param name="clienteid" value="${i.id}"/>
		</c:url>
		<c:url var="linkEliminar" value="/cliente/eliminarcliente">
		<c:param name="clienteid" value="${i.id}"/>
		</c:url>
			<tr>
				<td>${i.nombre }</td>
				<td>${i.apellido }</td>
				<td>${i.telefono }</td>
				<td>${i.sexo }</td>
				<td>${i.email }</td>
				<td> <a href="${linkactualizar}"><input id="editar" type="button" value="Actualizar"></a></td>
				<td> <a href="${linkEliminar}"><input id="editar" type="button" value="Eliminar" onclick="return validacion()" ></a></td>
			</tr>
			
		</c:forEach>
		
		<tr>
		 <td colspan="7">
		  <INPUT TYPE="BUTTON" class="button" VALUE="Agregar cliente" ONCLICK="window.location.href='insertar'; return false;"/> 
		  <INPUT TYPE="BUTTON" class="button" VALUE="Cerrar sesion" ONCLICK="window.location.href='sesionoff'; return false;"/> 
		 
		 </td>
		
		</tr>
	</table>
	</div>
	
    <script>
function validacion() {
  let text = "Esta seguro que desea eliminar este registro?";
  if (confirm(text) == true) {
    return true;
  } else {
	  return false;
  }
}

function over() {
	document.getElementById("id1").style.color = "blue";
	}
</script>

</body>
</html>