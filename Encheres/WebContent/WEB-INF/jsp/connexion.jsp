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
					<div class="conteneur-2 s-conteneur">
                        <input type="submit" value="Mot de passe oublie" data-wait="Veuillez patienter..." class="bouton page s-bouton">
                    </div>
				</form>
			</div>
		</div>
	</div>
	<div class="div-block-5 ">
		<jsp:include page="/WEB-INF/fragments/piedDePage.jsp" />
	</div>
</body>

</html>