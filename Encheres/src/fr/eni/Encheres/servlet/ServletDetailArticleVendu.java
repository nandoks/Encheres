package fr.eni.Encheres.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.Encheres.bll.ArticleVenduManager;
import fr.eni.Encheres.bo.ArticleVendu;

/**
 * Servlet implementation class ServletDetailArticleVendu
 */
@WebServlet("/detailArticleVendu")
public class ServletDetailArticleVendu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletDetailArticleVendu() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//ArticleVenduManager articleManager = new ArticleVenduManager();
		int numeroArticle = Integer.parseInt(request.getParameter("noArticle"));
		//ArticleVendu article = articleManager.getArticlesByNumeroArticle(numeroArticle);
		
		//request.setAttribute("article", article);
		
		
		//HttpSession session = request.getSession();
		//if (session.getAttribute("utilisateurConnecte") == null) {
			
		//}
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/detail-vente.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
