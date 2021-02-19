<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <title>ENI Enchères</title>
    <meta content="width=device-width, initial-scale=1" name="viewport">
    <link href="css/style.css" rel="stylesheet" type="text/css">
</head>

<body>
<form method="post" action="<%=request.getContextPath()%>//accueil"class="page-formulaire-creationcompte">
    <div class="section">
        <div class="div-block">
            <div class="div-block-2">
                <img src="img/ENIEcole-1.jpg" loading="lazy" sizes="(max-width: 479px) 100vw, 75px" alt="" class="image-5">
            </div>
            <a href="index.html" aria-current="page" class="lien-block ligne-block rangee1">
                <h1 class="titre">ENI Enchères</h1>
            </a>
            <a href="authentification" class="lien">Connection</a>
            <a href="creationCompte" class="lien">Inscription</a>
        </div>
    </div>
    <div class="conteneur conteneur-1">
        <h1 class="titre1">Liste des enchères</h1>
    </div>
    <div class="conteneur">
        <form action="/recherche" class="correction formulaire" method=>
            <div class="div-block-4">
                <input type="search" class="entree" maxlength="256" name="query" placeholder="Le nom de l'article contient…" id="search" required="">
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
        <div class="grille-acceuil">
            <div class="rangee">
                <div class="col col-3">
                    <div>
                        <img src="img/ENIEcole-1.jpg" loading="lazy" sizes="75px" alt="" class="image-4">
                    </div>
                </div>
                <div class="col col-9">
                    <ul role="list" class="liste-style">
                        <li class="liste-item-3">PC Gamer pour travailler</li>
                        <li>Prix : 210 points</li>
                        <li>Fin de l'enchère : 10/08/2018</li>
                        <li>Vendeur : jojo44</li>
                    </ul>
                </div>
            </div>
            <div class="rangee">
                <div class="col col-3">
                    <div>
                        <img src="images/ENIEcole-1.jpg" loading="lazy" sizes="75px" alt="" class="image-4">
                    </div>
                </div>
                <div class="col col-9">
                    <ul role="list" class="liste-style">
                        <li class="liste-item-4">PC Gamer pour travailler</li>
                        <li>Prix : 210 points</li>
                        <li>Fin de l'enchère : 10/08/2018</li>
                        <li>Vendeur : jojo44</li>
                    </ul>
                </div>
            </div>
            <div class="rangee">
                <div class="col col-3">
                    <div>
                        <img src="images/ENIEcole-1.jpg" loading="lazy" sizes="75px" alt="" class="image-4">
                    </div>
                </div>
                <div class="col col-9">
                    <ul role="list" class="liste-style">
                        <li class="liste-item-8">PC Gamer pour travailler</li>
                        <li>Prix : 210 points</li>
                        <li>Fin de l'enchère : 10/08/2018</li>
                        <li>Vendeur : jojo44</li>
                    </ul>
                </div>
            </div>
            <div class="rangee">
                <div class="col col-3">
                    <div>
                        <img src="images/ENIEcole-1.jpg" loading="lazy" sizes="75px" alt="" class="image-4">
                    </div>
                </div>
                <div class="col col-9">
                    <ul role="list" class="liste-style">
                        <li class="liste-item-5">PC Gamer pour travailler</li>
                        <li>Prix : 210 points</li>
                        <li>Fin de l'enchère : 10/08/2018</li>
                        <li>Vendeur : jojo44</li>
                    </ul>
                </div>
            </div>
            <div class="rangee">
                <div class="col col-3">
                    <div>
                        <img src="images/ENIEcole-1.jpg" loading="lazy" sizes="75px" alt="" class="image-4">
                    </div>
                </div>
                <div class="col col-9">
                    <ul role="list" class="liste-style">
                        <li class="liste-item-7">PC Gamer pour travailler</li>
                        <li>Prix : 210 points</li>
                        <li>Fin de l'enchère : 10/08/2018</li>
                        <li>Vendeur : jojo44</li>
                    </ul>
                </div>
            </div>
            <div class="rangee">
                <div class="col col-3">
                    <div>
                        <img src="images/ENIEcole-1.jpg" loading="lazy" sizes="75px" alt="" class="image-4">
                    </div>
                </div>
                <div class="col col-9">
                    <ul role="list" class="liste-style">
                        <li class="liste-item-6">PC Gamer pour travailler</li>
                        <li>Prix : 210 points</li>
                        <li>Fin de l'enchère : 10/08/2018</li>
                        <li>Vendeur : jojo44</li>
                    </ul>
                </div>
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