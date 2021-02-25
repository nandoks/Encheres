package fr.eni.Encheres.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.Encheres.action.TriArticle;
import fr.eni.Encheres.bll.ArticleVenduManager;
import fr.eni.Encheres.bo.ArticleVendu;

/**
 * Servlet implementation class ServletAccueil
 */
@WebServlet(urlPatterns={"/accueil",
					"/"})
public class ServletAccueil extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArticleVenduManager articleManager = new ArticleVenduManager();
		List<ArticleVendu> listeArticles = articleManager.getAllArticles();
		
		request.setAttribute("listeArticles", listeArticles);

		//Transfert de l'affichage à la JSP
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/index.jsp");
		rd.forward(request, response);
	}
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArticleVenduManager articleManager = new ArticleVenduManager();

		// Récupération des paramètres
		String motCle = request.getParameter("recherche");
		String categorie = request.getParameter("categorie");
		String achats = request.getParameter("achat");
		String mesVentes = request.getParameter("mes-ventes");
		int no_utilisateur = Integer.valueOf(request.getParameter("no_utilisateur")) == null ? 0 : Integer.valueOf(request.getParameter("no_utilisateur"));
		System.out.println(no_utilisateur);
		List<ArticleVendu> listeArticles = null;

		if (mesVentes != null) {

		}

		if (categorie.equals("toutes") && motCle.isEmpty()) {
			listeArticles = articleManager.getAllArticles();
			if (achats != null) {
				listeArticles = TriArticle.triAchats(listeArticles, achats, no_utilisateur);
			}
			if (mesVentes == null) {
				//TODO
			}
		} else if (categorie.equals("toutes") && !motCle.isEmpty()) {
			listeArticles = articleManager.getArticlesByMotCle(motCle);
			if (achats != null) {
				listeArticles = TriArticle.triAchats(listeArticles, achats,no_utilisateur);
			}
			if (mesVentes == null) {
				//TODO
			}
		} else if (motCle == null || motCle.isEmpty()) {
			listeArticles = articleManager.getArticlesByCategorie(categorie);
			if (achats != null) {
				listeArticles = TriArticle.triAchats(listeArticles, achats, no_utilisateur);
			}
			if (mesVentes == null) {
				//TODO
			}
		} else {
			listeArticles = articleManager.getArticlesByMotCleEtCategorie(motCle, categorie);
			if (achats != null) {
				listeArticles = TriArticle.triAchats(listeArticles, achats, no_utilisateur);
			}
			if (mesVentes == null) {
				//TODO
			}
		}

		request.setAttribute("listeArticles", listeArticles);

		// Transfert de l'affichage à la JSP
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/index.jsp");
		rd.forward(request, response);
	}

}
