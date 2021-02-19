<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
	<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
		<html>

		<head>
			<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
			<title>Page sécurisée</title>
			<meta content="width=device-width, initial-scale=1" name="viewport">
			<link href="css/main.css" rel="stylesheet" type="text/css">
			<link href="css/eni1.css" rel="stylesheet" type="text/css">
		</head>

		<body>
			<div class="page">
				<div class="page-contenu-motdepasse-formulaire">
					<form action="<%=request.getContextPath()%>/authentification" method="post"
						class="page-formulaire-motdepasse">
						<img src="img/photo-1582139329536-e7284fece509.jpg" alt=""
							sizes="(max-width: 479px) 100vw, 260px"
							srcset="images/photo-1582139329536-e7284fece509-p-500.jpeg 500w, images/photo-1582139329536-e7284fece509.jpg 800w"
							class="image-2">
						<h2>Connexion</h2>
						<label class="champs-label-2">Identifiant</label> <input type="text" class="entree"
							maxlength="256" name="identifiant" data-name="identifiant"
							placeholder="email ou nom d'utilisateur" id="identifiant" required="" autofocus="true">
						<label for="identifiant" class="champs-label">Mot de passe</label> <input type="password"
							maxlength="256" name="pass" id="pass" placeholder="Entrez votre mot de passe"
							class="texte-champs motdepasse entree"> <label class="cocher cocher-champs"> <input
								type="checkbox" id="Se souvenir de moi" name="Se-souvenir-de-moi"
								data-name="Se souvenir de moi" class="cocher-entree cocher">
							<span for="Se souvenir de moi" class="formulaire-label">Se
								souvenir de moi</span>
						</label>
						<div class="conteneur-2 conteneur">
							<input type="submit" value="Je me connecte" data-wait="Veuillez patienter..."
								class="soumettre-bouton motdepasse bouton">
						</div>
						<c:if test="${!empty messageErreur}">
							<div class="motdepasse formulaire-echec">
								<div>
									<c:out value="${messageErreur}" />
								</div>
							</div>
						</c:if>
					</form>
				</div>
			</div>
		</body>

		</html>