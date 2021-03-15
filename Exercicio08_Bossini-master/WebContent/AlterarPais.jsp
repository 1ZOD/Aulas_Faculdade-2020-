<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<!-- Meta tags -->
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">

<title>Alterar Pais</title>
</head>
<body>
	<c:import url="Menu.jsp"/>

	<div id="main" class="container">
		<h3 class="page-header">Alterar pais</h3>
		<form action="controller.do" method="post">
			<div class="row">
			<input type="hidden" name="id" value="${pais.id}"/>
				<div class="form-group col-md-12">
					<label for="nome">Nome</label> 
					<input type="text" class="form-control" name="nome" id="nome" required maxlength="100" placeholder="Nome" value="${pais.nome}"/>
				</div>
			</div>
			<div class="row">
				<div class="form-group col-md-6">
					<label for="populacao">Poulaçao</label>
					<input type="text" class="form-control" name="populacao" id="populacao" maxlength="15" placeholder="População" value="${pais.populacao}" />
				</div>
				<div class="form-group col-md-6">
					<label for="area">Area</label>
					<input type="text" class="form-control" name="area" id="area" placeholder="Area" value="${pais.area}" />
				</div>
			</div>
			<hr />
			<div id="actions" class="row">
				<div class="md-col-12">
					<button type="submit" class="btn btn-primary" name="command" value="AlterarPais">Salvar</button>
					<a href="ListarPaises.jsp" class="btn btndefault">Cancelar</a>
				</div>
			</div>
		</form>
	</div>
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>

</body>
</html>

