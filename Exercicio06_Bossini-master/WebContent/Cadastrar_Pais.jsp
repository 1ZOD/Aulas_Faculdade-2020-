<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<!-- Meta tags -->
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">

<title>Cadastro de Pais</title>
</head>
<body>
	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar" aria-expanded="false"
					aria-controls="navbar">
					<span class="sr-only">Menu de navegação superior</span>
					<span class="icon-bar"></span> 
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>

				</button>
				<a class="navbar-brand" href="Cadastrar_Pais.html">Cadastro</a>

			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-right">
					<li class="nav-item"><a href="Cadastrar_Pais.html">Pais</a></li>
				</ul>
			</div>
		</div>
	</nav>



	<div id="main" class="container">
		<h3>Cadastro de Pais</h3>
		<h3 class="page-header">Incluir pais</h3>
		<form action="ManterPaisController.do" method="post">
			<div class="row">
				<div class="form-group col-md-12">
					<label for="nome">Nome</label> <input type="text"
						class="form-control" name="nome" id="nome" required
						maxlength="100" placeholder="Nome" />
				</div>
			</div>
			<div class="row">
				<div class="form-group col-md-6">
					<label for="populacao">Poulaçao</label> <input type="text"
						class="form-control" name="populacao" id="populacao" maxlength="15"
						placeholder="População" />
				</div>
				<div class="form-group col-md-6">
					<label for="area">Area</label> <input type="text"
						class="form-control" name="area" id="area" placeholder="Area" />
				</div>
			</div>
			<hr />
			<div id="actions" class="row">
				<div class="md-col-12">
					<button type="submit" class="btn btn-primary" name="acao"
						value="Criar">Salvar</button>
					<a href="index.html" class="btn btndefault">Cancelar</a>
				</div>
			</div>
		</form>
	</div>
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>

</body>
</html>

