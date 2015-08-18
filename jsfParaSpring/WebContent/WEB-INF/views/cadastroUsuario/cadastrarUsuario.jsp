<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro de usuário</title>
</head>
<body>

	<div class="topo">
   		<h1>Cadastro de usuários</h1>
   	</div>

	<form method="post" action='<c:url value="/cadastroUsuario/gravarUsuario" />'>
		<p>
			Nome do usuário: 
			<input type="text" name="nome_usuario" size="80">
		</p>
		
		<p>
		   Login do usuário:
		   <input type="text" name="login_usuario" size="60">
		</p>
		
		<p>
		   Senha do usuário
		   <input type="text" name="senha_usuario" size="40">
		</p>
		
		<p>
		   Setor do usuário
		   <input type="text" name="setor_usuario" size="40">
		</p>
		
		<p> <input type="submit" value="gravar"> </p>
	</form>

</body>
</html>