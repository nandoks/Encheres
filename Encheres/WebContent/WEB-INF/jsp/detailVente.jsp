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
</head>

<body>
    <div class="section">
        <div class="div-block">
            <div class="div-block-2">
                <img src="images/ENIEcole-1.jpg" loading="lazy" sizes="(max-width: 479px) 100vw, 75px" alt="" class="image-5">
            </div>
            <a href="index.html" class="lien-block ligne-block">
                <h1 class="titre">ENI Enchères</h1>
            </a>
            <a href="#" class="lien">Connection</a>
            <a href="#" class="lien">Inscription</a>
        </div>
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
                    <p class="paragraphe">X points par Bob</p>
                    <h4>Mise à prix</h4>
                    <p class="paragraphe">${article.miseAPrix} points</p>
                    <h4>Fin de l'enchère</h4>
                    <p class="paragraphe">${article.dateFinEncheres}</p>
                    <h4>Retrait</h4>
                    <p class="paragraphe">${article.adresseRetrait}</p>
                    <h4>Vendeur</h4>
                    <p class="paragraphe">${pseudoVendeur}</p>
                    <c:choose>
                    	<c:when test="${sessionScope.utilisateurConnecte.numeroUtilisateur == article.numeroUtilisateur}">
							 <button><a href="ServletModificationVente?no_article=${article.noArticle}">Modifier</a></button>
						</c:when>
						<c:otherwise>
							<form method="post" action="${pageContext.request.contextPath}/ServletEncherir">
								<input type="number" name="enchere" value="${article.miseAPrix}" min="${article.miseAPrix}">
								<input type="submit" value="Enchérir">
							</form>
						</c:otherwise>
				
				
					</c:choose>
                </div>
            </div>
        </div>
    </div>
    <div class="conteneur-10 conteneur">
      <a href="index.jsp" class="bouton">Retour à l'accueil</a>
    </div>
    <div class="div-block-5">
        <footer id="footer" class="pied-2">
            <div class="conteneur">
                <div class="pied-conteneur-2">
                    <div>
                        <h2 class="pied-titre">Nos sujets</h2>
                        <ul role="list" class="liste liste-style">
                            <li>
                                <a href="#" class="pied-lien">Commerce equitable</a>
                            </li>
                            <li>
                                <a href="#" class="pied-lien">Circuit-courts</a>
                            </li>
                            <li>
                                <a href="#" class="pied-lien">Recyclage</a>
                            </li>
                            <li>
                                <a href="#" class="pied-lien">Associatif</a>
                            </li>
                            <li>
                                <a href="#" class="pied-lien">Troc</a>
                            </li>
                        </ul>
                    </div>
                    <div>
                        <h2 class="pied-titre">Nous contacter</h2>
                        <ul role="list" class="liste-2 liste-style">
                            <li>
                                <a href="#" class="pied-lien">Par mail</a>
                            </li>
                            <li>
                                <a href="#" class="pied-lien">Par courrier</a>
                            </li>
                        </ul>
                    </div>
                    <div>
                        <h2 class="pied-titre">Partenaires</h2>
                        <ul role="list" class="liste-3 liste-style">
                            <li>
                                <a href="#" class="pied-lien">Collectivités territoriales</a>
                            </li>
                            <li>
                                <a href="#" class="pied-lien">Associations</a>
                            </li>
                            <li>
                                <a href="#" class="pied-lien">Entreprises</a>
                            </li>
                        </ul>
                    </div>
                </div>
                <div class="texte-block-2">Copyright © 2021 Groupe E Project 1 ENI. Tous droits réservés.</div>
            </div>
        </footer>
    </div>
    
</body>


</html>