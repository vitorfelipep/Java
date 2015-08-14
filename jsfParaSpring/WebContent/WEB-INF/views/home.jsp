<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css" media="screen">
	 @import url("<c:url value="/resources/css/main.css"/>");
</style>

<!-- link rel="stylesheet" href="resources/css/main.css" -->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Pagina Inicial</title>
</head>
<body>

	<div class="topo">
   		<h1>Pagina Inicial</h1>
   	</div>
   	
   	<a href='<c:url value="/cadastroUsuario/" />'>Cadastro Usuário</a>
   	<br>
   	<br>
   	
   	<a href='<c:url value="/cadastroAplicacao/" />'>Cadastro Aplicação</a>

</body>
</html>