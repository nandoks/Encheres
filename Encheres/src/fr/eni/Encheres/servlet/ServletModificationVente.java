package fr.eni.Encheres.servlet;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.Encheres.bll.ArticleVenduManager;
import fr.eni.Encheres.bo.ArticleVendu;
import fr.eni.Encheres.bo.Retrait;

/**
 * Servlet implementation class ServletNouvelleVente
 */
@WebServlet("/ServletModificationVente")
public class ServletModificationVente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static ArticleVenduManager articleVenduManager;

	public void init() {
		articleVenduManager = new ArticleVenduManager();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		List<ArticleVendu> articleVendu = articleVenduManager
				.getArticlesByNumeroUtilisateur(1);
		request.setAttribute("articleVendu", articleVendu);

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

		String url = ("/WEB-INF/jsp/nouvelleVente.jsp");

		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request, response);
	}

}
