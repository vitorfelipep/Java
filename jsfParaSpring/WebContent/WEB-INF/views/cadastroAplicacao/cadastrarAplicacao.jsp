<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro de aplicações</title>
</head>
<body>

	<div class="topo">
   		<h1>Cadastro de aplicações</h1>
   	</div>

	<form method="post" action='<c:url value="/cadastroAplicacao/gravarAplicacao" />'>
		<p>
			Nome da aplicacao: 
			<input type="text" name="nome_aplicacao" size="80">
		</p>
		
		<p>
		   Descrição da aplicacao:
		   <input type="text" name="descricao_aplicacao" size="60">
		</p>
		
		<p>
		   Setor da aplicação:
		   <input type="text" name="setor" size="40">
		</p>
		
		<p> <input type="submit" value="gravar"> </p>
	</form>

</body>
</html>