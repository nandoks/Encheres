package fr.eni.Encheres.dal;

import fr.eni.Encheres.bo.Utilisateur;

public interface UtilisateurDAO extends DAO<Utilisateur>{
	
	/* Cherche dans la BDD s'il existe une ligne contenant le String pseudo*/
	Utilisateur getUtilisateurByPseudo(String pseudo);
	
	/* Cherche dans la BDD s'il existe une ligne contenant le String email*/
	Utilisateur getUtilisateurByEmail(String email);
	
	
	
}