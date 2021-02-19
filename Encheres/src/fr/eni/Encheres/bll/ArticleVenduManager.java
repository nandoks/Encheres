package fr.eni.Encheres.bll;

import java.util.ArrayList;
import java.util.Arrays;
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
	
	public List<ArticleVendu> getArticlesByLibelleCategorie(String libelle){
		
		List<ArticleVendu> listeArticlesRecherches = null;

		switch("categorie") {
		case "Toutes" : listeArticlesRecherches = articleVenduDAO.selectAll();
		break;
		case "Informatique" : listeArticlesRecherches = articleVenduDAO.selectArticlesByLibelleCategorie(libelle);
		break;
		case "Ameublement" : listeArticlesRecherches = articleVenduDAO.selectArticlesByLibelleCategorie(libelle);
		break;
		case "Vêtement" : listeArticlesRecherches = articleVenduDAO.selectArticlesByLibelleCategorie(libelle);
		break;
		case "Sport&Loisirs" : listeArticlesRecherches = articleVenduDAO.selectArticlesByLibelleCategorie(libelle);
		break;
	}
		
		return listeArticlesRecherches;
	}
	
	public List<ArticleVendu> getArticlesByMotCle(String motCle){
		
		List<ArticleVendu> listeArticlesRecherches = articleVenduDAO.selectArticlesByMotCle(motCle);
		
		return listeArticlesRecherches;
	}

//	public List<ArticleVendu> getArticlesByMotCleBis(String motCle){
//		List<String> listeMotNomArticle = null;
//		List<ArticleVendu> listeArticlesRecherches = null;
//
//		for (ArticleVendu a : liste) {
//			listeArticlesRecherches = new ArrayList<>();
//			String nomArticle = a.getNomArticle();
//			listeMotNomArticle = Arrays.asList(nomArticle.split(" "));
//			
//			for(String s : listeMotNomArticle) {
//				if(s.equalsIgnoreCase(motCle)) {
//					listeArticlesRecherches.add(a);
//				}
//			}
//		}
//		return listeArticlesRecherches;
//	}
}
