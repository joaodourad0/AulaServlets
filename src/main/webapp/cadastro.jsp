<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="./css/styles.css">
<meta charset="ISO-8859-1">
<title>Aula Servlets - Cadastro</title>
</head>
<body>
		<jsp:include page="menu.jsp">
	<br/>
	<br/>
	
	<div class="container" align="center">
		<form action = "https://www.leandrocolevati.com.br" methd="post">
			<p class="title"><b>Cadastro de Pessoas</b></p>
			<table>
				<tr>
					<td>
						<input class="input_data_id" type="number" min="0" step="1" id="id" name="id"
						placeholder="#ID" >
					</td>
				</tr>
				<tr>
					<td>
						<input class="input_data" type="text" id="nome" name="nome"
						placeholder="Nome" >
					</td>
				</tr>
				<tr>
					<td>
						<input class="input_data_date" type="date" id="dataNasc" name="dataNasc"
						placeholder="Data de Nascimento" >	
					</td>
				</tr>
				<tr>
					<td>
						<input type="submit" id="enviar" name="enviar" value="Enviar">
						<input type="submit" id="listar" name="listar" value="Listar">
					</td>
				</tr>	
								
			</table>
		</form>
	
	</div>
</body>
</html>