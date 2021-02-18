package fr.eni.Encheres.bll;

import java.util.Iterator;
import java.util.List;

import fr.eni.Encheres.bo.Utilisateur;
import fr.eni.Encheres.dal.DAOFactory;
import fr.eni.Encheres.dal.UtilisateurDAO;

public class UtilisateurManager {

	private UtilisateurDAO utilisateurDAO;
	
	public UtilisateurManager() {
		utilisateurDAO = DAOFactory.getUtilisateurDAO();
	}
	
	public List<Utilisateur> getUtilisateurs(){
		return utilisateurDAO.selectAll();
	}

	public String ajouteUtilisateur(Utilisateur utilisateur) {
		
		String pseudoNouvelUtilisateur = utilisateur.getPseudo();
		System.out.println(pseudoNouvelUtilisateur);
		String emailNouvelUtilisateur = utilisateur.getEmail();
		System.out.println(emailNouvelUtilisateur);
		
		List<Utilisateur> listUtilisateurs = getUtilisateurs();
		for (Utilisateur u : listUtilisateurs) {
			System.out.println(u.getEmail());
			System.out.println(u.getPseudo());
			if(u.getEmail().equals(emailNouvelUtilisateur) && u.getPseudo().equals(pseudoNouvelUtilisateur)) {
				return "peuso ou email déjà enregistré";
			}
		}
		utilisateurDAO.insert(utilisateur);
		return null;
	}

	public Utilisateur getUtilisateursById(int id) {
		return utilisateurDAO.selectById(id);
	}

	
	
}
