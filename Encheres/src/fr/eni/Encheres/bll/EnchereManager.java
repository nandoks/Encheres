package fr.eni.Encheres.bll;

import fr.eni.Encheres.bo.Enchere;
import fr.eni.Encheres.dal.DAOFactory;

public class EnchereManager {
	
	private EnchereDAO enchereDAO;
	
	public EnchereManager() {
		enchereDAO = DAOFactory.getEnchereDAO();
	}
	
	public void insertEnchere(Enchere enchere) {
		enchereDAO.insert(enchere);
	}
	
	
}
