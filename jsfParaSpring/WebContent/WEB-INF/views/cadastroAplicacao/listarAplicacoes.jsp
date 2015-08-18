<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css" media="screen">
	 @import url("<c:url value="/resources/css/main.css"/>");
</style>

<!-- link rel="stylesheet" href="resources/css/main.css" -->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista de aplicações</title>
</head>
<body>

	<div class="topo">
   		<h1>Lista de aplicações</h1>
   	</div>
   	
   	<a href='<c:url value="/cadastroAplicacao/novo" />'>Nova Aplicação</a>
	<br/>
	
	<table width="100%" border="1">
	  <tr>
	    <th>Nome</th>
	    <th>Setor</th>
	    <th>Descrição</th>
	    <th>Alterar</th>
	    <th>Excluir</th>
	  </tr>
	
		<c:forEach items="${lista_aplicacoes}" var="aplicacao">	  
		  <tr>
		    <td>${aplicacao.nome_aplicacao} </td>
		    <td>${aplicacao.descricao_aplicacao}</td>
		    <td>${aplicacao.setor}</td>
		    <form method="post" action='<c:url value="/cadastroAplicacao/alterar" />'>
		    	<input type="hidden" value="${aplicacao.id_aplicacao}" name="id_aplicacao" />
		    	<input type="hidden" value="${aplicacao.nome_aplicacao}" name="nome_aplicacao" />
		    	<input type="hidden" value="${aplicacao.descricao_aplicacao}" name="descricao_aplicacao" />
		    	<input type="hidden" value="${aplicacao.setor}" name="setor_aplicacao" />
		    	<td><input type="submit" value="Alterar"></td>
		    </form>
		    
		    <form method="post" action='<c:url value="/cadastroAplicacao/excluir" />'>
		    	<input type="hidden" value="${aplicacao.id_aplicacao}" name="id_aplicacao" />
		    	<input type="hidden" value="${aplicacao.nome_aplicacao}" name="nome_aplicacao" />
		    	<input type="hidden" value="${aplicacao.descricao_aplicacao}" name="descricao_aplicacao" />
		    	<input type="hidden" value="${aplicacao.setor}" name="setor_aplicacao" />
		    	<td><input type="submit" value="Excluir"></td>
		    </form>
		  </tr>
		 </c:forEach>
	  
	</table>
   	
</body>
</html>