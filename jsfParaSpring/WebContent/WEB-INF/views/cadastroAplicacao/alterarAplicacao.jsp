<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Alteração de aplicação</title>
</head>
<body>

	<div class="topo">
   		<h1>Alteração de aplicação</h1>
   	</div>

	<form method="post" action='<c:url value="/cadastroAplicacao/alterarAplicacao" />'>
		
			<input type="hidden" name="id_aplicacao" value="${aplicacao.id_aplicacao}" />
	
		<p>
			Nome da aplicação: 
			<input type="text" name="nome_aplicacao" value="${aplicacao.nome_aplicacao}" size="80">
		</p>
		
		<p>
		   Descrição da aplicação:
		   <input type="text" name="descricao_aplicacao" value="${aplicacao.descricao_aplicacao}" size="60">
		</p>
		
		<p>
		   Setor da aplicação:
		   <input type="text" name="setor" value="${aplicacao.setor}" size="40">
		</p>
		
		<p> <input type="submit" value="Alterar Aplicação"> </p>
	</form>

</body>
</html>