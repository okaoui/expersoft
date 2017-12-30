<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<meta charset="utf-8"/>
	    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
	    <meta name="viewport" content="width=device-width, initial-scale=1"/>
		<link href="resources/css/bootstrap.min.css" rel="stylesheet"/>
		<link href="resources/css/style.css" rel="stylesheet"/>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
		<script src="resources/js/bootstrap.min.js"></script>
		<script src="resources/lib/jquery.ntm/js/jquery.ntm.js"></script>
		<link href="http://www.jqueryscript.net/css/jquerysctipttop.css" rel="stylesheet" type="text/css"/>
		<link rel="stylesheet" href="resources/lib/jquery.ntm/themes/default/css/theme.css" />
	<script type="text/javascript">
		$(document).ready(function() {
			$('.demo').ntm();
		});
	</script>
	</head>
<body>
		<div class="container">
			<div class="row">
				<div class="col-md-12" style="padding-top:10px;">
					<nav class="navbar navbar-inverse">
					  <div class="container-fluid">
					    <div class="navbar-header">
					      <a class="navbar-brand" href="#">EXPERSOFT</a>
					    </div>
					    <ul class="nav navbar-nav">
					      <li class="dropdown">
					        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Employée
					        <span class="caret"></span></a>
					        <ul class="dropdown-menu">
					          <li><a href="#">Access</a></li>
					          <li><a href="#">Profile</a></li>
					        </ul>
					      </li>
					      <li class="dropdown">
					        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Clients
					        <span class="caret"></span></a>
					        <ul class="dropdown-menu">
					          <li><a href="#">Nouveau</a></li>
					          <li><a href="#">Profile</a></li>
					        </ul>
					      </li>
					      <li class="dropdown">
					        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Campagne
					        <span class="caret"></span></a>
					        <ul class="dropdown-menu">
					          <li><a href="#">Création du campagne</a></li>
					          <li><a href="#">Cloture du campagne</a></li>
					        </ul>
					      </li>
					      <li class="dropdown">
					        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Vente
					        <span class="caret"></span></a>
					        <ul class="dropdown-menu">
					          <li><a href="#">Page 1-1</a></li>
					          <li><a href="#">Page 1-2</a></li>
					          <li><a href="#">Page 1-3</a></li>
					        </ul>
					      </li>
					      <li class="dropdown">
					        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Achat
					        <span class="caret"></span></a>
					        <ul class="dropdown-menu">
					          <li><a href="#">Page 1-1</a></li>
					          <li><a href="#">Page 1-2</a></li>
					          <li><a href="#">Page 1-3</a></li>
					        </ul>
					      </li>
					      <li class="dropdown">
					        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Fournisseur
					        <span class="caret"></span></a>
					        <ul class="dropdown-menu">
					          <li><a href="#">Page 1-1</a></li>
					          <li><a href="#">Page 1-2</a></li>
					          <li><a href="#">Page 1-3</a></li>
					        </ul>
					      </li>
					      <li><a href="#">Configuration</a></li>
					      <li><a href="#">Aide</a></li>
					    </ul>
					    <ul class="nav navbar-nav navbar-right">
					      <li><a href="#"><span class="glyphicon glyphicon-user"></span> ${storedUser.firstName}</a></li>
					      <li><a href="${pageContext.request.contextPath}?logout"><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
					    </ul>
					  </div>
					</nav>
				</div>
			</div>
			
			<!--  Body  -->
			<div class="row">
				<!-- Left menu -->
				<div class="col-md-3">
					<div class="wrapper">
					  <div class="tree-menu demo" id="tree-menu">
						<ul>
						  <li><a href="#">Problem Management</a>
								<ul>
								  <li><a href="#">Lookup</a></li>
								  <li><a href="#">List</a></li>
								</ul>
						   </li>
						   <li><a href="#">Solution Management</a>
								<ul>
								  <li><a href="#">Create</a></li>
								  <li><a href="#">Lookup</a></li>
								  <li><a href="#">List</a></li>
								  <li><a href="#">Update</a></li>
								</ul>
							</li>
							<li><a href="#">Contact</a>
								<ul>
								  <li><a href="#">Non-tech user</a></li>
								  <li><a href="#">Developer</a></li>
								  <li><a href="#">Administrator</a></li>
								</ul>
							</li>
							<li><a href="#">My Profile</a></li>
						</ul>
					  </div>
					</div>
				</div>
				<!-- Main body -->
				<div class="col-md-9">
					<div class="row"><!-- 2 divs, At first glance and Quality -->
						<div class="col-md-4 panel panel-default panel_background" style="margin-right: 10px; height: 250px;">
						 <fieldset style="color:#fcfcfc; font-size:10px;">
							<legend style="color:#fcfcfc;">Solutions Status</legend>
							<span>Pending Solutions:&nbsp;&nbsp;<a href="">6</a></span><br>
							<span>Accepted Solutions:&nbsp;&nbsp;<a href="">10 </a></span><br>
							<span>Declined Solutions:&nbsp;&nbsp;<a href="">7</a></span><br>
						</fieldset>
					  </div>
						<div class="col-md-7 panel panel-default panel_background" style="padding:10px;">
						 <fieldset>
							<legend style="color:#fcfcfc;">Solution's Quality</legend>
							<table class="table" style="font-size:10px; width:350px; color:#fcfcfc;">
								<tr>
									<th>SID</th>
									<th>Secure</th>
									<th>Reusable</th>
									<th>Maintainable</th>
									<th>Extendable</th>
								</tr>
								<tr>
									<td>2980</td>
									<td><img src="resources/images/star.png"/></td>
									<td></td>
									<td><img src="resources/images/star.png"/></td>
									<td><img src="resources/images/star.png"/></td>
								</tr>
								<tr>
									<td>2710</td>
									<td><img src="resources/images/star.png"/></td>
									<td><img src="resources/images/star.png"/></td>
									<td><img src="resources/images/star.png"/></td>
									<td></td>
								</tr>
								<tr>
									<td>3034</td>
									<td><img src="resources/images/star.png"/></td>
									<td><img src="resources/images/star.png"/></td>
									<td></td>
									<td><img src="resources/images/star.png"/></td>
								</tr>
							</table>
						</fieldset>
					  </div><!-- End of quality div -->
					  
					</div><!-- End of 1st row in main body -->
					<div class="row">
						<div class="col-md-5 panel panel-default panel_background" style="padding:10px; margin-right: 10px;">
							<fieldset>
								<legend style="color:#fcfcfc;">Solution's Performance</legend>
								<table class="table" style="font-size:10px; width:270px; color:#fcfcfc;">
									<tr>
										<th>SID</th>
										<th>Efficient</th>
										<th>Accurate</th>
										<th>Execution Time</th>
									</tr>
									<tr>
										<td>2980</td>
										<td><img src="resources/images/star.png"/></td>
										<td><img src="resources/images/star.png"/></td>
										<td></td>
									</tr>
									<tr>
										<td>2710</td>
										<td><img src="resources/images/star.png"/></td>
										<td><img src="resources/images/star.png"/></td>
										<td><img src="resources/images/star.png"/></td>
										<td></td>
									</tr>
									<tr>
										<td>3034</td>
										<td><img src="resources/images/star.png"/></td>
										<td><img src="resources/images/star.png"/></td>
										<td></td>
									</tr>
								</table>
							</fieldset>
						</div>
						<div class="col-md-6 panel panel-default panel_background" style="padding:10px;">
							<fieldset>
								<legend style="color:#fcfcfc;">Messages</legend>
								<table class="table" style="font-size:10px; width:300px; color:#fcfcfc;">
									<tr>
										<th>MID</th>
										<th>From</th>
										<th>Message</th>
										<th>Action</th>
									</tr>
									<tr>
										<td>2314</td>
										<td>A. Kaoui</td>
										<td>Need some help, let me know what time you will be available.</td>
										<td><a href=""><img src="resources/images/reply.png"/></a></td>
									</tr>
									<tr>
										<td>2315</td>
										<td>S. Seiaghi</td>
										<td>Need some help, let me know what time you will be available.</td>
										<td><a href=""><img src="resources/images/reply.png"/></a></td>
									</tr>
									<tr>
										<td>2316</td>
										<td>M. Kaoui</td>
										<td>Need some help, let me know what time you will be available.</td>
										<td><a href=""><img src="resources/images/reply.png"/></a></td>
									</tr>
									<tr>
										<td>2317</td>
										<td>A. Kaoui</td>
										<td>Need some help, let me know what time you will be available.</td>
										<td><a href=""><img src="resources/images/reply.png"/></a></td>
									</tr>
								</table>
							</fieldset>
						</div>
					</div>
				</div>
			</div>
			
		</div>
	</body>
</html>