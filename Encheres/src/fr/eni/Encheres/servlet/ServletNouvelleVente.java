package fr.eni.Encheres.servlet;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.Encheres.bll.RetraitManager;
import fr.eni.Encheres.bll.UtilisateurManager;
import fr.eni.Encheres.bo.ArticleVendu;
import fr.eni.Encheres.bo.Retrait;
import fr.eni.Encheres.bo.Utilisateur;

/**
 * Servlet implementation class ServletNouvelleVente
 */
@WebServlet("/ServletNouvelleVente")
public class ServletNouvelleVente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static UtilisateurManager utilisateurManager;
	private static RetraitManager retraitManager;

	public void init() {
		utilisateurManager = new UtilisateurManager();
		retraitManager = new RetraitManager();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		Utilisateur utilisateur = utilisateurManager.getUtilisateurById(1);
		request.setAttribute("utilisateur", utilisateur);

		RequestDispatcher rd = request
				.getRequestDispatcher("/WEB-INF/jsp/nouvelleVente.jsp");
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

		ArticleVendu articleVendu = new ArticleVendu();

		articleVendu.setNomArticle(nomArticle);
		articleVendu.setDescription(description);
		articleVendu.setLibelleCategorie(libelleCategorie);
		articleVendu.setMiseAPrix(miseAPrix);
		articleVendu.setDateDebutEncheres(dateDebutEncheres);
		articleVendu.setDateFinEncheres(dateFinEncheres);

		Retrait retrait = new Retrait();

		retrait.setCodePostal(codePostal);
		retrait.setRue(rue);
		retrait.setVille(ville);

		retraitManager.insertRetrait(retrait);

		// request.setAttribute("articleVendu", articleVendu);
		// request.setAttribute("retrait", retrait);

		RequestDispatcher rd = request
				.getRequestDispatcher("/WEB-INF/jsp/nouvelleVente.jsp");
		rd.forward(request, response);
		return;
	}

}
