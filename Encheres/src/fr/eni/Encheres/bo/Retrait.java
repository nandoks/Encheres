package fr.eni.Encheres.bo;

import java.io.Serializable;

public class Retrait implements Serializable {
	private static final long serialVersionUID = 1L;

	private String rue;
	private String codePostal;
	private String ville;
	private int numeroArticle;

	public int getNumeroArticle() {
		return numeroArticle;
	}

	public void setNumeroArticle(int numeroArticle) {
		this.numeroArticle = numeroArticle;
	}

	// Constructeur vide
	public Retrait() {
	}

	// Constructeur avec tous les paramètres
	public Retrait(String rue, String codePostal, String ville) {
		super();
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

}
