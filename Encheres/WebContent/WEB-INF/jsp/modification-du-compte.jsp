<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <title>Modification du compte</title>
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
    <div class="section-2">
        <h1 class="conteneur conteneur-1 titre1">Mon Profil</h1>
    </div>
    <div class="conteneur-13 conteneur">
        <div class="formulaire">
            <form id="email-form" name="email-form" data-name="email Form" class="clearfix">
                <div class="rangee">
                    <div class="colonne col-6">
                        <label for="Pseudo">Pseudo</label>
                        <input type="email" class="entree" maxlength="256" name="pseudo" data-name="pseudo" placeholder="Azerty123" id="Pseudo" required="">
                        <label for="Email-2">Adresse email</label>
                        <input type="text" class="entree" maxlength="256" name="email" data-name="email" placeholder="@email.com" id="Email-2">
                        <label for="T-l-phone">Téléphone</label>
                        <input type="text" class="entree" maxlength="256" name="tlPhone" data-name="téléphone" placeholder="06 06 06 06 06" id="T-l-phone" required="">
                        <label for="Code-Postal">Code Postal</label>
                        <input type="text" class="entree" maxlength="256" name="codePostal" data-name="Code Postal" placeholder="00 000" id="Code-Postal" required="">
                        <label for="Rue">Rue</label>
                        <input type="text" class="entree" maxlength="256" name="rue" data-name="Rue" placeholder="Rue de la Fontaine" id="Rue" required="">
                        <label for="Ville">Ville</label>
                        <input type="text" class="entree" maxlength="256" name="ville" data-name="ville" placeholder="Nantes" id="Ville" required="">
                    </div>
                    <div class="colonne col-6">
                        <label for="Pr-nom">Prénom</label>
                        <input type="text" class="entree" maxlength="256" name="prenom" data-name="prenom" placeholder="Pierre" id="Pr-nom" required="">
                        <label for="Nom">Nom de famille</label>
                        <input type="text" class="entree" maxlength="256" name="nom" data-name="nom" placeholder="Lepaul" id="Nom" required="">
                        <label for="Mot-de-passe-actuel">Mot de passe actuel</label>
                        <input type="text" class="entree" maxlength="256" name="motDePasseActuel" data-name="mot de passe actuel" placeholder="Votre mot de passe actuel" id="Mot-de-passe-actuel" required="">
                        <label for="Nouveau-mot-de-passe">Nouveau mot de passe</label>
                        <input type="text" class="entree" maxlength="256" name="nouveauMotDePasse" data-name="nouveau mot de passe" placeholder="Choisissez un nouveau mot de passe" id="Nouveau-mot-de-passe" required="">
                        <label for="Confirmation-du-nouveau-mot-de-passe" class="champs-label-4">Confirmation du nouveau mot de passe</label>
                        <input type="text" class="entree" maxlength="256 " name="confirmationDuNouveauMotDePasse" data-name="confirmation du nouveau mot de passe " placeholder="Confirmez votre nouveau mot de passe " id="Confirmation-du-nouveau-mot-de-passe" required=" ">
                    </div>
                </div>
                <input type="soumettre " value="Supprimer mon compte " data-wait="Veuillez patienter... " class="bouton-soumettre-4 s-bouton ">
                <input type="soumettre " value="Enregistrer " data-wait="Veuillez patienter... " class="bouton-soumettre-3 s-bouton ">
            </form>
            <div class="formulaire-rempli ">
                <div>Merci! Votre formulaire a bien été réceptionné !</div>
            </div>
            <div class="formulaire-echec ">
                <div>Oups! Quelque chose s'est mal passé durant l'envoi du formulaire.</div>
            </div>
        </div>
    </div>
    <div class="div-block-5 ">
        <footer id="footer " class="pied-2 ">
            <div class="conteneur ">
                <div class="pied-conteneur-2 ">
                    <div>
                        <h2 class="pied-titre ">Nos sujets</h2>
                        <ul role="list " class="liste liste-style ">
                            <li>
                                <a href="# " class="pied-lien ">Commerce equitable</a>
                            </li>
                            <li>
                                <a href="# " class="pied-lien ">Circuit-courts</a>
                            </li>
                            <li>
                                <a href="# " class="pied-lien ">Recyclage</a>
                            </li>
                            <li>
                                <a href="# " class="pied-lien ">Associatif</a>
                            </li>
                            <li>
                                <a href="# " class="pied-lien ">Troc</a>
                            </li>
                        </ul>
                    </div>
                    <div>
                        <h2 class="pied-titre ">Nous contacter</h2>
                        <ul role="list " class="liste-2 liste-style ">
                            <li>
                                <a href="# " class="pied-lien ">Par mail</a>
                            </li>
                            <li>
                                <a href="# " class="pied-lien ">Par courrier</a>
                            </li>
                        </ul>
                    </div>
                    <div>
                        <h2 class="pied-titre ">Partenaires</h2>
                        <ul role="list " class="liste-3 liste-style ">
                            <li>
                                <a href="# " class="pied-lien ">Collectivités territoriales</a>
                            </li>
                            <li>
                                <a href="# " class="pied-lien ">Associations</a>
                            </li>
                            <li>
                                <a href="# " class="pied-lien ">Entreprises</a>
                            </li>
                        </ul>
                    </div>
                </div>
                <div class="texte-block-2 ">Copyright © 2021 Groupe E Project 1 ENI. Tous droits réservés.</div>
            </div>
        </footer>
    </div>
  
</body>
</html>