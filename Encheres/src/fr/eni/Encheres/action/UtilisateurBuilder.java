package fr.eni.Encheres.action;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.Encheres.bo.Utilisateur;

public class UtilisateurBuilder {

	public static Utilisateur execute(HttpServletRequest request, HttpServletResponse response) {

		Utilisateur utilisateur = new Utilisateur();

		String pseudo = (String) request.getParameter("pseudo");
		String nom = (String) request.getParameter("nom");
		String prenom = (String) request.getParameter("prenom");
		String email = (String) request.getParameter("email");
		String telephone = (String) request.getParameter("telephone");
		String rue = (String) request.getParameter("rue");
		String codePostal = (String) request.getParameter("codePostal");
		String ville = (String) request.getParameter("ville");
		String motDePasse = (String) request.getParameter("password");

		
		utilisateur.setPseudo(pseudo);
		utilisateur.setNom(nom);
		utilisateur.setPrenom(prenom);
		utilisateur.setEmail(email);
		utilisateur.setTelephone(telephone);
		utilisateur.setRue(rue);
		utilisateur.setCodePostal(codePostal);
		utilisateur.setVille(ville);
		utilisateur.setMotDePasse(motDePasse);

		return utilisateur;

	}

}
