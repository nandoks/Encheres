package fr.eni.Encheres.bll;

import java.util.ArrayList;

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
		return articleVenduDAO.selectArticlesByNumeroUtilisateur(numeroUtilisateur);
	}

	public List<ArticleVendu> getAllArticles() {
		return articleVenduDAO.selectAll();
	}
	
	public List<ArticleVendu> getArticlesByMotCle(String motCle){
		
		List<ArticleVendu> listeArticlesRecherches = articleVenduDAO.selectArticlesByMotCle(motCle);
		
		return listeArticlesRecherches;
	}
	
	public List<ArticleVendu> getArticlesByCategorie(String categorie) {
		return articleVenduDAO.selectArticlesByCategorie(categorie);
	}
	
	public List<ArticleVendu> getArticlesByMotCleEtCategorie(String motCle, String categorie) {
		return articleVenduDAO.selectArticlesByMotCleEtCategorie(motCle, categorie);
	}

}
