package fr.eni.Encheres.bll;

import java.util.List;

import fr.eni.Encheres.bo.Utilisateur;
import fr.eni.Encheres.dal.DAOFactory;
import fr.eni.Encheres.dal.UtilisateurDAO;

public class UtilisateurManager {

	private UtilisateurDAO utilisateurDAO;

	public UtilisateurManager() {
		utilisateurDAO = DAOFactory.getUtilisateurDAO();
	}

	public List<Utilisateur> getUtilisateurs() {
		return utilisateurDAO.selectAll();
	}

	public Utilisateur getUtilisateurParIdentifiantOuMail(String identifiant, String email) {
		return utilisateurDAO.selectByIdentifiantOuMail(identifiant, email);
	}

	public void ajouteUtilisateur(Utilisateur utilisateur) {

		utilisateurDAO.insert(utilisateur);
	}

	public Utilisateur getUtilisateurById(int id) {
		return utilisateurDAO.selectById(id);
	}

}
