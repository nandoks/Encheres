package fr.eni.Encheres.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.Encheres.action.UtilisateurBuilder;
import fr.eni.Encheres.bll.UtilisateurManager;
import fr.eni.Encheres.bo.Utilisateur;

/**
 * Servlet implementation class ServletModificationCompte
 */
@WebServlet("/modificationCompte")
public class ServletModificationCompte extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static UtilisateurManager utilisateurManager;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public void init() {
		utilisateurManager = new UtilisateurManager();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//recupere le numero d'utilisateur de la requete
		int no_utilisateur = Integer.valueOf(request.getParameter("no_utilisateur"));

		//cherche dans la DB l'utilisateur correspondant au no_utilisateur
		Utilisateur utilisateur = utilisateurManager.getUtilisateurById(no_utilisateur);
		utilisateur.setMotDePasse("");
		// ajoute à la réponse l'utilisateur pour être récupéré sur la JSP
		request.setAttribute("utilisateur", utilisateur);
				
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/jsp/modification-du-compte.jsp");
		rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Utilisateur utilisateur = UtilisateurBuilder.execute(request, response);
		utilisateur.setNumeroUtilisateur(Integer.valueOf(request.getParameter("no_utilisateur")));
		utilisateurManager.metAJourUtilisateur(utilisateur);
		
		utilisateur.setMotDePasse("");
		request.setAttribute("utilisateur", utilisateur);
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/modification-du-compte.jsp");
		rd.forward(request, response);
	}

}
