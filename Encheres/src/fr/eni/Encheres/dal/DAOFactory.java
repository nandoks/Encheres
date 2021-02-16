package fr.eni.Encheres.dal;

public class DAOFactory {
	
	private static UtilisateurDAO  utilisateurDAO;
	private static ArticleVenduDAO articleVenduDAO;
	
	public static UtilisateurDAO getUtilisateurDAO() {
		if (utilisateurDAO == null) {
			utilisateurDAO = new UtilisateurDAOJdbcImpl();
		}
		return utilisateurDAO;
	}

	public static ArticleVenduDAO getArticleVenduDAO() {
		if ( articleVenduDAO == null ) {
			articleVenduDAO = new ArticlevenduJdbcImpl();
		}
		return articleVenduDAO;
	}
	
	
}
