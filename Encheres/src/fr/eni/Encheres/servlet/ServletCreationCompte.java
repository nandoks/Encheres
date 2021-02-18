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
 * Servlet implementation class ServletCreationCompte
 */
@WebServlet("/creationCompte")
public class ServletCreationCompte extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static UtilisateurManager utilisateurManager;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public ServletCreationCompte() {
        utilisateurManager = new UtilisateurManager();
    }

    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/CreationCompte.jsp");

		rd.forward(request, response);
	}
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Utilisateur utilisateur = UtilisateurBuilder.execute(request, response);
		
		String messageErreur = utilisateurManager.ajouteUtilisateur(utilisateur);
		
		request.setAttribute("messageErreur", messageErreur);
		if(messageErreur != null) {
			RequestDispatcher rd = request.getRequestDispatcher("");
			rd.forward(request, response);
		}
		RequestDispatcher rd = request.getRequestDispatcher("");
		rd.forward(request, response);
		
	}

}








