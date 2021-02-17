package fr.eni.Encheres.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.Encheres.bo.Utilisateur;

public class UtilisateurBuilder {

	
	public static Utilisateur execute(HttpServletRequest request, HttpServletResponse response) {
		
		Utilisateur utilisateur = new Utilisateur();
		
//		String pseudo = (String) request.getParameter("nina");
//		String nom = (String) request.getParameter("nina");
//		String prenom = (String) request.getParameter("nina");
//		String email = (String) request.getParameter("nina@gmail.com");
//		String telephone = (String) request.getParameter("0123456");
//		String rue = (String) request.getParameter("4 impasse");
//		String codePostal = (String) request.getParameter("22400");
//		String ville = (String) request.getParameter("lamballe");
//		String motDePasse = (String) request.getParameter("1111");
//		
		String pseudo = "nina";
		String nom = ("nina");
		String prenom = ("nina");
		String email = ("nina@gmail.com");
		String telephone = ("0123456");
		String rue = ("4 impasse");
		String codePostal = ("22400");
		String ville =("lamballe");
		String motDePasse = ("1111");
		
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
