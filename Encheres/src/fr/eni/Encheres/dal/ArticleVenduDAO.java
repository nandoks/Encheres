package fr.eni.Encheres.dal;

import java.util.List;

import fr.eni.Encheres.bo.ArticleVendu;

public interface ArticleVenduDAO extends DAO<ArticleVendu> {

	
	public List<ArticleVendu> getArticlesByNumeroUtilisateur(int numeroUtilisateur);
	
	
}
