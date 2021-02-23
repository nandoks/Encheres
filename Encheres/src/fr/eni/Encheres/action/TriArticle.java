package fr.eni.Encheres.action;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import fr.eni.Encheres.bo.ArticleVendu;

public class TriArticle {

	public List<ArticleVendu> triMesVentes(List<ArticleVendu> listeArticles, String filtre, String Categorie,
			int no_utilisateur) {
		List<ArticleVendu> listeTrie = new ArrayList<>();
		LocalDate aujourdhui = LocalDate.now();
		

		return null;
	}

	public static List<ArticleVendu> triAchats(List<ArticleVendu> listeArticles, String filtre, int no_utilisateur) {

		List<ArticleVendu> listeTrie = new ArrayList<>();
		LocalDate aujourdhui = LocalDate.now();
		if (filtre.equals("ouvertes")) {
			for (ArticleVendu article : listeArticles) {
				if (aujourdhui.isBefore(article.getDateFinEncheres())) {
					listeTrie.add(article);
				}
			}
		} else if (filtre.equals("achat-en-cours")) {
			for (ArticleVendu article : listeArticles) {
				if (aujourdhui.isBefore(article.getDateFinEncheres())
						&& (aujourdhui.isAfter(article.getDateDebutEncheres())
								|| aujourdhui.isEqual(article.getDateDebutEncheres()))) {
					listeTrie.add(article);
				}
			}
		} else if (filtre.equals("remportes")) {
			for (ArticleVendu article : listeArticles) {
				if (aujourdhui.isAfter(article.getDateFinEncheres())
						&& article.getNumeroUtilisateur() == no_utilisateur) {
					listeTrie.add(article);
				}
			}
		}

		return listeTrie;
	}

}
