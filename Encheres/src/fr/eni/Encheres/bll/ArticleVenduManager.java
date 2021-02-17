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

	public List<ArticleVendu> getAllArticles() {
		return articleVenduDAO.selectAll();
	}
	
	public List<ArticleVendu> getArticlesByLibelleCategorie(String libelle, String motCle){
		
		List<ArticleVendu> listeArticlesRecherches = null;

		switch("categorie") {
		case "Toutes" : listeArticlesRecherches = articleVenduDAO.selectAll();
		break;
		case "Informatique" : listeArticlesRecherches = articleVenduDAO.getArticlesByLibelleCategorie(libelle);
		break;
		case "Ameublement" : listeArticlesRecherches = articleVenduDAO.getArticlesByLibelleCategorie(libelle);
		break;
		case "Vêtement" : listeArticlesRecherches = articleVenduDAO.getArticlesByLibelleCategorie(libelle);
		break;
		case "Sport&Loisirs" : listeArticlesRecherches = articleVenduDAO.getArticlesByLibelleCategorie(libelle);
		break;
	}
		
		return listeArticlesRecherches;
	}
	
	public List<ArticleVendu> getArticlesByMotCle(String motCle, List<ArticleVendu> liste){
		
		List<ArticleVendu> listeArticlesRecherches;

		for (ArticleVendu a : liste) {
			listeArticlesRecherches = null;
			String nomArticle = a.getNomArticle();
			String[] tableauNomArticle = nomArticle.split(" ");
			for (String s : tableauNomArticle) {
				if(s.equalsIgnoreCase(motCle)) {
					listeArticlesRecherches.add(a);
					
				}
			}
			
		}
		return listeArticlesRecherches ;
	}
}
