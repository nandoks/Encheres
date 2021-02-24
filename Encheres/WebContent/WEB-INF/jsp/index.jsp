<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>

<head>
<meta charset="UTF-8">
<title>ENI Enchères</title>
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
	<div class="conteneur conteneur-1">
		<h1 class="titre1">Liste des enchères</h1>
	</div>
	<div class="conteneur">
		
		<form action="${pageContext.request.contextPath}/accueilConecte"
			class="correction formulaire" method="post">
			<div class="div-block-4">
				<input type="search" class="entree" maxlength="256" name="recherche"
					placeholder="Le nom de l'article contient…"> <br>
				<div class="select">
					<select name="categorie" id="select">
						<option value="toutes">Catégories (toutes)</option>
						<option value="ameublement">Ameublement</option>
						<option value="informatique">Informatique</option>
						<option value="sport">Sport et Loisirs</option>
						<option value="vetements">Vêtements</option>
					</select>
				</div>
			</div>
			<c:if test="${not empty utilisateurConnecte}">
			<div class="">
				<div>
					<input type="radio" name="choix" id="achat" checked onclick="toggle(this);">
					<label for="achat">Achat</label>
					<input type="checkbox" name="achat"   id="ouvertes" value="ouvertes" checked 	>
					<label for="ouvertes">encheres ouvertes</label>
					<input type="checkbox" name="achat"    id="achat-en-cours" value="achat-en-cours" >
					<label for="achat-en-cours">mes encheres en cours</label>
					<input type="checkbox" name="achat"    id="remportes" value="remportes" >
					<label for="remportes">mes encheres remportés</label>
					
				</div>
				<div>
					<input type="radio" name="choix" id="vente" onclick="toggle(this);">
					<label for="vente">Mes Ventes</label>
					<input type="checkbox" name="mes-ventes"   id="vente-en-cours" value="vente-en-cours" disabled >
					<label for="vente-en-cours">mes ventes en cours</label>
					<input type="checkbox" name="mes-ventes"   id="debutes" value="debutes" disabled >
					<label for="debutes">ventes non débutés</label>
					<input type="checkbox" name="mes-ventes"   id="termines" value="termines" disabled >
					<label for="terimes">ventes termines</label>
				</div>
			</div>
			<input type="hidden" name="no_utilisateur" value="${sessionScope.no_utilisateur}">

			</c:if>
			<input type="submit" value="recherche" class="bouton-recherche ">
		</form>
	</div>


	<div class="conteneur-grille conteneur ">
		<c:forEach var="article" items="${listeArticles}">

			<div>
				<img src="img/ENIEcole-1.jpg" loading="lazy" sizes="75px" alt=""
					class="image-4">
			</div>

			<ul role="list" class="liste-style">

				<li class="liste-item-3"><a
					href="detailArticleVendu?article=${article.noArticle}">
						${article.nomArticle}</a></li>
				<li>Prix : ${article.miseAPrix} points</li>
				<li>Fin de l'enchère : ${article.dateFinEncheres}</li>
				<li>Vendeur : <a
					href="informationUtilisateur?no_utilisateur=${article.numeroUtilisateur}">
						${article.pseudoVendeur}</a></li>
			</ul>
		</c:forEach>
	</div>
	<div class="div-block-5 ">
		<jsp:include page="/WEB-INF/fragments/piedDePage.jsp" />
	</div>
	
	<script type="text/javascript">
		
		var toggle = (item) => {
			console.log(item);
			console.log(item.id == ("achat"))
			if(item.id == ("achat")){
				document.getElementById("vente-en-cours").disabled = true;
				document.getElementById("debutes").disabled = true;
				document.getElementById("termines").disabled = true;
				
				document.getElementById("ouvertes").disabled = false;
				document.getElementById("achat-en-cours").disabled = false;
				document.getElementById("remportes").disabled = false;
			} else if(item.id == "vente") {
				document.getElementById("ouvertes").disabled = true;
				document.getElementById("achat-en-cours").disabled = true;
				document.getElementById("remportes").disabled = true;
				
				document.getElementById("vente-en-cours").disabled = false;
				document.getElementById("debutes").disabled = false;
				document.getElementById("termines").disabled = false;
			}
			
		}

	</script>
	
</body>

</html>