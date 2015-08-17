<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Alteração de usuário</title>
</head>
<body>

	<div class="topo">
   		<h1>Alteração de usuários</h1>
   	</div>

	<form method="post" action='<c:url value="/cadastroUsuario/alterarUsuario" />'>
		
			<input type="hidden" name="id_usuario" value="${usuario.id_usuario}" />
	
		<p>
			Nome do usuário: 
			<input type="text" name="nome_usuario" value="${usuario.nome_usuario}" size="80">
		</p>
		
		<p>
		   Login do usuário:
		   <input type="text" name="login_usuario" value="${usuario.login_usuario}" size="60">
		</p>
		
		<p>
		   Senha do usuário
		   <input type="text" name="senha_usuario" value="${usuario.senha_usuario}" size="40">
		</p>
		
		<p>
		   Setor do usuário
		   <input type="text" name="setor_usuario" value="${usuario.setor_usuario}" size="40">
		</p>
		
		<p> <input type="submit" value="Alterar Usuário"> </p>
	</form>

</body>
</html>