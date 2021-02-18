package fr.eni.Encheres.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.Encheres.bll.ArticleVenduManager;

/**
 * Servlet implementation class ServletRecherche
 */
@WebServlet("/recherche")
public class ServletRecherche extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArticleVenduManager articleManager = new ArticleVenduManager();
//		List<ArticleVendu> listeArticlesRecherches = null;
//		
//		//On lit le paramètre mot clé
//		request.setAttribute("motCle", request.getParameter("motCle").trim());
//		
//		//On lit le paramètre catégorie
//		request.setAttribute("categorie", request.getParameter("categorie"));
//		
//		//Selon la catégorie, on retourne une liste d'articles correspondants
//		listeArticlesRecherches = articleManager.getArticlesByLibelleCategorie("categorie");
//		
//		//A partir de la liste filtrée par catégorie, recherche des articles par mot cle
//		listeArticlesRecherches = articleManager.getArticlesByMotCle("motCle", listeArticlesRecherches);
//		
//		request.setAttribute("listeArticlesRecherches", listeArticlesRecherches);
//		
		// Transfert de l'affichage à la JSP
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/Accueil.jsp");
		rd.forward(request, response);}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
