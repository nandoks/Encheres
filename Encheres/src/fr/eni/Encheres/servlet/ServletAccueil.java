package fr.eni.Encheres.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.Encheres.bll.ArticleVenduManager;
import fr.eni.Encheres.bo.ArticleVendu;

/**
 * Servlet implementation class ServletAccueil
 */
@WebServlet("/accueil")
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
		
		//Récupération du champ de recherche
		String motCle = request.getParameter("recherche");
		List<ArticleVendu> listeArticles = articleManager.getArticlesByMotCle(motCle);
		request.setAttribute("listeArticles", listeArticles);
		
		//Transfert de l'affichage à la JSP
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/index.jsp");
		rd.forward(request, response);
	}

}
