<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page import="model.Pais"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Pais Cadastrado</title>

<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
</head>

<body>
<!-- Modal -->

	<div class="modal fade" id="delete-modal" tabindex="-1" role="dialog" aria-labelledby="modalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Fechar">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="modalLabel">Excluir Pais</h4>
				</div>
				<div class="modal-body">Deseja realmente excluir este pais?
				</div>
				<div class="modal-footer">
					<form action="controller.do" method="post">
						<input type="hidden" name="id" id="id_excluir" value="${pais.id}"/>
						<button type="submit" class="btn btn-primary" name="command"
							value="ExcluirPais">Sim</button>

						<button type="button" class="btn btn-default" data-dismiss="modal">N&atilde;o</button>

					</form>
				</div>
			</div>
		</div>
	</div>
	<!-- /.modal -->
	<c:import url="Menu.jsp"/> 

	<!-- Container Principal -->
	<div id="main" class="container">
		<h3 class="page-header"> Vizualizar Pais #${pais.id} </h3>
		<div class="row">
			<div class="col-md-12">
				<p>
					<strong>Nome</strong>
				</p>
				<p>
					${pais.nome}
				</p>
			</div>
		</div>
		<div class="row">
			<div class="col-md-6">
				<p>
					<strong>Populacao</strong>
				</p>
				<p>
					${pais.populacao}
				</p>
			</div>
			<div class="col-md-6">
				<p>
					<strong>Area</strong>
				</p>
				<p>
					${pais.area}
				</p>
			</div>
		</div>
		<hr />
		<div id="actions" class="row">
			<div class="col-md-12">
			<a href="ListarPaises.jsp" class="btn btn-primary">Voltar</a>
			<a class="btn btn-warning "href="controller.do?command=EditarPais&id=${pais.id}">Editar</a>
	 		<button id="btn${pais.id}%>" type="button" class="btn btn-danger " data-toggle="modal"data-target="#delete-modal" data-pais="${pais.id }">Excluir</button>
		 	
			</div>
		</div>
	</div>
	
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script type="text/javascript">
	  $("#delete-modal").on('show.bs.modal', function(event) {
		 var button = $(event.relatedTarget); //botao que disparou a modal
		 var recipient = button.data('pais');
		 $("#id_excluir").val(recipient);
	  });
	</script>
</body>
</html>