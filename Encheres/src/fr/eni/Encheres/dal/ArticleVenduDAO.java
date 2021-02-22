package fr.eni.Encheres.dal;

import java.util.List;

import fr.eni.Encheres.bo.ArticleVendu;

public interface ArticleVenduDAO extends DAO<ArticleVendu> {


	public List<ArticleVendu> selectArticlesByNumeroUtilisateur(int numeroUtilisateur);
	
	public List<ArticleVendu> selectArticlesByCategorie(String categorie);
	
	public List<ArticleVendu> selectArticlesByMotCle(String motCle);

	public List<ArticleVendu> selectArticlesByMotCleEtCategorie(String motCle, String categorie);



}
