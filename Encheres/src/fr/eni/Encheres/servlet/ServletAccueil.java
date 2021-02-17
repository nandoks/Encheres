package fr.eni.Encheres.servlet;

import java.io.IOException;
import java.util.List;

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
@WebServlet("/ServletAccueil")
public class ServletAccueil extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArticleVenduManager articleVenduManager = new ArticleVenduManager();
		List<ArticleVendu> listeArticleVendu = null;
		String filtreMotCle = null;
		//On lit le paramètre mot clé
		request.setAttribute("filtreMotCle", request.getParameter("filtreMotCle"));
		//On lit le paramètre catégorie
		request.setAttribute("categorie", request.getParameter("categorie"));
		//Selon la catégorie, on retourne une liste d'articles correspondant
		switch("categorie") {
			case "Toutes" : listeArticleVendu = articleVenduManager.selectAll();
			break;
			case "Informatique" : listeArticleVendu = articleVenduManager.selectByNoCategorie();
			break;
			case "Ameublement" : listeArticleVendu = articleVenduManager.selectByNoCategorie();
			break;
			case "Vêtement" : listeArticleVendu = articleVenduManager.selectByNoCategorie();
			break;
			case "Sport&Loisirs" : listeArticleVendu = articleVenduManager.selectByNoCategorie();
			break;
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
