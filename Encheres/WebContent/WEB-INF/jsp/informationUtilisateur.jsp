<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="utf-8">
            <meta content="width=device-width, initial-scale=1" name="viewport">
            <link href="css/style.css" rel="stylesheet" type="text/css">
            <title>Utilisateur - ${utilisateur.pseudo}</title>
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
                <h1 class="conteneur-1 titre1 utilisateur">${utilisateur.pseudo}</h1>

                <div class="disposition-grille">
                    <div>
                        <h4>Prenom</h4>
                        <p class="paragraphe">${utilisateur.prenom}</p>
                    </div>
                    <div>
                        <h4>Nom</h4>
                        <p class="paragraphe">${utilisateur.nom}</p>
                    </div>
                    <div>
                        <h4>Téléphone</h4>
                        <p class="paragraphe">${utilisateur.telephone}</p>
                    </div>
                    <div>
                        <h4>Rue</h4>
                        <p class="paragraphe">${utilisateur.rue}</p>
                    </div>
                    <div>
                        <h4>Code Postal</h4>
                        <p class="paragraphe">${utilisateur.codePostal}</p>
                    </div>
                    <div>
                        <h4>Ville</h4>
                        <p class="paragraphe">${utilisateur.ville}</p>
                    </div>
                </div>

                <br><br>
                <c:if test="${sessionScope.utilisateurConnecte.numeroUtilisateur == utilisateur.numeroUtilisateur}">
                    <a href="modificationCompte?no_utilisateur=${utilisateur.numeroUtilisateur}">
                        <button class="bouton"> Modifier </button> </a>
                </c:if>
            </div>
            <div class="div-block-5 ">
                <jsp:include page="/WEB-INF/fragments/piedDePage.jsp" />
            </div>

        </body>

        </html>