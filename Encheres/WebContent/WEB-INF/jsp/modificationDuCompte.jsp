<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>

<div class="section">
			<c:if test="${empty utilisateurConnecte}">
				<jsp:include page="/WEB-INF/fragments/enteteDeconnecte.jsp" />
			</c:if>
			<c:if test="${not empty utilisateurConnecte}">
				<jsp:include page="/WEB-INF/fragments/enteteConnecte.jsp" />
			</c:if>
	</div>
 <div class="section-2">
        <h1 class="conteneur conteneur-1 titre1">Mon Profil</h1>
    </div>
    <div class="conteneur-13 conteneur">
        <div class="formulaire">
            <form id="email-form" name="email-form" data-name="Email Form" class="clearfix" method="post" action="modificationCompte">
                <div class="rangee colonne">
                    <div class="col">
                        <label for="Pseudo" class="champs-label-4">Pseudo</label>
                        <input type="text" class="entree" maxlength="256" name="pseudo" data-name="pseudo" placeholder="Azerty123" id="Pseudo" required value="${utilisateur.pseudo}">
                        <label for="Email-2" class="champs-label-4">Adresse email</label>
                        <input type="email" class="entree" maxlength="256" name="email" data-name="email" placeholder="@email.com" id="Email-2" value="${utilisateur.email}" required>
                        <label for="T-l-phone" class="champs-label-4">Téléphone</label>
                        <input type="text" class="entree" maxlength="256" name="telephone" data-name="telephone" placeholder="06 06 06 06 06" id="T-l-phone" value="${utilisateur.telephone}" required>
                        <label for="Code-Postal" class="champs-label-4">Code Postal</label>
                        <input type="text" class="entree" maxlength="256" name="codePostal" data-name="codePostal" placeholder="00 000" id="Code-Postal" value="${utilisateur.codePostal}" required>
                        <label for="Rue" class="champs-label-4">Rue</label>
                        <input type="text" class="entree" maxlength="256" name="rue" data-name="rue" placeholder="Rue de la Fontaine" id="Rue" value="${utilisateur.rue}" required>
                        <label for="Ville" class="champs-label-4">Ville</label>
                        <input type="text" class="entree" maxlength="256" name="ville" data-name="ville" placeholder="Nantes" id="Ville" value="${utilisateur.ville}" required>
                    </div>
                    <div class="col">
                        <label for="Prenom" class="champs-label-4">Prénom</label>
                        <input type="text" class="entree" maxlength="256" name="prenom" data-name="prenom" placeholder="Pierre" id="Pr-nom" value="${utilisateur.prenom}" required>
                        <label for="Nom" class="champs-label-4">Nom de famille</label>
                        <input type="text" class="entree" maxlength="256" name="nom" data-name="nom" placeholder="Lepaul" id="Nom" value="${utilisateur.nom}" required>
                        <label for="Mot-de-passe-actuel" class="champs-label-4">Mot de passe actuel</label>
                        <input type="password" class="entree" maxlength="256" name="motDePasseActuel" data-name="Mot de passe actuel" placeholder="Votre mot de passe actuel" required>
                        <label for="Nouveau-mot-de-passe" class="champs-label-4">Nouveau mot de passe</label>
                        <input type="text" class="entree" maxlength="256" name="Nouveau-mot-de-passe" data-name="Nouveau mot de passe" placeholder="Choisissez un nouveau mot de passe" id="Nouveau-mot-de-passe" required="">
                        <label for="Confirmation-du-nouveau-mot-de-passe" class="champs-label-4">Confirmation du nouveau mot de passe</label>
                        <input type="password" class="entree" maxlength="256" name="password" id="password" onkeyup="check();" data-name="Nouveau mot de passe" placeholder="Choisissez un nouveau mot de passe" required>
                        <label for="Confirmation-du-nouveau-mot-de-passe" class="champs-label-4">Confirmation du nouveau mot de passe</label>
                        <input type="password" class="entree" maxlength="256 " onkeyup="check();" name="confirm_password" id="confirm_password" data-name="Confirmation du nouveau mot de passe " placeholder="Confirmez votre nouveau mot de passe" required>
                        <input type="hidden" name="no_utilisateur" value="${utilisateur.numeroUtilisateur}">
                        <span id="message"></span>
                    </div>
                </div>
                <input type="submit" value="Enregistrer " id="enregistrer" data-wait="Veuillez patienter... " class="bouton-soumettre-3 s-bouton ">
                <span id="message"></span>
            </form>
            <button class="bouton-soumettre-4 s-bouton">
                    <a
                        href="suppressionCompte?no_utilisateur=${utilisateur.numeroUtilisateur}"
                        onclick="alerteSupprimer()"
                        id="supprimer"
                        data-wait="Veuillez patientez..."
                    >Supprimer mon compte</a>
                </button>
            <div class="formulaire-rempli ">
                <div>Merci! Votre formulaire a bien été réceptionné !</div>
            </div>
        </div>
    </div>
    </div>
<div class="div-block-5 ">
		<jsp:include page="/WEB-INF/fragments/piedDePage.jsp" />
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