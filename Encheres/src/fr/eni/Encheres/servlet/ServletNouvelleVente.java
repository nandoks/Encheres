package fr.eni.Encheres.servlet;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.Encheres.bll.ArticleVenduManager;
import fr.eni.Encheres.bll.UtilisateurManager;

/**
 * Servlet implementation class ServletNouvelleVente
 */
@WebServlet("/ServletNouvelleVente")
public class ServletNouvelleVente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static UtilisateurManager utilisateurManager;
	private static ArticleVenduManager articleVenduManager;

	public void init() {
		articleVenduManager = new ArticleVenduManager();
		utilisateurManager = new UtilisateurManager();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request
				.getRequestDispatcher("/WEB-INF/jsp/Nouvelle-vente.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String nomArticle = request.getParameter("nom_article");
		String description = request.getParameter("description");
		String libelleCategorie = request.getParameter("libelle");
		// Uploader photo = pas obligatoire pour l'itération 1
		int miseAPrix = Integer.valueOf(request.getParameter("prix_initial"));
		LocalDate dateDebutEncheres = LocalDate
				.parse(request.getParameter("date_debut_encheres"));
		LocalDate dateFinEncheres = LocalDate
				.parse(request.getParameter("date_fin_encheres"));
		String rue = request.getParameter("rue");
		String codePostal = request.getParameter("codePostal");
		String ville = request.getParameter("ville");

		String url = ("/WEB-INF/jsp/Nouvelle-vente.jsp");

		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request, response);
	}

}
