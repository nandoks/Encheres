package fr.eni.Encheres.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.Encheres.bll.UtilisateurManager;
import fr.eni.Encheres.bo.Utilisateur;

/**
 * Servlet implementation class ServletInformationUtilisateur
 */
@WebServlet("/ServletInformationUtilisateur")
public class ServletInformationUtilisateur extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private static UtilisateurManager utilisateurManager;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public void init() {
        utilisateurManager = new UtilisateurManager();
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int idUtilisateur = Integer.parseInt(request.getParameter("no_utilisateur"));
		
		Utilisateur utilisateur = utilisateurManager.getUtilisateurById(idUtilisateur);
		utilisateur.setMotDePasse("");
		request.setAttribute("utilisateur", utilisateur);
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/informationUtilisateur.jsp");
		rd.forward(request, response);

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
