package fr.eni.Encheres.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;

import fr.eni.Encheres.bll.UtilisateurManager;
import fr.eni.Encheres.bo.Utilisateur;

/**
 * Servlet implementation class ServletLogin
 */
@WebServlet("/login")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private static UtilisateurManager utilisateurManager;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletLogin() {
        utilisateurManager = new UtilisateurManager();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nomUtilisateur = (String) request.getAttribute("");
		String motDePasse= (String) request.getAttribute("motDepasse");
		
		Utilisateur utilisateur  = null; 
		List<Utilisateur> listeUtilisateur = utilisateurManager.getUtilisateurs();
		for (Utilisateur u : listeUtilisateur) {
			if(u.equals(nomUtilisateur, motDePasse)) {
				utilisateur  = u;
			}
		}
		
		
		if(utilisateur != null) {
			boolean seRappelerDeMoi = request.getAttribute("seRappelerDeMoi") == null; 
			if(seRappelerDeMoi) {
				HttpSession session = request.getSession();
				session.setAttribute("utilisateurConnecte", utilisateur);
			}
			response.sendRedirect("");
		} else {
			request.setAttribute("messageErreur", "cet utilisateur n'existe pas, mot de passe ou mail incorrect");
			response.sendRedirect("");
		}
	}
}





















