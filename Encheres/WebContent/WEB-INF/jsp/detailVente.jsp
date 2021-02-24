<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <title>Détail de la vente</title>
    <meta content="width=device-width, initial-scale=1" name="viewport">
    <link href="css/style.css" rel="stylesheet" type="text/css">
    <title>Details de la vente</title>
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
    <div class="conteneur">
        <h1 class="conteneur conteneur-1 titre1">Détail de la vente</h1>
    </div>
    <div class="colonnes rangee">
        <div class="col-14">
            <img src="images/tingey-injury-law-firm-veNb0DDegzE-unsplash.jpg" loading="lazy" width="300" height="200" sizes="(max-width: 479px) 92vw, (max-width: 767px) 300px, 23vw" alt="" class="image-3">
        </div>
        <div class="col">
            <div class="conteneur-7 conteneur">
                <h3 class="titre-4">${article.nomArticle}</h3>
                <div class="div-block-11">
                    <h4 class="titre-3">Description</h4>
                    <p class="paragraphe">${article.description}</p>
                </div>
                <div class="disposition-grille grille">
                    <h4>Catégorie</h4>
                    <p class="paragraphe">${article.libelleCategorie}</p>
                    <h4>Meilleure offre</h4>
                    <p class="paragraphe">210 points par Bob</p>
                    <h4>Mise à prix</h4>
                    <p class="paragraphe">${article.miseAPrix} points</p>
                    <h4>Fin de l'enchère</h4>
                    <p class="paragraphe">${article.dateFinEncheres}</p>
                    <h4>Retrait</h4>
                    <p class="paragraphe">${article.adresseRetrait}</p>
                    <h4>Vendeur</h4>
                    <p class="paragraphe">${pseudoVendeur}</p>
                </div>
            </div>
        </div>
    </div>
    <div class="conteneur-10 conteneur">
      <a href="index.jsp" class="bouton">Retour à l'accueil</a>
    </div>
    <div class="div-block-5 ">
		<jsp:include page="/WEB-INF/fragments/piedDePage.jsp" />
	</div>
    
</body>


</html>