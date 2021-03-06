<%@page import="com.gts.expersoft.models.ZoneId"%>
<%@page import="com.gts.expersoft.models.Profile"%>
<%@page import="com.gts.expersoft.utils.ApplicationConstants"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.gts.expersoft.models.Menus"%>
<%@page import="java.util.List"%>
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
		<link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet"/>
		<link href="${pageContext.request.contextPath}/resources/css/style.css" rel="stylesheet"/>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
		<script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
		<script src="${pageContext.request.contextPath}/resources/lib/jquery.ntm/js/jquery.ntm.js"></script>
		<link href="http://www.jqueryscript.net/css/jquerysctipttop.css" rel="stylesheet" type="text/css"/>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/lib/jquery.ntm/themes/default/css/theme.css" />
		
		  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
		  <link href="${pageContext.request.contextPath}/resources/css/navbar.css" rel="stylesheet">
		  <!-- <link href="${pageContext.request.contextPath}/resources/css/style.css" rel="stylesheet"> -->
		  
		  <!-- <link rel="stylesheet" href="resources/dist/css/bootstrap-submenu.min.css"> -->
		
		  <!-- <script src="https://code.jquery.com/jquery-3.2.1.min.js" defer></script> -->
		  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" defer></script>
		  <script src="${pageContext.request.contextPath}/resources/dist/js/bootstrap-submenu.min.js" defer></script>
		<title>Production > Zone</title>
</head>
<body>
<style>
            body {
                padding-top: 50px;
            }
            .navbar-template {
                padding: 40px 15px;
            }

        </style>
        <div class="navbar navbar-default navbar-fixed-top" role="navigation">
            <div class="container">
		<div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">XPERSOFT</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">XPERSOFT</a>
                </div>
                <div class="collapse navbar-collapse">
                    <ul class="nav navbar-nav">
                    <%
                    	List<Menus> menus = (List<Menus>)session.getAttribute("userMenus");                    		
                    	
                    	for(int i = 0; i < menus.size(); i++){
                    		Menus m = menus.get(i);
                    		
                    		//menus.remove(i);
                    		
                    		%>
                    		<li><a href="#" class="dropdown-toggle" data-toggle="dropdown">
                    				<%=m.getNom()%>
                    			<b class="caret"></b></a>
                    			<ul class="dropdown-menu">
                    			
                    			<%
                    				List<Menus> submenus = m.getSubmenus();
       								
       								if(submenus.size() > 0){
       									for(Menus m3 : submenus){
       										List<Menus> submenus2 = m3.getSubmenus();
       										%>
       										<%if(submenus2 != null && submenus2.size() > 0){ %>
       										<li><a href="#" class="dropdown-toggle" data-toggle="dropdown">
       											<%=m3.getNom()%><b class="caret"></b>
       										</a>
       										
       											<ul class="dropdown-menu">
       											
       												<% 
       													for(int y = 0; y < submenus2.size(); y++){
       														Menus my = submenus2.get(y);
       														%>
       															<li><a href="${pageContext.request.contextPath}/event?id=<%=my.getId()%>">
       																	<%=my.getNom()%>
       																</a>
       															</li>
       														<%
       														
       													}
       												%>
       											
       											</ul>
       										</li>
       										<%
       										}else{
       											%>
       											<li><a href="${pageContext.request.contextPath}/event?id=<%=m3.getId()%>"><%=m3.getNom()%></a></li>
       										
       											<% }
       										}
       								
       								}
                    			%>
                    			</ul>
                    			
                    			</li> 
                    	<%} %>
                    	
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                    	<li><a href="${pageContext.request.contextPath}?logout"><span class="glyphicon glyphicon-log-in"></span>&nbsp;&nbsp;Sortir</a></li>
                    </ul>
                    </div>
                    </div>
                </div><!--/.nav-collapse -->
                

	<div class="container">
		<div class="row" style="padding-top: 10px">
			<div class="col-md-2 panel panel-default" style="padding: 10px; margin: 10px;">
			  <ul class="nav nav-pills nav-stacked">
			    <li><a href="#">Nouveau</a></li>
			    <li><a href="#">Annuler</a></li>
			    <li><a href="#">Enregistrer</a></li>
			    <li><a href="#">Supprimer</a></li>
			    <li><a href="#">Rechercher</a></li>
			    <li><a href="#">Imprimer</a></li>
			  </ul>
			</div>
		<div class="col-md-9 panel panel-default">
		<div class="row" style="padding: 5px; margin: 5px;">
			<div class="col-md-6 panel panel-default" style="padding: 10px; margin: 10px" >
				<form class="form-group" method="POST" 
				action="${pageContext.request.contextPath}/zone/create">
					<table style="font-size:10px;" class="table">
						<tr>
							<td width="30pd">Code</td><td><input type="text" name="code" style="font-size:10px;" disabled="disabled" class="form-control" id="code" placeholder="code"/></td>
						</tr>
						<tr>
							<td width="30pd">Nom</td><td><input type="text" name="nom" style="font-size:10px;" class="form-control" id="Nom" placeholder="Nom"/></td>
						</tr>
					</table>
					<input type="submit" style="font-size:10px;" value="Enregistrer" class="btn btn-default">
				</form>
			</div>
			<div class="col-md-5 panel panel-warning" style="padding: 10px; margin: 10px">
				<div class="panel-heading">
					Liste des Zones
				</div>
				
				<div class="panel-body">
					<table class="table" style="font-size:small;" width="300px">
						<tr class="warning">
					       <td width="80px" style="font-size:10px;">Code</td>
					       <td width="80px" style="font-size:10px;">Nom</td>
					       <td width="20px"></td>
					       <td width="20px"></td>
					    </tr>
					    
					    <%List<ZoneId> zones = (List<ZoneId>) session.getAttribute("listZ");
					    
					    if(zones != null){
					    	for(ZoneId z : zones){
					    		%>
					    		<tr style="font-size: 10px;">
					    			<td width="80px"><%=z.getCodZone() %></td>
					    			<td width="80px"><%=z.getLibZone() %></td>
					    			<td width="20px">
							    		<a href="${pageContext.request.contextPath}/zone/show?zid=<%= z.getId()%>">
									       <span class="glyphicon glyphicon-edit"></span>
									    </a>
							    	</td>
									<td width="20px">
					    				<a href="${pageContext.request.contextPath}/zone/delete?zid=<%= z.getId()%>">
								          <span class="glyphicon glyphicon-trash"></span>
								        </a>
								    </td>
					    		</tr>
					    		<% 
					    	}
					    }
					    %>
					</table>
				</div>
				
			</div>
		</div>
		</div>
		</div>
		</div>
		<script src="https://code.jquery.com/jquery-3.1.1.js"
          integrity="sha256-16cdPddA6VdVInumRGo6IbivbERE8p7CQR3HzTBuELA=" crossorigin="anonymous"></script>
          
        <!-- Include all compiled plugins (below), or include individual files as needed -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/resources/js/navbar.js"></script>
</body>
</html>