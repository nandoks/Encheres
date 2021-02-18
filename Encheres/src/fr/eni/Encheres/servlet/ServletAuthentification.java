package fr.eni.Encheres.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.Encheres.bll.UtilisateurManager;
import fr.eni.Encheres.bo.Utilisateur;

/**
 * Servlet implementation class ServletAuthentification
 */
@WebServlet("/authentification")
public class ServletAuthentification extends HttpServlet {
	private static final long serialVersionUID = 1L;

	UtilisateurManager utilisateurManager;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletAuthentification() {
		utilisateurManager = new UtilisateurManager();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/Connexion.jsp");

		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nomUtilisateur = (String) request.getParameter("identifiant");
		String motDePasse = (String) request.getParameter("pass");

		System.out.println("form: " + nomUtilisateur + "," + motDePasse);

		Utilisateur utilisateur = null;
		List<Utilisateur> listeUtilisateur = utilisateurManager.getUtilisateurs();
		for (Utilisateur u : listeUtilisateur) {
			if (u.equals(nomUtilisateur, motDePasse)) {
				utilisateur = u;
				System.out.println("Utilisateur trouvé");
			}
		}

		String url = "";
		if (utilisateur != null) {
			boolean seRappelerDeMoi = request.getParameter("Se-souvenir-de-moi") != null;
			System.out.println(seRappelerDeMoi);
			if (!seRappelerDeMoi) {
				HttpSession session = request.getSession();
				session.setAttribute("utilisateurConnecte", utilisateur);

			} else {
				Cookie resterConnecte = new Cookie("seRappelerDeMoi", "true");
				resterConnecte.setMaxAge(1800);
				System.out.println("creation cookie");
				response.addCookie(resterConnecte);
			}
			url = "/WEB-INF/jsp/testlogin.jsp";
		} else {
			request.setAttribute("messageErreur", "Mot de passe ou mail incorrect");
			url = "/WEB-INF/jsp/Connexion.jsp";
		}

		RequestDispatcher rd = request.getRequestDispatcher(url);

		rd.forward(request, response);
	}
}
