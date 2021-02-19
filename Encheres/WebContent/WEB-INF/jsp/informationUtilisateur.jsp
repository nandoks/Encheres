<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta content="width=device-width, initial-scale=1" name="viewport">
<link href="css/main.css" rel="stylesheet" type="text/css">
<link href="css/eni1.css" rel="stylesheet" type="text/css">
<title>Utilisateur - ${utilisateur.pseudo}</title>
</head>
<body>


	<div>
	<div>
	<p>Pseudo:</p>
	<p>${utilisateur.pseudo}</p>
	</div>
	<div>
	<p>Nom:</p>
	<p>${utilisateur.nom}</p>
	</div>
	<div>
	<p>Prenom:</p>
	<p>${utilisateur.prenom}</p>
	</div>
	<div>
	<p>Téléphone:</p>
	<p>${utilisateur.telephone}</p>
	</div>
	<div>
	<p>Rue:</p>
	<p>${utilisateur.rue}</p>
	</div>
	<div>
	<p>Code Postal:</p>
	<p>${utilisateur.codePostal}</p>
	</div>
	<div>
	<p>Ville:</p>
	<p>${utilisateur.ville}</p>
	</div>
	</div>
	

</body>
</html>