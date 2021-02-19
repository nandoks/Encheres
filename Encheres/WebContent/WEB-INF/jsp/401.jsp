<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <title>Page sÃ©curisÃ©e</title>
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
                <h1 class="titre">ENI EnchÃ¨res</h1>
            </a>
            <a href="#" class="lien">Connection</a>
            <a href="#" class="lien">Inscription</a>
        </div>
    </div>
    <div class="centrer">
        <div class="page-utilitaire">
            <div class="page-utilitaire-contenu s-formulaire">
                <form action="/authentification" method="post" class="formulaire-page-utilitaire">
                    <img src="images/photo-1582139329536-e7284fece509.jpg" alt="" sizes="(max-width: 479px) 100vw, 260px" class="image-2">
                    <div class="conteneur conteneur-1 titre1">
                        <h1>Connection</h1>
                    </div>
                    <label class="champs-label-2">Identifiant</label>
                    <input type="text" autofocus="true" class="s-entree" maxlength="256" name="Identifiant" data-name="Identifiant" placeholder="Email ou nom d'utilisateur" id="Identifiant" required="">
                    <label for="Identifiant" class="champs-label">Mot de passe</label>
                    <input type="password" maxlength="256" name="pass" id="pass" placeholder="Entrez votre mot de passe" class="texte-champs page s-entree" required="">
                    <label class="s-checkbox cocher-champs">
                            <input
                                type="checkbox"
                                id="Se souvenir de moi"
                                name="Se-souvenir-de-moi"
                                data-name="Se souvenir de moi"
                                class="s-checkbox-input cocher"
                            >
                            <span for="Se souvenir de moi" class="">Se souvenir de moi</span>
                        </label>
                    <div class="conteneur-2 s-conteneur">
                        <input type="submit" value="Je me connecte" data-wait="Veuillez patienter..." class="bouton-soumettre page s-bouton">
                    </div>
                    <div class="page s-formulaire-echec">
                        <div>Mot de passe incorrect. Veuillez rÃ©essayer.</div>
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
                                <a href="#" class="pied-lien">CollectivitÃ©s territoriales</a>
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
                <div class="texte-block-2">Copyright Â© 2021 Groupe E Project 1 ENI. Tous droits rÃ©servÃ©s.</div>
            </div>
        </footer>
    </div>
</body>

</html>