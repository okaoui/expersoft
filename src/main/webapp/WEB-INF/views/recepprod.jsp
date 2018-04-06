<%@page import="com.gts.expersoft.models.Marque"%>
<%@page import="com.gts.expersoft.models.Fourn"%>
<%@page import="com.gts.expersoft.models.Farmsurf"%>
<%@page import="com.gts.expersoft.models.Equipe"%>
<%@page import="com.gts.expersoft.models.Farmer"%>
<%@page import="com.gts.expersoft.models.Personel"%>
<%@page import="com.gts.expersoft.models.Transp"%>
<%@page import="com.gts.expersoft.models.Station"%>
<%@page import="com.gts.expersoft.models.Calibre"%>
<%@page import="com.gts.expersoft.models.Produit"%>
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
<html>
<head>
<meta charset="utf-8"/>
	    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
	    <meta name="viewport" content="width=device-width, initial-scale=1"/>
		<!-- <link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet"/> -->
		<!-- <link href="${pageContext.request.contextPath}/resources/css/style.css" rel="stylesheet"/> -->
		<!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script> -->
		<!-- <script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script> -->
		<!-- <script src="${pageContext.request.contextPath}/resources/lib/jquery.ntm/js/jquery.ntm.js"></script> -->
		<!-- <link href="http://www.jqueryscript.net/css/jquerysctipttop.css" rel="stylesheet" type="text/css"/>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/lib/jquery.ntm/themes/default/css/theme.css" /> -->
		
		  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
		  <link href="${pageContext.request.contextPath}/resources/css/navbar.css" rel="stylesheet">
		 <!--  <link href="${pageContext.request.contextPath}/resources/css/style.css" rel="stylesheet"> -->
		  
		  <!-- <link rel="stylesheet" href="resources/dist/css/bootstrap-submenu.min.css"> -->
		
		  <!-- <script src="https://code.jquery.com/jquery-3.2.1.min.js" defer></script> -->
		  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" defer></script>
		  <script src="${pageContext.request.contextPath}/resources/dist/js/bootstrap-submenu.min.js" defer></script>
		  <link rel="stylesheet" href="https://code.jquery.com/ui/1.11.4/themes/black-tie/jquery-ui.css" type="text/css">
			<script language="javascript" type="text/javascript" src="https://code.jquery.com/jquery-1.11.2.min.js"></script>
			<!-- <script language="javascript" type="text/javascript" src="jquery.flot.min.js"></script> -->
			<script src="https://code.jquery.com/ui/1.11.4/jquery-ui.min.js"></script>
			
			<script type="text/javascript">

			$(function() {
			    $( "#datepicker" ).datepicker();
			});

			$(function() {
			    $( "#datepicker2" ).datepicker();
			});

			$(function() {
			    $( "#datepicker3" ).datepicker();
			});

			$(function() {
			    $( "#datepicker4" ).datepicker();
			});

			$(function() {
			    $( "#datepicker5" ).datepicker();
			});
			
			</script>
		  
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
        
        <script type="text/javascript">
			function findTotal(){
			    var qty = document.getElementById('qty');
			    var pu = document.getElementById('pu');
			    var tot=0;
			    
			        if(parseInt(qty.value) && parseFloat(pu.value))
			            tot = qty.value * pu.value;
			    
			    document.getElementById('total').value = tot;
			}

			function findTotalCal(){
				var qtyBat = document.getElementsByName('qtyBat');
				var qtyAvi = document.getElementsByName('qtyAvi');
				var qtyExt = document.getElementsByName('qtyExt');
				var qtyRebTole = document.getElementById('rebusTole');
				var qtyRebNoTole = document.getElementById('rebusNoTole');
				var qtySousPoi = document.getElementById('sousPoi');
				
				var totBat=0, totAvi=0, totExt=0, tot=0;

				for(var i=0;i<qtyBat.length;i++){
			        //if(parseInt(qtyBat[i].value) && parseInt(qtyAvi[i].value) && parseInt(qtyExt[i].value))
			            tot = parseInt(qtyBat[i].value) + parseInt(qtyAvi[i].value) +parseInt(qtyExt[i].value);
			        	document.getElementsByName('qtyTotal')[i].value = tot;
			        	tot = 0;

				        totBat += parseInt(qtyBat[i].value);
			        	totAvi += parseInt(qtyAvi[i].value);
			        	totExt += parseInt(qtyExt[i].value);
			        	
			    }

				document.getElementById('totalBat').value = totBat;
				document.getElementById('totalAvi').value = totAvi;
				document.getElementById('totalExt').value = totExt;
				document.getElementById('totalAll').value = totExt+totAvi+totExt;

				document.getElementById('qtyBatCV').value = totBat;
				document.getElementById('qtyAviCV').value = totAvi;
				document.getElementById('qtyExtCV').value = totExt;

				var grandTot = totExt+totAvi+totExt+parseInt(qtyRebTole.value)
				+parseInt(qtyRebNoTole.value)+parseInt(qtySousPoi.value);
				
				document.getElementById('grandTot').value = grandTot;
				document.getElementById('ecart').value = grandTot - parseInt(document.getElementById('qty').value);
			}

			function findMontant(){
				var qtyBatCV = document.getElementById('qtyBatCV');
				var qtyAviCV = document.getElementById('qtyAviCV');
				var qtyExtCV = document.getElementById('qtyExtCV');
				
			    var puBatCV = document.getElementById('puBatCV');
			    var puAviCV = document.getElementById('puAviCV');
			    var puExtCV = document.getElementById('puExtCV');
			    
			    var totBatCV=0, totAviCV=0, totExtCV=0;
			    
			        if(parseInt(qtyBatCV.value) && parseFloat(puBatCV.value))
			        	totBatCV = qtyBatCV.value * puBatCV.value;
		        	
			        if(parseInt(qtyAviCV.value) && parseFloat(puAviCV.value))
			        	totAviCV = qtyAviCV.value * puAviCV.value;

			        if(parseInt(qtyExtCV.value) && parseFloat(puExtCV.value))
			        	totExtCV = qtyExtCV.value * puExtCV.value;

			    document.getElementById('montBatCV').value = totBatCV;
			    document.getElementById('montAviCV').value = totAviCV;
			    document.getElementById('montExtCV').value = totExtCV;

			    document.getElementById('monTotalAch').value = totBatCV + totAviCV + totExtCV; 
			    document.getElementById('prixAchMoy').value = (totBatCV + totAviCV + totExtCV)/(qtyBatCV.value+qtyAviCV.value+qtyExtCV.value);
				
			}

			function submitData(){
				//var myForm = document.getElementById('pr_form');


					
					var stat = document.getElementById("station");
					var prod = document.getElementById("prod");
					var marque = document.getElementById("marque");
					var fourn = document.getElementById("fourn");
					var parcel = document.getElementById("parcel");
					
					
					var valS = stat.options[stat.selectedIndex].value;
					var valP = prod.options[prod.selectedIndex].value;
					var valM = marque.options[marque.selectedIndex].value;
					var valF = fourn.options[fourn.selectedIndex].value;
					var valPA = parcel.options[parcel.selectedIndex].value;
					var numLot = document.getElementById('numRecep').value;
					var numBonRec = document.getElementById('numBonRec').value;
					var datepicker4 = document.getElementById('datepicker4').value;
					var datepicker5 = document.getElementById('datepicker5').value;

					//alert(strUser);
					if(parseInt(valS) == 0){
						alert("Select station!");
						return false;
					}else if(parseInt(valP) == 0){ 
						alert("Select produit!");
						return false;
					}else if(parseInt(valM) == 0){ 
						alert("Select marque!");
						return false;
					}else if(parseInt(valF) == 0){ 
						alert("Select fournisseur!");
						return false;
					}else if(parseInt(valPA) == 0){ 
						alert("Select parcel!");
						return false;
					}else if(numLot == ""){ 
						alert("Enter N° Lot!");
						return false;
					}else if(numBonRec == ""){ 
						alert("Enter N° Bon de recolte!");
						return false;
					}else if(datepicker4 == ""){ 
						alert("Enter Date de recolte!");
						return false;
					}else if(datepicker5 == ""){ 
						alert("Enter Date de conditionnement!");
						return false;
					}else{
						return true;
					}
							
			}
			
			var request;  
			function sendRequest(){  
				//var v=document.vinform.t1.value; 
				var prod= document.getElementById("prod").value; 
				var url="${pageContext.request.contextPath}/recepprod/calibres?prod="+prod;
				//alert(url);  
				  
				if(window.XMLHttpRequest){  
					request=new XMLHttpRequest();  
				}  
				else if(window.ActiveXObject){  
					request=new ActiveXObject("Microsoft.XMLHTTP");  
				}  
				  
				try{  
					request.onreadystatechange=sendInfo;  
					request.open("POST",url,true);  
					request.send();  
				}  
				catch(e){  
					alert("Unable to connect to server"+e.message);  
				}  
			}  

			function sendInfo(){
				var p =	document.getElementById("print");

				if(request.readyState ==1){
					var text = request.responseText;
					p.innerHTML="Please Wait.....";
					console.log("1");
					
				}

				if(request.readyState ==2){
					var text = request.responseText;
					console.log("2");
					
				}
				if(request.readyState ==3){
					var text = request.responseText;
					console.log("3");
					
				}
				if(request.readyState ==4){
					var text = request.responseText;			
					//p.innerHTML=" Request Processed  "+text;
					alert("done!"); 
				}
			}

			
			
	    </script>
         
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
					  <li><a href="">Nouveau</a></li>
					  <li><a href="#">Annuler</a></li>
					  <li><a href="#">Enregistrer</a></li>
					  <li><a href="#">Supprimer</a></li>
					  <li><a href="#">Rechercher</a></li>
				      <li><a href="#">Imprimer</a></li>
				  </ul>
			</div>
		<div class="row">
			<div class="col-md-7" style="padding: 10px; margin: 10px" >
			<form action="${pageContext.request.contextPath}/recepprod/create" 
				method="POST" id="pr_form">
				<div class="row panel panel-default">
				<div class="panel-heading ">
					Identification
				</div>
				<div class="panel-body">
				<!--<p id="print"></p>-->
					<table style="font-size: 10px;" class="table">
						<tr>
							<td>N° Lot</td>
							<td><input type="text" name="numRecep" style="font-size: 10px;" id="numRecep"/></td>
							<td>Date de reception</td>
							<td colspan="4"><input type="text" name="dateRecep" id="datepicker" style="font-size: 10px;"/></td>
					    </tr>
					     <tr>
							<td width="50px">Contrat</td>
							<td width="50px"><select name="contrat"> 
							        <option value="">Select...</option>
						            </select></td>
							
							<td width="30pd">Période</td>
							<td> <input type="text" name="period" id="datepicker2" style="font-size: 10px;"/></td>
							<td width="30pd">Au</td>
							<td><input type="text" name="au" id="datepicker3" style="font-size: 10px;"/></td>
					    </tr>
					    <tr>
							<td width="60px"> Station</td>
						            <td width="120px"><select name="station" id="station"> 
						            <option value="0">Select...</option>
						            <%
						            	List<Station> listStat = (List<Station>)session.getAttribute("listStat");
						            	if(listStat != null){
						            		for(Station s : listStat){
						            			%>
						            			<option value="<%=s.getCodStat()%>"><%=s.getLibStat() %></option>
						            			<% 
						            		}
						            	}
						            %>
							        
						            </select></td>
						            <td width="30px">  <button type="button" style="font-size: 10px;" 
						            data-toggle="modal" data-target="#station" >...</button>
						            </td>
						       <td width="60px"> Produit
						       <select name="prod" onchange="sendRequest()" id="prod" required="required"> 
						       <option value="0">Select...</option>
							        <%List<Produit> produits = (List<Produit>) session.getAttribute("listP");
							        Produit p = (Produit)request.getAttribute("calibres"); 
								    if(produits != null){
								    	for(Produit p2 : produits){
								    		if(p != null){
								    			if(p.getCodProd().equalsIgnoreCase(p2.getCodProd())){
								    				%>
								    				<option value="<%=p2.getCodProd() %>" selected="selected"><%=p2.getLibProd() %></option>
								    				
								    				<% 
								    			}else{
								    				%>
								    				<option value="<%=p2.getCodProd() %>"><%=p2.getLibProd() %></option>
								    				
								    				<% 

								    			}
								    		}else{
								    			%>
							    				<option value="<%=p2.getCodProd() %>" ><%=p2.getLibProd() %></option>
							    				
							    				<% 
								    		}
								    		 
								    	}
								    }
								    %>
						            </select></td>
						            <td></td>
					    </tr>
					    <tr>
							<td width="60px"> Fournisseur </td>
						            <td width="100px"><select name="fourn" id="fourn" required="required"> 
						            <option value="0">Select...</option>
						            <%List<Fourn> listFourn = (List<Fourn>)session.getAttribute("listFourn"); 
						            	if(listFourn != null){
						            		for(Fourn f : listFourn){
						            			%>
						            			<option value="<%=f.getCodFou()%>"><%=f.getRaisonFou() %></option>
						            			<%
						            		}
						            	}
						            %>
							        
						            </select></td>
						            <td>  <button type="button" style="font-size: 10px;" 
						            data-toggle="modal" data-target="#fourn" >...</button>
						            </td>
						       <td width="50px"> Equipe <select name="equipe"> 
						       <option value="0">Select...</option>
						            <%List<Equipe> listEqu = (List<Equipe>)session.getAttribute("listEquip"); 
						            
						            	if(listEqu != null){
						            		for(Equipe e : listEqu){
						            			%>
						            			<option value="<%=e.getCodEquip()%>"><%=e.getLibEquip()%></option>
						            			<% 
						            		}
						            	}
						            %>
							        
						            </select></td>
					    </tr>
					</table>
					
					</div>
				</div>
				<div class="row panel panel-default">
				
					<ul class="nav nav-pills" style="font-size: 10px">
					   <li class="active"><a data-toggle="pill" href="#tab1">Producteur/Parcelle/Localité</a></li>
					   <li><a data-toggle="pill" href="#tab2">Recolte/Conditionnement</a></li>
					   <li><a data-toggle="pill" href="#tab3">Transporteur</a></li>
					</ul>
					
					<div class="tab-content">
					    <div id="tab1" class="tab-pane fade in active">
							<table class="table" style="font-size:10px;">
							<tr>
						      <td width="60px">Parcelle</td>
						      <td><select name="parcel" onchange="this.form.submit()" id="parcel" required="required">
						      		<option value="0">Select...</option>
						            <%List<Farmsurf> parcels = (List<Farmsurf>) session.getAttribute("listParc"); 
						            	if(parcels != null){
						            		for(Farmsurf fs : parcels){
						            			%>
						            			<option value="<%=fs.getCodParcel()%>"><%=fs.getCodParcel()%></option>
						            			<%
						            		}
						            	}
						            %> 
							        
						            </select>
						      </td>
						      <td>  
						      		<button type="button" style="font-size: 10px;" 
						            data-toggle="modal" data-target="#parcelle" >...</button>
						      </td>
						            <%Farmsurf parcelTarget = (Farmsurf)request.getAttribute("parcTarget");%>
						      <td width="60px">Localité</td>
							  <td><input type="text" name="codVil" value="<%=(parcelTarget != null)?parcelTarget.getCodVil():"" %>" 
							        style="font-size: 10px;"/></td>
						      <td><input type="text" name="libVil" value="<%=(parcelTarget != null)?parcelTarget.getLibVil():"" %>"style="font-size: 10px;" /></td>
						       
						    </tr>
						    <tr>
						      <td width="60px">Producteur</td>
							  <td><input type="text" name="codFarm" value="<%=(parcelTarget != null)?parcelTarget.getCodFarm():"" %>"style="font-size: 10px;"/></td>
						      <td><input type="text" name="nomFarm" value="<%=(parcelTarget != null)?parcelTarget.getNameFarm():"" %>" style="font-size: 10px;"/></td>
						
						    </tr>
						    <tr>
							    <td >Variété</td>
								<td><input type="text" name="codVar" value="<%=(parcelTarget != null)?parcelTarget.getCodVar():"" %>" style="font-size: 10px;" maxlength="4" size="3" />
									<input type="text" name="libVar" value="<%=(parcelTarget != null)?parcelTarget.getLibVar():"" %>" style="font-size: 10px;" maxlength="6" size="6" /></td>
								<td>Qté<input type="number" name="qty" id="qty" value="0" onblur="findTotal()" 
										style="font-size: 10px; background-color: orange;" maxlength="4" size="3"/></td>
								<td>P.U<input type="number" name="pu" id="pu" step="0.10" onblur="findTotal()" value="<%=(p!=null)?p.getPuFou():0 %>"
									style="font-size: 10px; background-color: orange;"
									maxlength="4" size="3"/></td>
								<td>Montant</td>
								<td><input type="number" name="total" id="total" step="0.10" style="font-size: 10px; background-color: orange;" 
									disabled="disabled" maxlength="6" size="4"/></td>
							</tr>
							
						</table>
					    </div>
					    <div id="tab2" class="tab-pane fade">
							<table class="table" style="font-size:10px;">	
							<tr> 
								<td>N° Bon de recolte</td>
								<td colspan="2"><input type="text" value="" style="font-size: 10px;" 
								size="6" required="required" name="numBonRec" id="numBonRec"/></td>
								 <td>N° Bon de Conditionnement</td>
								<td colspan="2"><input type="text" style="font-size: 10px;" name="numBonCond" id="bon" 
									required="required"/></td>
							</tr>
							<tr>
								<td>Date de recolte</td>
								<td colspan="4"><input type="text" id="datepicker4" style="font-size: 10px;" 
										name="dateRecol" required="required"/></td>
								<td>Date de conditionnement</td>
								<td colspan="4"><input type="text" id="datepicker5" style="font-size: 10px;" 
										name="dateCond" required="required"/></td>
							</tr>
							<tr>
								<td>Marque</td>
								<td><select name="marque" id="marque" required="required">
									<option value="0">Select...</option>
									<%List<Marque> marques = (List<Marque>) session.getAttribute("listMarq"); 
						            	if(marques != null){
						            		for(Marque ma : marques){
						            			%>
						            			<option value="<%=ma.getCodMarq()%>"><%=ma.getLibMarq()%></option>
						            			<%
						            		}
						            	}
						            %> 
								</select></td>
							</tr>
							
			   	      </table>
					    </div>
					    <div id="tab3" class="tab-pane fade">
							<table class="table" style="font-size:10px;">
						<tr>
						 	<td width="60px">Transporteur</td>
					        <td width="100px"><select name="transp"> 
					        
					        <%List<Transp> listTransp = (List<Transp>) session.getAttribute("listTransp"); 
					        	if(listTransp != null){
					        		for(Transp tra : listTransp){
					        			%>
					        			<option value="<%=tra.getCodTrans()%>"><%=tra.getLibTrans()%></option>
					        			<% 
					        		}
					        	}
					        %>
						        
					            </select>
					        </td>
					        <td>  <button type="button" style="font-size: 10px;" 
						            data-toggle="modal" data-target="#transporteur" >...</button></td>
						            <td width="60px">Chauffeur</td>
							<td width="120px"><select name="chauff" >
								<%List<Personel> listPers = (List<Personel>) session.getAttribute("listPerson"); 
								
									if(listPers != null){
										for(Personel per : listPers){
											%>
					        			<option value="<%=per.getMatPers()%>"><%=per.getNomPers()%></option>
											<% 
										}
									}
								%>
							</select></td>
							<td>  <button type="button" style="font-size: 10px;" 
						            data-toggle="modal" data-target="#chauffeur" >...</button></td>
					    </tr>
					    <tr>
					            <td width="60px">Camion &nbsp;&nbsp;&nbsp;</td>
					            <td width="60pd"><select name="camion"> 
						        <option value=""></option>
					            </select></td>
					            <td>  <button type="button" style="font-size: 10px;" 
						            data-toggle="modal" data-target="#vehicle" >...</button></td>
					             <td width="60px">Remorque &nbsp;&nbsp;&nbsp;</td>
					            <td width="60pd"><select name="remorque"> 
						        <option value=""></option>
					            </select></td>
					            <td>  <button type="button" style="font-size: 10px;" 
						            data-toggle="modal" data-target="#vehicle" >...</button></td>
					    </tr>
					    
					  </table>
					    </div>
					  
					  </div>
					</div>
				<div class="row ">
				<div class="col-md-6 panel panel-default">
				<div style="font-size: 10px; margin: 20px;">
					<span style="color: red;"><b>Décision</b></span>
					<select name="decision">
						<option>Select...</option>
						<option value="1">Accepter</option>
						<option value="0">En attente</option>
					</select>
				</div>
					<div class="panel-heading" style="font-size: 10px">
							Conditionnement en Quantité
						</div>
						
						<div class="panel-body">
							<table class="table" style="font-size:10px;" width="100">
							<tr class="warning">
						       <td width="70px">Calibre</td>
						       <td width="50px">BATEAU</td>
						       <td width="50px">AVION</td>
					           <td width="50px">Extra</td>
					           <td width="50px">Total</td>
						    </tr>
						    <%
						    
						    if(p != null){
						    	List<Calibre> calibres = p.getCalibres();
						    	if(calibres != null){
						    		for(Calibre c : calibres){
						    			%>
						    			<tr>
									       <td width="70px"><input type="text"  onblur="findTotalCal()" style="font-size: 8px;" name="calibre" disabled="disabled" value="<%=c.getLibCali() %>" maxlength="10" size="6"/></td>
									       <td width="50px"><input type="text" onblur="findTotalCal()" value="0" maxlength="4" size="2" name="qtyBat"/></td>
									       <td width="50px"><input type="text" onblur="findTotalCal()" value="0" maxlength="4" size="2" name="qtyAvi"/></td>
								           <td width="50px"><input type="text" onblur="findTotalCal()" value="0" maxlength="4" size="2" name="qtyExt"/></td>
								           <td width="50px"><input type="text" maxlength="4" size="2" style="background-color: #74f442;" disabled="disabled" name="qtyTotal"/></td>
									    </tr>
						    			
						    			<% 
						    		}
						    	}
						    
						    }
						    
						    	
						    %>
						    <tr>
						       <td width="70px">Total</td>
						       <td width="50px"><input type="text" name="totalBat" id="totalBat" disabled="disabled" value="0" maxlength="4" size="2"/></td>
						       <td width="50px"><input type="text" name="totalAvi" id="totalAvi" disabled="disabled" value="0" maxlength="4" size="2"/></td>
					           <td width="50px"><input type="text" name="totalExt" id="totalExt" disabled="disabled" value="0" maxlength="4" size="2" /></td>
					           <td width="50px"><input type="text" name="totalAll" id="totalAll" disabled="disabled" style="background-color: #74f442;" value="0" maxlength="4" size="2"/></td>
						    </tr>
						    <tr>
						       <td width="220px" colspan="4">Rebus Tolérables</td>
						       <!-- <td width="50px"><input type="text" disabled="disabled" value="0" maxlength="4" size="2"/></td>
						       <td width="50px"><input type="text" disabled="disabled" value="0" maxlength="4" size="2"/></td>
					           <td width="50px"><input type="text" disabled="disabled" value="0" maxlength="4" size="2" /></td> -->
					           <td width="50px"><input type="text" name="rebusTole" id="rebusTole" onblur="findTotalCal()" style="background-color: orange;" 
					           		value="0" maxlength="4" size="2"/></td>
						    </tr>
						    <tr>
						       <td width="220px" colspan="4">Rebus non Tolérables</td>
						       <!-- <td width="50px"><input type="text" disabled="disabled" value="0" maxlength="4" size="2"/></td>
						       <td width="50px"><input type="text" disabled="disabled" value="0" maxlength="4" size="2"/></td>
					           <td width="50px"><input type="text" disabled="disabled" value="0" maxlength="4" size="2" /></td> -->
					           <td width="50px"><input type="text" name="rebusNoTole" id="rebusNoTole" onblur="findTotalCal()" style="background-color: orange;" value="0" maxlength="4" size="2"/></td>
						    </tr>
						    <tr>
						       <td width="220px" colspan="4">Sous-Poids</td>
						      <!-- <td width="50px"><input type="text" disabled="disabled" value="0" maxlength="4" size="2"/></td>
						       <td width="50px"><input type="text" disabled="disabled" value="0" maxlength="4" size="2"/></td>
					           <td width="50px"><input type="text" disabled="disabled" value="0" maxlength="4" size="2" /></td> --> 
					           <td width="50px"><input type="text" name="sousPoi" id="sousPoi" onblur="findTotalCal()" style="background-color: orange;" 
					           			value="0" maxlength="4" size="2"/></td>
						    </tr>
						</table>
						</div>
				</div>
				<div class="col-md-6 panel panel-default" >
						<div class="panel-heading" style="font-size:10px;">
							Conditionnement en Valeur
						</div>
						 
						 <div style="text-align: center; background-color: orange; 
						 		color: white; font-size: 10px;">
						 	<span>Type/Prix</span>
						 </div>
						<div class="panel-body">
						
							<table class="table" style="font-size:10px;" width="100">
							<tr>
						       <td width="70px">Bateau</td>
						       <td><input type="text" disabled="disabled" name="qtyBatCV" id="qtyBatCV" value="0" maxlength="4" size="2"/></td>
						       <td>P.U</td>
					           <td><input type="text" value="0.000" name="puBatCV" id="puBatCV" maxlength="4" size="3" onblur="findMontant()"/></td>
					           <td>MT&nbsp;&nbsp;&nbsp;<input type="text" disabled="disabled" name="montBatCV" id="montBatCV" value="0" maxlength="4" size="2"/></td>
						    </tr>
						    <tr>
						       <td width="70px">Avion</td>
						       <td><input type="text" disabled="disabled" name="qtyAviCV" id="qtyAviCV" value="0" maxlength="4" size="2"/></td>
						       <td>P.U</td>
					           <td><input type="text" name="puAviCV" id="puAviCV" value="0.000" maxlength="4" size="2" onblur="findMontant()"/></td>
					           <td>MT&nbsp;&nbsp;&nbsp;<input type="text" name="montAviCV" id="montAviCV" value="0" disabled="disabled" maxlength="4" size="2"/></td>
						    </tr>
						    <tr>
						       <td width="70px">Extra</td>
						       <td><input type="text" disabled="disabled" name="qtyExtCV" id="qtyExtCV" value="0" maxlength="4" size="2"/></td>
						       <td width="30px">P.U</td>
					           <td><input type="text" name="puExtCV" id="puExtCV" value="0.000" maxlength="4" size="2" onblur="findMontant()"/></td>
					           <td width="30px">MT&nbsp;&nbsp;&nbsp;
					           <input type="text" disabled="disabled" name="montExtCV" id="montExtCV" value="0" maxlength="4" size="2"/></td>
						    </tr>
						    <tr>
						       <td width="220px" colspan="4">Montant Total Achat</td>
						       <!-- <td><input type="text" disabled="disabled" value="0" maxlength="4" size="2"/></td>
						       <td>P.U</td>
					           <td><input type="text" disabled="disabled" value="0.000" maxlength="4" size="4"/></td>
					           <td>MT</td> -->
					           <td><input type="number" disabled="disabled" name="monTotalAch" id="monTotalAch" 
					           			value="0" maxlength="6" size="6" /></td>
						    </tr>
						    <tr>
						       <td width="200px" colspan="4">Prix d'Achat Moyen</td>
						       <!--<td><input type="text" disabled="disabled" value="0" maxlength="4" size="2"/></td>
						       <td>P.U</td>
					           <td><input type="text" disabled="disabled" value="0.000" maxlength="4" size="4"/></td>
					           <td>MT</td>-->
					           <td><input type="number" disabled="disabled" name="prixAchMoy" id="prixAchMoy" value="0" maxlength="6" size="6"/></td>
						    </tr>
						</table>
						
						<span style="font-size: 10px">Grand Total</span> &nbsp;&nbsp;&nbsp;<input type="number" name="grandTot" id="grandTot"  
								value="0" style="font-size: 10px" disabled="disabled"/><br/>
						<span style="font-size: 10px">Ecart</span> &nbsp;&nbsp;&nbsp;<input type="number" name="ecart" id="ecart" 
								value="0" style="font-size: 10px" disabled="disabled"/>
						</div>
				</div>
					<input type="submit" value="Enregistrer" 
						style="font-size: 10px;" class="btn btn-default" onclick="return submitData()"/>
				</div>
			</form>
			</div>
					
			
			<div class="col-md-2 panel panel-warning" style="padding: 10px; margin: 10px">
				<div class="panel-heading">
					Liste des Receptions
				</div>
				
				<div class="panel-body">
					<table class="table">
						<tr class="warning" style="font-size: 10px;">
					       <td>N°</td>
					       <td>Date</td>
					       <td>Fournisseur</td>
					    </tr>
					    <tr>
					    </tr>
					</table>
				</div>
				
			</div>
		</div>	
		</div>
		
		<!-- Modal -->
					<div class="modal fade" id="fourn" role="dialog">
    					<div class="modal-dialog">
    					<!-- Modal content-->
					      <div class="modal-content">
					        <div class="modal-header">
					          <button type="button" class="close" data-dismiss="modal">&times;</button>
					          <h6 class="modal-title">Recherche Fournisseur</h6>
					        </div>
					        <div class="modal-body" style="font-size: 10px;">
					          <table>
					          	<tr style="font-size: 10px;">
					          		<td width="100px">Code</td>
					          		<td><input type="text" name="code"/></td>
					          	</tr>
					          	<tr style="font-size: 10px;">
					          		<td width="100px">Compte Tiers</td>
					          		<td><input type="text" name="cmptTier"/></td>
					          	</tr>
					          	<tr style="font-size: 10px;">
					          		<td width="100px">Nom</td>
					          		<td><input type="text" name="nom"/></td>
					          	</tr>
					          </table>
					          <br/><br/>
					          <table class="table table-striped">
					          	<tr style="font-size: 10px;">
					          		<td width="25%">Code</td>
					          		<td width="25%">Compte Tiers</td>
					          		<td width="25%">Nom</td>
					          		<td width="25%">Type</td>
					          	</tr>
					          	
					          	<%
						          	if(listFourn != null){
					            		for(Fourn f : listFourn){
					            			%>
					            			<tr style="font-size: 10px;">
					            				<td width="25%"><%=f.getCodFou() %></td>
					            				<td width="25%"></td>
					            				<td width="25%"><%=f.getRaisonFou() %></td>
					            				<td width="25%"></td>
					            			</tr>
					            			<%
					            		}
					            	}
					          	%>
					          </table>
					        </div>
					        <div class="modal-footer">
					          <button type="button" style="font-size: 10px;"
					          			data-dismiss="modal">Annuler</button>
					          <button type="button" style="font-size: 10px;"
					          			data-dismiss="modal">OK</button>
					        
					        </div>
					      </div>
					      
					    </div>
    					</div>
    					
    					<!-- Modal Parcelle-->
					<div class="modal fade" id="parcelle" role="dialog">
    					<div class="modal-dialog">
    					<!-- Modal content-->
					      <div class="modal-content">
					        <div class="modal-header">
					          <button type="button" class="close" data-dismiss="modal">&times;</button>
					          <h6 class="modal-title">Recherche Parcelle</h6>
					        </div>
					        <div class="modal-body" style="font-size: 10px;">
					          <table>
					          	<tr style="font-size: 10px;">
					          		<td width="100px">Code Parcelle</td>
					          		<td><input type="text" name="codeParc"/></td>
					          	</tr>
					          	<tr style="font-size: 10px;">
					          		<td width="100px">Producteur</td>
					          		<td><input type="text" name="prod"/></td>
					          	</tr>
					          	
					          </table>
					          <br/><br/>
					          <table class="table table-striped">
					          	<tr style="font-size: 10px;">
					          		<td width="20%">Producteur</td>
					          		<td width="20%">Localité</td>
					          		<td width="20%">Produit</td>
					          		<td width="20%">N° Parcelle</td>
					          		<td width="20%">Variété</td>
					          	</tr>
					          	<%
					          	if(parcels != null){
						            		for(Farmsurf fs : parcels){
						            			%>
						            			<tr style="font-size: 10px;">
						            			<td width="20%"><%=fs.getNameFarm()%></td>
						            			<td width="20%"><%=fs.getLibVil()%></td>
						            			<td width="20%"><%=fs.getLibProd()%></td>
						            			<td width="20%"><%=fs.getNum()%></td>
						            			<td width="20%"><%=fs.getLibVar()%></td>
						            			</tr>
						            			<%
						            		}
						            	}
					          	 %>
					          </table>
					        </div>
					        <div class="modal-footer">
					          <button type="button" style="font-size: 10px;"
					          			data-dismiss="modal">Annuler</button>
					          <button type="button" style="font-size: 10px;"
					          			data-dismiss="modal">OK</button>
					        
					        </div>
					      </div>
					      
					    </div>
    					</div>
    					
    					<!-- Modal Station-->
					<div class="modal fade" id="station" role="dialog">
    					<div class="modal-dialog">
    					<!-- Modal content-->
					      <div class="modal-content">
					        <div class="modal-header">
					          <button type="button" class="close" data-dismiss="modal">&times;</button>
					          <h6 class="modal-title">Recherche Localité</h6>
					        </div>
					        <div class="modal-body" style="font-size: 10px;">
					        
					       <!-- <form action="${pageContext.request.contextPath}/recepprod/station/search" method="POST"> -->
						          <table>
						          	<tr style="font-size: 10px;">
						          		<td width="100px">Code</td>
						          		<td><input type="text" name="codeLoc"/></td>
						          	</tr>
						          	<tr style="font-size: 10px;">
						          		<td width="100px">Nom</td>
						          		<td><input type="text" name="nomLoc"/></td>
						          	</tr>
						          	
						          </table>
					          <!--</form>-->
					          <br/><br/>
					          <table class="table table-striped">
					          	<tr style="font-size: 10px;">
					          		<td width="50%">Code</td>
					          		<td width="50%">Localité</td>
					          	</tr>
					          	
					          	<%
					          	if(listStat != null){
				            		for(Station s : listStat){
				            			%>
				            			<tr style="font-size: 10px;">
				            			<td width="50%"><%=s.getCodStat() %></td>
				            			<td width="50%"><%=s.getLibVil() %></td>
				            			</tr>
				            			<% 
				            		}
				            	}
					          	%>
					          </table>
					        </div>
					        <div class="modal-footer">
					          <button type="button" style="font-size: 10px;"
					          			data-dismiss="modal">Annuler</button>
					          <button type="button" style="font-size: 10px;"
					          			data-dismiss="modal">OK</button>
					        
					        </div>
					      </div>
					      
					    </div>
    					</div>
    					
    					<!-- Modal Chauffeur-->
					<div class="modal fade" id="chauffeur" role="dialog">
    					<div class="modal-dialog">
    					<!-- Modal content-->
					      <div class="modal-content">
					        <div class="modal-header">
					          <button type="button" class="close" data-dismiss="modal">&times;</button>
					          <h6 class="modal-title">Recherche Employé</h6>
					        </div>
					        <div class="modal-body" style="font-size: 10px;">
					          <table>
					          	<tr style="font-size: 10px;">
					          		<td width="100px">Code</td>
					          		<td><input type="text" name="codeEmp"/></td>
					          	</tr>
					          	<tr style="font-size: 10px;">
					          		<td width="100px">Nom</td>
					          		<td><input type="text" name="nomEmp"/></td>
					          	</tr>
					          	
					          </table>
					          <br/><br/>
					          <table class="table table-striped">
					          	<tr style="font-size: 10px;">
					          		<td width="33%">Code</td>
					          		<td width="33%">Nom</td>
					          		<td width="33%">Département</td>
					          	</tr>
					          	<%
						          	if(listPers != null){
											for(Personel per : listPers){
												%>
											<tr style="font-size: 10px;">
							        			<td width="33%"><%=per.getMatPers()%></td>
							        			<td width="33%"><%=per.getNomPers()%></td>
							        			<td width="33%"><%=per.getLibDep()%></td>
						        			</tr>
												<% 
											}
										}
					          	 %>
					          </table>
					        </div>
					        <div class="modal-footer">
					          <button type="button" style="font-size: 10px;"
					          			data-dismiss="modal">Annuler</button>
					          <button type="button" style="font-size: 10px;"
					          			data-dismiss="modal">OK</button>
					        
					        </div>
					      </div>
					      
					    </div>
    					</div>
    					
    					<!-- Modal Transporteur-->
					<div class="modal fade" id="transporteur" role="dialog">
    					<div class="modal-dialog">
    					<!-- Modal content-->
					      <div class="modal-content">
					        <div class="modal-header">
					          <button type="button" class="close" data-dismiss="modal">&times;</button>
					          <h6 class="modal-title">Recherche Transporteur</h6>
					        </div>
					        <div class="modal-body" style="font-size: 10px;">
					          <table>
					          	<tr style="font-size: 10px;">
					          		<td width="100px">Code</td>
					          		<td><input type="text" name="codeTrans"/></td>
					          	</tr>
					          	<tr style="font-size: 10px;">
					          		<td width="100px">Nom</td>
					          		<td><input type="text" name="nomTrans"/></td>
					          	</tr>
					          </table>
					          <br/><br/>
					          <table class="table table-striped">
					          	<tr style="font-size: 10px;">
					          		<td width="30%">Code</td>
					          		<td width="70%">Nom</td>
					          	</tr>
					          	
					          	<%
					          	if(listTransp != null){
					        		for(Transp tra : listTransp){
					        			%>
					        			<tr style="font-size: 10px;">
					        			<td><%=tra.getCodTrans()%></td>
					        			<td><%=tra.getLibTrans()%></td>
					        			</tr>
					        			<% 
					        		}
					        	}
					          	%>
					          </table>
					        </div>
					        <div class="modal-footer">
					          <button type="button" style="font-size: 10px;"
					          			data-dismiss="modal">Annuler</button>
					          <button type="button" style="font-size: 10px;"
					          			data-dismiss="modal">OK</button>
					        
					        </div>
					      </div>
					      
					    </div>
    					</div>
    					
    				<!-- Modal Vehicle-->
					<div class="modal fade" id="vehicle" role="dialog">
    					<div class="modal-dialog">
    					<!-- Modal content-->
					      <div class="modal-content">
					        <div class="modal-header">
					          <button type="button" class="close" data-dismiss="modal">&times;</button>
					          <h6 class="modal-title">Recherche Vehicule</h6>
					        </div>
					        <div class="modal-body" style="font-size: 10px;">
					          <table>
					          	<tr style="font-size: 10px;">
					          		<td width="100px">Immatriculation</td>
					          		<td><input type="text" name="immatr"/></td>
					          	</tr>
					          	<tr style="font-size: 10px;">
					          		<td width="100px">Nom</td>
					          		<td><input type="text" name="nomVeh"/></td>
					          	</tr>
					          </table>
					          <br/><br/>
					          <table class="table table-striped">
					          	<tr style="font-size: 10px;">
					          		<td width="30%">Code</td>
					          		<td width="30%">Immatriculation</td>
					          		<td width="40%">Libellé</td>
					          	</tr>
					          </table>
					        </div>
					        <div class="modal-footer">
					          <button type="button" style="font-size: 10px;"
					          			data-dismiss="modal">Annuler</button>
					          <button type="button" style="font-size: 10px;"
					          			data-dismiss="modal">OK</button>
					        
					        </div>
					      </div>
					      
					    </div>
    					</div>
	</div>

<!-- <script src="https://code.jquery.com/jquery-3.1.1.js"
          integrity="sha256-16cdPddA6VdVInumRGo6IbivbERE8p7CQR3HzTBuELA=" crossorigin="anonymous"></script> -->
          
        <!-- Include all compiled plugins (below), or include individual files as needed -->
        <!-- <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> -->
        <script src="${pageContext.request.contextPath}/resources/js/navbar.js"></script>
</body>
</html>