package fr.eni.Encheres.dal;

import fr.eni.Encheres.bll.EnchereDAO;

public class DAOFactory {
	
	private static UtilisateurDAO utilisateurDAO;
	private static ArticleVenduDAO articleVenduDAO;
	private static RetraitDAO retraitDAO;
	private static EnchereDAO enchereDAO;
	
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

	public static EnchereDAO getEnchereDAO() {
		if(enchereDAO == null) {
			enchereDAO = new EnchereDAOJdbcImpl();
		}
		return null;
	}
	
	
}
