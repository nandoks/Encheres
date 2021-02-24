<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<title>Page sécurisée</title>
<meta content="width=device-width, initial-scale=1" name="viewport">
<link href="css/style.css" rel="stylesheet" type="text/css">
</head>

<body>
	<div class="section">
		<jsp:include page="/WEB-INF/fragments/enteteDeconnecte.jsp" />
	</div>
	<div class="centrer">
		<div class="page-utilitaire">
			<div class="page-utilitaire-contenu formulaire">
				<form action="<%=request.getContextPath()%>/authentification"
					method="post" class="page-formulaire-motdepasse">
					<img src="img/photo-1582139329536-e7284fece509.jpg" alt=""
						sizes="(max-width: 479px) 100vw, 260px"
						srcset="../img/photo-1582139329536-e7284fece509-p-500.jpeg 500w, ../img/photo-1582139329536-e7284fece509.jpg 800w"
						class="image-2">
					<h2>Connexion</h2>
					<c:if test="${!empty messageErreur}">
						<div class="">
							<div>
								<c:out value="${messageErreur}" />
							</div>
						</div>
					</c:if>
					<label class="champs-label-2">Identifiant</label> <input
						type="text" class="entree" maxlength="256" name="identifiant"
						data-name="identifiant" placeholder="email ou nom d'utilisateur"
						id="identifiant" required="" autofocus="true"> <label
						for="identifiant" class="champs-label">Mot de passe</label> <input
						type="password" maxlength="256" name="pass" id="pass"
						placeholder="Entrez votre mot de passe"
						class="texte-champs motdepasse entree"> <label
						class="cocher cocher-champs"> <input type="checkbox"
						id="Se souvenir de moi" name="Se-souvenir-de-moi"
						data-name="Se souvenir de moi" class="cocher-entree cocher">
						<span for="Se souvenir de moi" class="formulaire-label">Se
							souvenir de moi</span>
					</label>
					<div class="conteneur-2 conteneur">
						<input type="submit" value="Je me connecte"
							data-wait="Veuillez patienter..."
							class="soumettre-bouton motdepasse bouton">
					</div>
				</form>
			</div>
		</div>
	</div>
	<div class="div-block-5">
		<footer id="footer" class="pied-2">
			<div class="conteneur">
				<div class="pied-conteneur-2">
					<div>
						<h2 class="pied-titre">Nos sujets</h2>
						<ul role="list" class="liste liste-style">
							<li><a href="#" class="pied-lien">Commerce equitable</a></li>
							<li><a href="#" class="pied-lien">Circuit-courts</a></li>
							<li><a href="#" class="pied-lien">Recyclage</a></li>
							<li><a href="#" class="pied-lien">Associatif</a></li>
							<li><a href="#" class="pied-lien">Troc</a></li>
						</ul>
					</div>
					<div>
						<h2 class="pied-titre">Nous contacter</h2>
						<ul role="list" class="liste-2 liste-style">
							<li><a href="#" class="pied-lien">Par mail</a></li>
							<li><a href="#" class="pied-lien">Par courrier</a></li>
						</ul>
					</div>
					<div>
						<h2 class="pied-titre">Partenaires</h2>
						<ul role="list" class="liste-3 liste-style">
							<li><a href="#" class="pied-lien">Collectivités
									territoriales</a></li>
							<li><a href="#" class="pied-lien">Associations</a></li>
							<li><a href="#" class="pied-lien">Entreprises</a></li>
						</ul>
					</div>
				</div>
				<div class="texte-block-2">Copyright © 2021 Groupe E Project 1
					ENI. Tous droits réservés.</div>
			</div>
		</footer>
	</div>
</body>

</html>