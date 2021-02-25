package fr.eni.Encheres.dal;

import fr.eni.Encheres.bll.RetraitManager;

public class DAOFactory {
	
	private static UtilisateurDAO utilisateurDAO;
	private static ArticleVenduDAO articleVenduDAO;
	private static RetraitDAO retraitDAO;
	
	public static UtilisateurDAO getUtilisateurDAO() {
		if (utilisateurDAO == null) {
			utilisateurDAO = new UtilisateurDAOJdbcImpl();
		}
		return utilisateurDAO;
	}
	
	public static ArticleVenduDAO  getArticleVenduDAO() {
		if (articleVenduDAO == null) {
			articleVenduDAO = new ArticleVenduDAOJdbcImpl();
		}
		return articleVenduDAO;
	}
	
	public static RetraitDAO getRetraitDAO() {
		if(retraitDAO == null) {
			retraitDAO = new RetraitDAOJdbcImpl();
		}
		return retraitDAO;
	}
	
	
}
