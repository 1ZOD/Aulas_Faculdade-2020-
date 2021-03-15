<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>	
<html lang="pt-br">
<head>
 	 <meta charset="utf-8">
	 <meta http-equiv="X-UA-Compatible" content="IE=edge">
	 <meta name="viewport" content="width=device-width, initial-scale=1">
 		<title>Menu</title>

 <link href="css/bootstrap.min.css" rel="stylesheet">
 <link href="css/style.css" rel="stylesheet">
</head>
<body>
	<nav class="navbar navbar-inverse navbar-fixed-top">
 	  <div class="container-fluid">
  		<div class="navbar-header">
		  <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
			<span class="sr-only">Toggle navigation</span>
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
		  </button>
		  <a class="navbar-brand" href="index.jsp">Pais.biz</a>
		</div>
		<div id="navbar" class="navbar-collapse collapse">
		  <ul class="nav navbar-nav navbar-right">
			<li><a href="listar_paises.do?acao=reiniciar">Paises</a></li>
			<li><a href="#">Estado</a></li>
			<li><a href="#">Cidade</a></li>
			<li><a href="#">Capital</a></li>
		  </ul>
		</div>
	</div>
</nav>

 	<script src="js/jquery.min.js"></script>
	 <script src="js/bootstrap.min.js"></script>
</html>