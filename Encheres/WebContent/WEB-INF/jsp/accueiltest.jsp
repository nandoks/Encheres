<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
    <meta charset="utf-8">
    <title>ENI Enchères</title>
    <meta content="width=device-width, initial-scale=1" name="viewport">
    <link href="css/style.css" rel="stylesheet" type="text/css">
</head>

<body>
    <div class="section">
        <div class="div-block">
            <div class="div-block-2">
                <img src="img/ENIEcole-1.jpg" loading="lazy" sizes="(max-width: 479px) 100vw, 75px" alt="" class="image-5">
            </div>
            <a href="index.html" aria-current="page" class="lien-block ligne-block rangee1">
                <h1 class="titre">ENI Enchères</h1>
            </a>
            <a href="${pageContext.request.contextPath}/authentification" class="lien">Connection</a>
            <a href="${pageContext.request.contextPath}/creationCompte" class="lien">Inscription</a>
        </div>
    </div>
    <div class="conteneur conteneur-1">
        <h1 class="titre1">Liste des enchères</h1>
    </div>
    <div class="conteneur">
        <form action="${pageContext.request.contextPath}/accueil" class="correction formulaire" method="post">
            <div class="div-block-4">
                <input type="search" class="entree" maxlength="256" name="recherche" placeholder="Le nom de l'article contient…" id="search" required="">
                <div data-hover="" data-delay="0" class="deroulant">
                    <div class="deroulant-bascule deroulant-toggle">
                        <div class="icon-deroulant-toggle"></div>
                        <div class="texte-block">Catégorie (toutes)</div>
                    </div>
                    <nav class="deroulant-list">
                        <div class="choix-list">
                            <div role="list" class="choix-items">
                                <div role="listitem" class="choix-item"></div>
                            </div>
                            <div class="choix-vide">
                                <div>Vide</div>
                            </div>
                        </div>
                        <div class="choix-list">
                            <div role="list" class="choix-items">
                                <div role="listitem" class="choix-item"></div>
                            </div>
                            <div class="choix-vide">
                                <div>Vide</div>
                            </div>
                        </div>
                        <div class="choix-list">
                            <div role="list" class="choix-items">
                                <div role="listitem" class="choix-item"></div>
                            </div>
                            <div class="choix-vide">
                                <div>Vide</div>
                            </div>
                        </div>
                        <div class="choix-list">
                            <div role="list" class="choix-items">
                                <div role="listitem" class="choix-item"></div>
                            </div>
                            <div class="choix-vide">
                                <div>Vide</div>
                            </div>
                        </div>
                        <a href="#" class="deroulant-lien">Lien 1</a>
                        <a href="#" class="deroulant-lien">Lien 2</a>
                        <a href="#" class="deroulant-lien">Lien 3</a>
                        <a href="#" class="deroulant-lien">Lien 4</a>
                    </nav>
                </div>
            </div>
            <input type="submit" value="Rechercher" class="bouton-recherche">
        </form>
    </div>
    <div class="conteneur-grille conteneur">
        
                <c:forEach var="article" items="${listeArticles}">
            
                    <div>
                        <img src="img/ENIEcole-1.jpg" loading="lazy" sizes="75px" alt="" class="image-4">
                    </div>
                
                    <ul role="list" class="liste-style">
                    
                        <li class="liste-item-3">${article.nomArticle}</li>
                        <li>Prix : ${article.miseAPrix} points</li>
                        <li>Fin de l'enchère : ${article.dateFinEncheres}</li>
                        <li>Vendeur : ${article.pseudoVendeur}</li>
                    </ul>
             	</c:forEach>
               
            
    </div>
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
                                <a href="#" class="pied-lien">Troc</a>
                            </li>
                            <li>
                                <a href="#" class="pied-lien">Recyclage</a>
                            </li>
                            <li>
                                <a href="#" class="pied-lien">Associatif</a>
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
                                <a href="#" class="pied-lien">Entreprises</a>
                            </li>
                            <li>
                                <a href="#" class="pied-lien">Associations</a>
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