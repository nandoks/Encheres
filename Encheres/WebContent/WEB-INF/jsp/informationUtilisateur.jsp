<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta content="width=device-width, initial-scale=1" name="viewport">
<link href="css/style.css" rel="stylesheet" type="text/css">
<title>Utilisateur - ${utilisateur.pseudo}</title>
</head>
<body>
	
	<div class="section">
			<c:if test="${empty utilisateurConnecte}">
				<jsp:include page="/WEB-INF/fragments/enteteDeconnecte.jsp" />
			</c:if>
			<c:if test="${not empty utilisateurConnecte}">
				<jsp:include page="/WEB-INF/fragments/enteteConnecte.jsp" />
			</c:if>
	</div>

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
	
	
	<c:if test="${sessionScope.utilisateurConnecte.numeroUtilisateur == utilisateur.numeroUtilisateur}">
		<a href="modificationCompte?no_utilisateur=${utilisateur.numeroUtilisateur}" > <button> Modifier </button> </a>
	</c:if>
	
	<div class="div-block-5 ">
		<jsp:include page="/WEB-INF/fragments/piedDePage.jsp" />
	</div>
	
</body>
</html>






