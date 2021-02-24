	<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>${utilisateur.pseudo} a remporté la vente</title>
    <meta content="width=device-width, initial-scale=1" name="viewport">
    <link href="css/style.css" rel="stylesheet" type="text/css">
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
    <div class="colonnes conteneur">
        <h1 class="conteneur conteneur-1 titre1">
            <div class="jojo">Jojo44</div>
            a remporté la vente
        </h1>
    </div>
    <div class="colonnes rangee">
        <div class="col-14">
            <img src="images/tingey-injury-law-firm-veNb0DDegzE-unsplash.jpg" loading="lazy" width="300" height="200" sizes="(max-width: 479px) 92vw, (max-width: 767px) 300px, 23vw" alt="" class="image-3">
        </div>
        <div class="col col-13">
            <div class="conteneur-7 conteneur">
                <h3 class="titre-4">Rocket stove pour riz et pâtes</h3>
                <div class="div-block-11">
                    <h4 class="titre-3">Description</h4>
                    <p class="paragraphe">
                        Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse varius enim in eros elementum tristique. Duis cursus, mi quis viverra ornare, eros dolor interdum nulla, ut commodo diam libero vitae erat. Aenean faucibus nibh et justo cursus id rutrum
                        lorem imperdiet. Nunc ut sem vitae risus tristique posuere.
                    </p>
                </div>
                <div class="disposition-grille grille">
                    <h4>Meilleure offre</h4>
                    <p class="paragraphe">210 points</p>
                    <h4>Mise à prix</h4>
                    <p class="paragraphe">185 points</p>
                    <h4>Fin de l'enchère</h4>
                    <p class="paragraphe">
                        09/10/2018
                    </p>
                    <h4>Vendeur</h4>
                    <p class="paragraphe">NineJea</p>
                    <h4>Tel</h4>
                    <p class="paragraphe">06 06 06 06 06</p>
                </div>
            </div>
        </div>
    </div>
    <div class="conteneur-10 conteneur">
        <a href="#" class="bouton">Retour à l'accueil</a>
    </div>
    <div class="div-block-5 ">
		<jsp:include page="/WEB-INF/fragments/piedDePage.jsp" />
	</div>
</body>