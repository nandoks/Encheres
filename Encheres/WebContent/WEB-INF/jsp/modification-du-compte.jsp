<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>

<div class="section">
	<div class="div-block">

		<div class="div-block-2">
			<img src="images/ENIEcole-1.jpg" loading="lazy"
				sizes="(max-width: 479px) 100vw, 75px" alt="" class="image-5">
		</div>
		<a href="index.html" aria-current="page"
			class="lien-block ligne-block rangee1">
			<h1 class="titre">ENI Enchères</h1>
		</a> <a href="${pageContext.request.contextPath}/authentification"
			class="lien">Connection</a> <a
			href="${pageContext.request.contextPath}/creationCompte" class="lien">Inscription</a>

	</div>
</div>
<div class="conteneur-13 conteneur">
	<div class="formulaire">
		<form id="email-form" name="email-form" data-name="Email Form"
			class="clearfix" method="post" action="modificationCompte">
			<div class="rangee">
				<div class="colonne col-6">
					<label for="Pseudo">Pseudo</label> <input type="text"
						class="entree" maxlength="256" name="pseudo" data-name="pseudo"
						placeholder="Azerty123" id="Pseudo" required
						value="${utilisateur.pseudo}"> <label for="Email-2">Adresse
						email</label> <input type="email" class="entree" maxlength="256"
						name="email" data-name="email" placeholder="@email.com"
						id="Email-2" value="${utilisateur.email}" required> <label
						for="T-l-phone">TÃ©lÃ©phone</label> <input type="text"
						class="entree" maxlength="256" name="telephone"
						data-name="telephone" placeholder="06 06 06 06 06" id="T-l-phone"
						value="${utilisateur.telephone}" required> <label
						for="Code-Postal">Code Postal</label> <input type="text"
						class="entree" maxlength="256" name="codePostal"
						data-name="codePostal" placeholder="00 000" id="Code-Postal"
						value="${utilisateur.codePostal}" required> <label
						for="Rue">Rue</label> <input type="text" class="entree"
						maxlength="256" name="rue" data-name="rue"
						placeholder="Rue de la Fontaine" id="Rue"
						value="${utilisateur.rue}" required> <label for="Ville">Ville</label>
					<input type="text" class="entree" maxlength="256" name="ville"
						data-name="ville" placeholder="Nantes" id="Ville"
						value="${utilisateur.ville}" required>
				</div>
				<div class="colonne col-6">
					<label for="Pr-nom">PrÃ©nom</label> <input type="text"
						class="entree" maxlength="256" name="prenom" data-name="prenom"
						placeholder="Pierre" id="Pr-nom" value="${utilisateur.prenom}"
						required> <label for="Nom">Nom de famille</label> <input
						type="text" class="entree" maxlength="256" name="nom"
						data-name="nom" placeholder="Lepaul" id="Nom"
						value="${utilisateur.nom}" required> <label
						for="Mot-de-passe-actuel">Mot de passe actuel</label> <input
						type="password" class="entree" maxlength="256"
						name="motDePasseActuel" data-name="Mot de passe actuel"
						placeholder="Votre mot de passe actuel" required> <label
						for="Nouveau-mot-de-passe">Nouveau mot de passe</label> <input
						type="text" class="entree" maxlength="256"
						name="Nouveau-mot-de-passe" data-name="Nouveau mot de passe"
						placeholder="Choisissez un nouveau mot de passe"
						id="Nouveau-mot-de-passe" required=""> <label
						for="Confirmation-du-nouveau-mot-de-passe" class="champs-label-4">Confirmation
						du nouveau mot de passe</label> <input type="password" class="entree"
						maxlength="256" name="password" id="password" onkeyup='check();'
						data-name="Nouveau mot de passe"
						placeholder="Choisissez un nouveau mot de passe" required>
					<label for="Confirmation-du-nouveau-mot-de-passe"
						class="champs-label-4">Confirmation du nouveau mot de
						passe</label> <input type="password" class="entree" maxlength="256 "
						onkeyup='check();' name="confirm_password" id="confirm_password"
						data-name="Confirmation du nouveau mot de passe "
						placeholder="Confirmez votre nouveau mot de passe" required>
					<input type="hidden" name="no_utilisateur"
						value="${utilisateur.numeroUtilisateur}" /> <span id='message'></span>
				</div>
			</div>
			<input type="soumettre " value="Supprimer mon compte "
				data-wait="Veuillez patienter... "
				class="bouton-soumettre-4 s-bouton "> <input
				type="soumettre " value="Enregistrer "
				data-wait="Veuillez patienter... "
				class="bouton-soumettre-3 s-bouton "> <input type="submit"
				value="Supprimer mon compte " onclick="alerteSupprimer();"
				id="supprimer" data-wait="Veuillez patienter... "
				class="bouton-soumettre-4 s-bouton "> <input type="submit"
				value="Enregistrer " id="enregistrer"
				data-wait="Veuillez patienter... "
				class="bouton-soumettre-3 s-bouton "> <span id='message'></span>
		</form>
		<div class="formulaire-rempli ">
			<div>Merci! Votre formulaire a bien Ã©tÃ© rÃ©ceptionnÃ© !</div>
		</div>
	</div>
</div>

<script type="text/javascript">
     
		var check = ()=>{
			 var password = document.getElementById("password").value;
			 var confirmation = document.getElementById("confirm_password").value;
			 
			 if (password == confirmation || password == 0){
				 document.getElementById("message").innerHTML = "" 
				 document.getElementById("enregistrer").disabled = false
				 document.getElementById("enregistrer").style.background = "#3898EC"
			 } else {
				 document.getElementById("message").innerHTML = "La confirmation et le mot de passe ne sont pas identiques"
				 document.getElementById("enregistrer").disabled = true
				 document.getElementById("enregistrer").style.background = "#c4b7b9"
			 }
		}
		
		function alerteSupprimer() {
			  if(!confirm("Do you really want to do this?")) {
			    return false;
			  }
		  this.form.submit();
		}
		
		
		
	</script>
</body>
</html>