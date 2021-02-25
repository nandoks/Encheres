package fr.eni.Encheres.bll;

import fr.eni.Encheres.dal.DAOFactory;

public class EnchereManager {
	
	private EnchereDAO enchereDAO;
	
	public EnchereManager() {
		enchereDAO = DAOFactory.getEnchereDAO();
	}
	
	
}
