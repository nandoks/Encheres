package fr.eni.Encheres.servlet;

import java.io.IOException;
import java.util.List;

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
 * Servlet implementation class ServletLogin
 */
@WebServlet("/authentification")
public class ServletConnexion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private static UtilisateurManager utilisateurManager;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletConnexion() {
        utilisateurManager = new UtilisateurManager();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nomUtilisateur = (String) request.getParameter("identifiant");
		String motDePasse= (String) request.getParameter("pass");
				
		System.out.println("form: " + nomUtilisateur  + "," + motDePasse);
		
		Utilisateur utilisateur  = null; 
		List<Utilisateur> listeUtilisateur = utilisateurManager.getUtilisateurs();
		for (Utilisateur u : listeUtilisateur) {
			if(u.equals(nomUtilisateur, motDePasse)) {
				utilisateur  = u;
				System.out.println("Utilisateur trouvé");
			}
		}
		
		String url = "";
		if(utilisateur != null) {
			boolean seRappelerDeMoi = request.getParameter("Se-souvenir-de-moi") != null; 
			System.out.println(seRappelerDeMoi);
			if(seRappelerDeMoi) {
				HttpSession session = request.getSession();
				session.setAttribute("utilisateurConnecte", utilisateur);
				System.out.println("creation cookie");
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





















