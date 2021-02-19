<%@page import="javax.servlet.jsp.tagext.Tag"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>

<%-- head de la Connexion.jsp--%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Page sécurisée</title>
<meta content="width=device-width, initial-scale=1" name="viewport">
<link href="css/main.css" rel="stylesheet" type="text/css">
<link href="css/eni1.css" rel="stylesheet" type="text/css">
</head>

<body>
	<div class="page">
		<div class=" page-contenu-creationCompte-formulaire" >
			<form method="post" action="<%=request.getContextPath()%>/creationCompte"class="page-formulaire-creationcompte">
				<label for="pseudo">Pseudo :</label> 
				<input name="pseudo" id="pseudo" type="text" value="" size="20"maxlength="20" required="" /> 
				<br />

				<label for="prenom">Prénom :</label> 
				<input name="prenom" id="prenom" type="text" value="" size="20"maxlength="20" required="" /> 
				<br />

				<label for="telephone">Teléphone :</label> 
				<input name="telephone" id="telephone" type="text" value="" size="20"maxlength="20" required=""/> 
				<br />

				<label for="codePostal">Code Postal :</label> 
				<input name="codePostal" id="CodePostal" type="text" value="" size="20"maxlength="20" required=""/> 
				<br />

			
				<label for="nom">Nom :</label> <input name="nom" id="nom" type="text" value="" size="20"maxlength="20" /> 
				<br />
				
				<label for="email">Adresse email <span class="requis">*</span></label>
                <input type="text" id="email" name="email" value="" size="20" maxlength="60" required=""/>
                <br />
				
				<label for="rue">Rue :</label> 
				<input name="rue" id="rue" type="text" value="" size="20"maxlength="20" required=""/> 
				<br />
				
				<label for="ville"> Ville : </label> 
				<input name="ville" id="ville" type="text" value="" size="20"maxlength="20" required="" /> 
				<br />
				
				<%-- Validation du mot de passe, doit être le même que la confirmation--%>
				<label for = "motDePasse">Mot de passe : </label> 
				<input name="password" id="password" type="password" onkeyup='check();' required=""/>
				<br />
			
				<%-- Confirmation du mot de passe, doit être le même que le mot de passe--%>	
				<label for = "confirmation">Confirmation: </label> 
				<input type="password"	name="confirm_password" id="confirm_password" onkeyup='check();' required=""/>
					<span id='message'></span>
				</label>
				<br />
				
				<%= var check = function() {
 					if (document.getElementById('password').value) ==
    				document.getElementById('confirm_password').value) {
    				document.getElementById('message').style.color = 'green';
    				document.getElementById('message').innerHTML = 'matching';
  					} else {
    				document.getElementById('message').style.color = 'red';
    				document.getElementById('message').innerHTML = 'not matching';
  					}
				} %>
				
				<%-- Conteneur "Créer" et "Annuler"--%>
				<div class="conteneur-2 conteneur">
					<input type="submit" value="Créer" class="soumettre-bouton créerMonProfil bouton">
					<a class = "btn" href = "ServletCreationCompte" ></a>			
				</div>
				<div class="conteneur-2 conteneur">
					<input type="submit" value="Annuler" class="soumettre-bouton annulerCréationCompte bouton">
					<a class = "btn" href = "ServletAccueil" ></a>
				</div>
		</div>

	</div>

</body>
</html>