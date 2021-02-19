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

	public List<ArticleVendu> getArticlesByMotCle2(String motCle, List<ArticleVendu> liste){
		List<ArticleVendu> listeArticlesRecherches = null;
		
		for (ArticleVendu a : liste) {
			listeArticlesRecherches = new ArrayList<>();
			String nomArticle = a.getNomArticle();
			if(nomArticle.contains(motCle)) {
				listeArticlesRecherches.add(a);
			}
		}
		return listeArticlesRecherches;
		}
	
	
public List<ArticleVendu> getArticlesByLibelleCategorieEtMotCle(String libelle, String motCle){
		
		List<ArticleVendu> listeArticlesCategorie = null;
		List<ArticleVendu> listeArticlesRecherches = null;

		switch("categorie") {
			case "Toutes" : listeArticlesCategorie = articleVenduDAO.selectAll();
				listeArticlesRecherches = new ArrayList<>();
				for (ArticleVendu a : listeArticlesCategorie) {
					
					String nomArticle = a.getNomArticle();
					if(nomArticle.contains(motCle)) {
						listeArticlesRecherches.add(a);
					}
			}
			break;
			case "Informatique" : listeArticlesCategorie = articleVenduDAO.selectArticlesByLibelleCategorie(libelle);
				listeArticlesRecherches = new ArrayList<>();
				for (ArticleVendu a : listeArticlesCategorie) {
					
					String nomArticle = a.getNomArticle();
					if(nomArticle.contains(motCle)) {
						listeArticlesRecherches.add(a);
					}
				}
			break;
			case "Ameublement" : listeArticlesCategorie = articleVenduDAO.selectArticlesByLibelleCategorie(libelle);
				listeArticlesRecherches = new ArrayList<>();
				for (ArticleVendu a : listeArticlesCategorie) {
					
					String nomArticle = a.getNomArticle();
					if(nomArticle.contains(motCle)) {
						listeArticlesRecherches.add(a);
					}
			}
			break;
			case "Vêtement" : listeArticlesCategorie = articleVenduDAO.selectArticlesByLibelleCategorie(libelle);
				listeArticlesRecherches = new ArrayList<>();
				for (ArticleVendu a : listeArticlesCategorie) {
					String nomArticle = a.getNomArticle();
					if(nomArticle.contains(motCle)) {
						listeArticlesRecherches.add(a);
					}
			}
			break;
			case "Sport&Loisirs" : listeArticlesCategorie = articleVenduDAO.selectArticlesByLibelleCategorie(libelle);
				listeArticlesRecherches = new ArrayList<>();
				for (ArticleVendu a : listeArticlesCategorie) {
					
					String nomArticle = a.getNomArticle();
					if(nomArticle.contains(motCle)) {
						listeArticlesRecherches.add(a);
					}
				}
			break;
	}
		
		return listeArticlesRecherches;
	}

		
	
}
