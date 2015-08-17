<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css" media="screen">
	 @import url("<c:url value="/resources/css/main.css"/>");
</style>

<!-- link rel="stylesheet" href="resources/css/main.css" -->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista de usuários</title>
</head>
<body>

	<div class="topo">
   		<h1>Lista de usuários</h1>
   	</div>
   	
   	<a href='<c:url value="/cadastroUsuario/novo" />'>Novo Usuário</a>
	<br/>
	
	<table width="100%" border="1">
	  <tr>
	    <th>Nome</th>
	    <th>Login</th>
	    <th>Setor</th>
	    <th>Alterar</th>
	    <th>Excluir</th>
	  </tr>
	
		<c:forEach items="${lista_usuarios}" var="usuario">	  
		  <tr>
		    <td>${usuario.nome_usuario} </td>
		    <td>${usuario.login_usuario}</td>
		    <td>${usuario.setor_usuario}</td>
		    <form method="post" action='<c:url value="/cadastroUsuario/alterar" />'>
		    	<input type="hidden" value="${usuario.id_usuario}" name="id_usuario" />
		    	<input type="hidden" value="${usuario.nome_usuario}" name="nome_usuario" />
		    	<input type="hidden" value="${usuario.login_usuario}" name="login_usuario" />
		    	<input type="hidden" value="${usuario.senha_usuario}" name="senha_usuario" />
		    	<input type="hidden" value="${usuario.setor_usuario}" name="setor_usuario" />
		    	<td><input type="submit" value="Alterar"></td>
		    </form>
		    
		    <form method="post" action='<c:url value="/cadastroUsuario/excluir" />'>
		    	<input type="hidden" value="${usuario.id_usuario}" name="id_usuario" />
		    	<input type="hidden" value="${usuario.nome_usuario}" name="nome_usuario" />
		    	<input type="hidden" value="${usuario.login_usuario}" name="login_usuario" />
		    	<input type="hidden" value="${usuario.senha_usuario}" name="senha_usuario" />
		    	<input type="hidden" value="${usuario.setor_usuario}" name="setor_usuario" />
		    	<td><input type="submit" value="Excluir"></td>
		    </form>
		  </tr>
		 </c:forEach>
	  
	</table>

</body>
</html>