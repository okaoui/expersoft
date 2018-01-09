<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8"/>
	    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
	    <meta name="viewport" content="width=device-width, initial-scale=1"/>
		<link href="resources/css/bootstrap.min.css" rel="stylesheet"/>
		<link href="resources/css/error.css" rel="stylesheet"/>
		<link href="resources/css/style.css" rel="stylesheet"/>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
		<script src="resources/js/bootstrap.min.js"></script>
		
		<!-- JQuery dialogs -->
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery-confirm/3.2.0/jquery-confirm.min.css">
		<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-confirm/3.2.0/jquery-confirm.min.js"></script>
<title>Insert title here</title>
</head>
<body>

	<div class="container">
		<div class="row" style="padding-top: 10px">
			<nav class="navbar navbar-default">
			  <ul class="nav navbar-nav">
			    <li><a href="#">Nouveau</a></li>
			    <li><a href="#">Annuler</a></li>
			    <li><a href="#">Enregistrer</a></li>
			    <li><a href="#">Supprimer</a></li>
			    <li><a href="#">Rechercher</a></li>
			    <li><a href="#">Imprimer</a></li>
			  </ul>
			</nav>
		</div>
		<div class="row">
			<div class="col-md-5 panel panel-default" style="padding: 10px; margin: 10px" >
				<form action="">
					<table style="font-size:small;" class="table">
						<tr>
							<td width="30pd">Code</td><td><input type="text" name="code" class="form-control" id="code" placeholder="code"/></td>
							<td width="30pd">Matricule</td><td><input type="text" name="matricule" class="form-control" id="matricule" placeholder="matricule"/></td>
						</tr>
						<tr>
							<td width="30pd">Nom</td><td><input type="text" name="nom" class="form-control" id="nom" placeholder="nom"/></td>
						</tr>
						<tr>
							<td width="30pd">Prénom</td><td><input type="text" name="prenom" class="form-control" id="prenom" placeholder="prenom"/></td>
						</tr>
						<tr>
							<td width="30pd">Fonction</td><td><input type="text" name="fonction" class="form-control" id="fonction" placeholder="fonction"/></td>
						</tr>
						<tr>
							<td width="30pd">E-mail</td><td><input type="text" name="email" class="form-control" id="email" placeholder="email"/></td>
						</tr>
						<tr>
							<td width="30pd">Cel</td><td><input type="text" name="mobile" class="form-control" id="mobile" placeholder="mobile"/></td>
							<td width="30pd">Tel</td><td><input type="text" name="phone" class="form-control" id="phone" placeholder="phone"/></td>
						</tr>
						
						<tr>
							<td width="30pd">Mot de passe</td><td><input type="password" name="password" class="form-control" id="password" placeholder="password"/></td>
							<td width="30pd">Confirmation</td><td><input type="password" name="confirm" class="form-control" id="confirm" placeholder="confirm"/></td>
						</tr>
					</table>
					
					<input type="submit" value="Enregistrer" class="btn btn-default">
				</form>
			</div>
			
			
			<div class="col-md-5 panel panel-warning" style="padding: 10px; margin: 10px">
				<div class="panel-heading">
					Liste des utilisateurs
				</div>
				
				<div class="panel-body">
					<table class="table" style="font-size:small;" width="300px">
						<tr class="warning">
					       <td>Login</td>
					       <td>Nom</td>
					       <td>Prénoms</td>
					    </tr>
					</table>
				</div>
				
			</div>
		</div>
		<div class="row">
			<div class="col-md-5 panel panel-warning" style="padding: 10px; margin: 10px">
				<div class="panel-heading">
					Profile utilisateur
				</div>
				<div class="panel-body">
					Profile &nbsp;&nbsp;&nbsp;
					<select style="width: 100px"> 
						<option value=""></option>
					</select>
					<br/><br/>
					<table class="table" style="font-size:small;" width="300px">
						<tr class="warning">
					       <td>Order</td>
					       <td>Menu Principal</td>
					       <td>Sous-Menu-1</td>
					       <td>Sous-Menu-2</td>
					    </tr>
					</table>
				</div>
			</div>
		</div>
		
	</div>

</body>
</html>