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

		// Recupere les parametres passés dans la requette
		String identifiant = (String) request.getParameter("identifiant");
		String motDePasse = (String) request.getParameter("pass");

		String url = "";
		/*
		 * cherche dans la BDD s'il existe un utilisateur qui possède le pseudo ou //
		 * l'email correspondant Á l'identifiant passé en parametre de la requette
		 */
		Utilisateur utilisateur = utilisateurManager.getUtilisateurParIdentifiantOuMail(identifiant, identifiant);
		/*
		 * teste si l'utilisateur retourné par la BDD est null (donc n'existe pas) et //
		 * teste si le mot de passe passé en requette correspond // à l'utilisateur
		 * retourné par la BDD si l'identifiant et l'utilisateur n'existent pas on le
		 * renvoit avec une message d'erreur vers la page de connexion
		 */
		if (utilisateur != null && utilisateur.getMotDePasse().equals(motDePasse)) {

			/*
			 * cherche le parametre se-souvenir-de-moi de la page de connexion et test s'il
			 * a été coché s'il n'a pas été coché seRappelerDeMoi sera null
			 * 
			 */
			boolean seRappelerDeMoi = request.getParameter("Se-souvenir-de-moi") != null;
			/*
			 * si on ne doit pas se rappeler de moi on va créer une session pour //
			 * l'utilisateur qui se terminera une fois la page fermé // sinon on va créer un
			 * cookie qui sera gardé chez le client jusqu'à ce que le // cookie expire ou
			 * qu'il demande la deconnexion
			 */
			if (!seRappelerDeMoi) {
				HttpSession session = request.getSession();
				session.setAttribute("utilisateurConnecte", utilisateur);
			} else {
				Cookie resterConnecte = new Cookie("seRappelerDeMoi", "true");
				resterConnecte.setMaxAge(1800);
				System.out.println("creation cookie");
				response.addCookie(resterConnecte);
			}
			url = "/WEB-INF/jsp/index.jsp";
		} else {
			request.setAttribute("messageErreur", "Mot de passe ou mail incorrect");
			url = "/WEB-INF/jsp/Connexion.jsp";
		}

		RequestDispatcher rd = request.getRequestDispatcher(url);

		rd.forward(request, response);
	}
}
