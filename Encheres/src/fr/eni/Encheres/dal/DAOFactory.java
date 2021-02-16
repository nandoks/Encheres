package fr.eni.Encheres.dal;

public class DAOFactory {
	

	public static UtilisateurDAO getUtilisateurDAO() {
		return new UtilisateurDAOJdbcImpl();
	}
	
	
}
