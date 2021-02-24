package fr.eni.Encheres.filtres;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.Encheres.bo.Utilisateur;

/**
 * Servlet Filter implementation class FiltreAuthentifie
 */
@WebFilter("/*")
public class FiltreAuthentifie implements Filter {

     /**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		
		HttpSession session = request.getSession();
		boolean utilisateurConnecte = session.getAttribute("utilisateurConnecte") == null;
		String url = ((HttpServletRequest)request).getRequestURL().toString();
		boolean pageProtege = !(url.contains("authentification") || url.contains("accueil") || url.contains("creationCompte") || url.contains("deconnexion"));
		
		if(utilisateurConnecte && pageProtege){
			response.sendRedirect("authentification");
			return;
		}
		
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
