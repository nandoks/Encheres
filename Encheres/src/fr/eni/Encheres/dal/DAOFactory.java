package fr.eni.Encheres.dal;

public class DAOFactory {
	
	private static ArticleVenduDAO articleVenduDAO;

	public static UtilisateurDAO getUtilisateurDAO() {
		return new UtilisateurDAOJdbcImpl();
	}
	
	
	
}
