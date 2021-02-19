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
@WebServlet("/ServletModificationCompte")
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
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Utilisateur utilisateur = UtilisateurBuilder.execute(request, response);
		utilisateurManager.metAJourUtilisateur(utilisateur);

		RequestDispatcher rd = request.getRequestDispatcher("");
		rd.forward(request, response);
	}

}
