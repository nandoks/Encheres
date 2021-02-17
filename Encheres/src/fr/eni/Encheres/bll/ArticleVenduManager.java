package fr.eni.Encheres.bll;

import java.util.List;

import fr.eni.Encheres.bo.ArticleVendu;
import fr.eni.Encheres.dal.ArticleVenduDAO;
import fr.eni.Encheres.dal.DAOFactory;

public class ArticleVenduManager {

private ArticleVenduDAO articleVenduDAO;
	
	public ArticleVenduManager() {
		articleVenduDAO = DAOFactory.getArticleVenduDAO();
	}

	public List<ArticleVendu> getArticlesByNumeroUtilisateur(int numeroUtilisateur) {
		return articleVenduDAO.getArticlesByNumeroUtilisateur(numeroUtilisateur);
	}

	public List<ArticleVendu>  selectByNoCategorie() {
		return articleVenduDAO.selectAll();		
	}

	public List<ArticleVendu> selectAll() {
		return articleVenduDAO.selectAll();
	}
}
