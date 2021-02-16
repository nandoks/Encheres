package fr.eni.Encheres.dal;

public class DAOFactory {
	
	private static UtilisateurDAO  utilisateurDAO;
	
	public static UtilisateurDAO getUtilisateurDAO() {
		if (utilisateurDAO == null) {
			utilisateurDAO = new UtilisateurDAOJdbcImpl();
		}
		return utilisateurDAO;
	}
	
	
}
