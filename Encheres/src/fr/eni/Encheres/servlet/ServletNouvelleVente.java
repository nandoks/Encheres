package fr.eni.Encheres.servlet;

import java.io.IOException;

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

	ArticleVenduManager ArticleVenduManager;
	UtilisateurManager UtilisateurManager;

	public void init() {
		ArticleVenduManager = new ArticleVenduManager();
		UtilisateurManager = new UtilisateurManager();
	}

	// TODO jsp nouvelleVente pas encore créée
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
		String miseAPrix = request.getParameter("prix_initial");

		// Date au format string. En commentaire, j'ai mis le code pour
		// convertir la date en format Date si besoin
		String dateDebutEncheres = request.getParameter("date_debut_encheres");
		// LocalDate localDate = LocalDate.now();
		// DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL
		// yyyy");
		// dateDebutEncheres = localDate.format(formatter);
		String dateFinEncheres = request.getParameter("date_fin_encheres");

		// Adresse du vendeur : saisie automatique
		String rue = request.getParameter("rue");
		String codePostal = request.getParameter("codePostal");
		String ville = request.getParameter("ville");

		String url = ("/WEB-INF/jsp/Nouvelle-vente.jsp");

		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request, response);
	}

}
