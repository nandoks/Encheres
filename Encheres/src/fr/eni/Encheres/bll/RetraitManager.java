package fr.eni.Encheres.bll;

import fr.eni.Encheres.bo.Retrait;
import fr.eni.Encheres.dal.DAOFactory;
import fr.eni.Encheres.dal.RetraitDAO;

public class RetraitManager {
	
	private RetraitDAO retraitDAO;
	
	public RetraitManager() {
		retraitDAO = DAOFactory.getRetraitDAO();
	}
	
	public void insertRetrait(Retrait retrait) {
		retraitDAO.insert(retrait);
	}
	
	
}
