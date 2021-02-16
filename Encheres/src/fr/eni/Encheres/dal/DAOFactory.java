package fr.eni.Encheres.dal;

public class DAOFactory {
	
	private static EnchereDAO enchereDAO;

	public static UtilisateurDAO getUtilisateurDAO() {
		return new UtilisateurDAOJdbcImpl();
	}
	
	public static EnchereDAO getEnchereDAO() {
		if(enchereDAO == null) {
			enchereDAO = new EnchereDAOJdbcImpl();
		}
		return enchereDAO;
	}
}
