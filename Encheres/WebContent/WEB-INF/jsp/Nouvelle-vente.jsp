<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>

<html>

<head>
    <meta charset="utf-8">
    <title>Nouvelle vente</title>
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
    <section id="contact-form" class="contact-formulaire">
        <div class="conteneur-9 conteneur"></div>
        <div class="div-block-12">
            <h2 class="conteneur conteneur-1 titre1">Nouvelle vente</h2>
            <div class="formulaire-block-2 formulaire">
                <form id="formulaireNouvelleVente" name="formulaireNouvelleVente" data-name="formulaire nouvelle vente">
                    <label for="Article">Article</label>
                    <input type="text" class="entree" maxlength="256" name="article" data-name="article" placeholder="Nom de l'article" id="Article" required="">
                    <div data-hover="" data-delay="0" class="deroulant deroulant2">
                        <div class="select">
                            <select name="select" id="select">
                                    <option non selected>Catégories (toutes)</option>
                                    <option value="ameublement">Ameublement</option>
                                    <option value="informatique">Informatique</option>
                                    <option value="sport">Sport et Loisirs</option>
                                    <option value="vetements">Vêtements</option>
                                </select>
                        </div>
                    </div>
                    <input type="text" class="entreedouble" maxlength="256" name="description" data-name="description" placeholder="Description de l'article" id="Description" required="">
                    <div class="upload-photo">
                        <span>Ajouter une photo</span>
                        <input type="file" class="upload" maxlength="256" name="photoArticle" data-name="photo de l'article" placeholder="" id="PhotoArticle" required="">
                    </div>
                    <br>
                    <label for="misePrix">Mise à prix</label>
                    <input type="text" class="entree" maxlength="256" name="misePrix" data-name="mise a prix" placeholder="Prix initial de l'article" id="Mise-prix" required="">
                    <label for="debut">Début de l'enchère</label>
                    <input type="text" class="entree" maxlength="256" name="debut" data-name="debut de l enchere" placeholder="Date de début des enchères" id="Debut" required="">
                    <label for="fin">Fin de l'enchère</label>
                    <input type="text" class="entree" maxlength="256" name="fin" data-name="fin de l enchere" placeholder="Date de fin des enchères" id="Fin" required="">
                    <div class="div-block-10">
                        <br>
                        <span class="champs-label-4">Retrait</span>
                        <div class="br1"></div>
                        <input type="text" class="entree" value = "${utilisateur.rue}" maxlength="256" name="rue" data-name="rue" placeholder="Rue" id="Rue" required="">
                        <input type="text" class="entree" value = "${utilisateur.codePostal}" maxlength="256" name="codePostal" data-name="code postal" placeholder="Code postal" id="Code-postal" required="">
                        <input type="text" class="entree" value = "${utilisateur.ville}"maxlength="256" name="ville" data-name="ville" placeholder="Ville" id="Ville" required="">
                    </div>
                    <div>
                        <input type="submit" value="Annuler" data-wait="Veuillez patienter..." class="bouton-soumettre-3 bouton">
                    </div>
                    <input type="submit" value="Enregistrer" data-wait="Veuillez patienter..." class="bouton-soumettre-3 bouton">
                    <input type="submit" value="Annuler la vente" data-wait="Veuillez patienter..." class="bouton-soumettre-4 bouton">
                </form>
                <div class="formulaire-rempli">
                    <div>Merci! Votre formulaire a bien été réceptionné !</div>
                </div>
                <div class="formulaire-echec">
                    <div>Oups! Quelque chose s'est mal passé durant l'envoi du formulaire.</div>
                </div>
            </div>
        </div>
        <div class="div-block-9"></div>
    </section>
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