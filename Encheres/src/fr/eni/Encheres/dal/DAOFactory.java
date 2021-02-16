package fr.eni.Encheres.dal;

public class DAOFactory {
	
	private static ArticleVenduDAO articleVenduDAO;

	public static UtilisateurDAO getUtilisateurDAO() {
		return new UtilisateurDAOJdbcImpl();
	}
	
	public static ArticleVenduDAO  getArticleVenduDAO() {
		if (articleVenduDAO == null) {
			articleVenduDAO = new ArticleVenduDAOJdbcImpl();
		}
		return articleVenduDAO;
	}
	
	
}
