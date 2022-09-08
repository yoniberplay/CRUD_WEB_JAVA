<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Iniciar Sesion</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/loggin.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css" integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==" crossorigin="anonymous" referrerpolicy="no-referrer" />
</head>
<body>
<br><br><br>
<div class="center">
    <form:form action="loggin" modelAttribute="obj_loggin" method="post">
        <h1 class="title">Login</h1>
        <label>
            <i class="fa-solid fa-user"></i>
  <form:input path="usuario" placeholder="usuario"/> 
  <form:errors path="usuario" style="color:red" />
        </label>
        <label>
            <i class="fa-solid fa-lock"></i>
            <form:password path="clave" placeholder="password"/> 
  			<form:errors path="clave" style="color:red" />
        </label>
        <a style="color:red">${msj}</a>
        <a id="forgot" href="#" class="link" onmouseover="large()" onmouseout="medium()">Forgot your password?</a>
        <button id="button">Login</button>
    </form:form>
    </div>
    <script src="${pageContext.request.contextPath}/resources/js/main.js"></script>
</body>
</html>