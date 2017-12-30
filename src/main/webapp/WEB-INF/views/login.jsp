<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
	<head>
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
		
		<script type="text/javascript">
			var signup_msg = '${signup_message}';
			var login_msg = '${login_message}';
			if (signup_msg != null && signup_msg != '') {
				$.alert({
				    title: 'Message',
				    content: signup_msg,
				});
			}
			
			if (login_msg != null && login_msg != '') {
				$.alert({
				    title: 'Message',
				    content: login_msg,
				});
			}
		</script>
	</head>
	<body>
		<div class="container">
			<div class="row">
				<div class="col-md-12" style="padding-top:10px;">
					<img src="resources/images/logo.jpg" alt="header" width="100%" height="80">
				</div>
			</div>
		
			<br><br><br>
			<div class="row">
				<div class="col-md-4" >
				</div>
				<div class="col-md-4" >
					<div class="panel panel-info panel_background" style="padding:10px;">
						<form class="form-group" method="POST" action="login">
							<fieldset>
								<legend class="cs_label"><small>Login:</small></legend>
								<div class="form-group" style="padding-bottom:12px;">
									<small><label for="username" class="cs_label">Username:</label></small>&nbsp;&nbsp;
									<small><input name="username" type="text" class="form-control" id="username" placeholder="username" required="required"/></small>
								</div>
								<div class="form-group">
									<small><label for="password" class="cs_label">Password:</label></small>&nbsp;&nbsp;
									<small><input name="password" type="password" class="form-control" id="password" placeholder="password" required="required"/></small>
									<a href="" class="cs_label">Can't remember?</a><br>
									<span class="cs_label">${logout}</span>
								</div> 
								</fieldset>	
								<small><input type="submit" class="cs_label cs_button" value="Login"/></small>	
						</form>
					</div>
					
				</div>
				<div class="col-md-4" >
				</div>
			</div>
		</div>
	</body>
</html>