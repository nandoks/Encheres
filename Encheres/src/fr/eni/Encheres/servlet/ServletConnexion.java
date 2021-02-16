package fr.eni.Encheres.servlet;

import java.io.IOException;
import java.util.List;

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
		
		String nomUtilisateur = (String) request.getAttribute("Identifiant");
		String motDePasse= (String) request.getAttribute("pass");
		System.out.println(nomUtilisateur  + "," + motDePasse);
		Utilisateur utilisateur  = null; 
		List<Utilisateur> listeUtilisateur = utilisateurManager.getUtilisateurs();
		for (Utilisateur u : listeUtilisateur) {
			if(u.equals(nomUtilisateur, motDePasse)) {
				utilisateur  = u;
				System.out.println("Utilisateur trouvé");
			}
		}
		
		
		if(utilisateur != null) {
			boolean seRappelerDeMoi = request.getAttribute("seRappelerDeMoi") == null; 
			if(seRappelerDeMoi) {
				HttpSession session = request.getSession();
				session.setAttribute("utilisateurConnecte", utilisateur);
				System.out.println("creation cookie");
			}
			response.sendRedirect("/Connexion.jsp");
		} else {
			request.setAttribute("messageErreur", "cet utilisateur n'existe pas, mot de passe ou mail incorrect");
			response.sendRedirect("/Connextion.jsp");
		}
	}
}





















