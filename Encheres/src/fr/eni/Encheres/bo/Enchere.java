package fr.eni.Encheres.bo;

import java.util.Date;

public class Enchere {
	private int numeroEnchere;
	private Date dateEnchere;
	private int montantEnchere;
	private int numeroUtilisateur;
	private int numeroArticle;
	
	
	public int getNumeroEnchere() {
		return numeroEnchere;
	}

	public void setNumeroEnchere(int numeroEnchere) {
		this.numeroEnchere = numeroEnchere;
	}
	public int getNumeroUtilisateur() {
		return numeroUtilisateur;
	}

	public void setNumeroUtilisateur(int numeroUtilisateur) {
		this.numeroUtilisateur = numeroUtilisateur;
	}

	public int getNumeroArticle() {
		return numeroArticle;
	}

	public void setNumeroArticle(int numeroArticle) {
		this.numeroArticle = numeroArticle;
	}

	public Enchere() {
		
	}
	
	public Enchere(Date dateEnchere, int montantEnchere) {
		this.dateEnchere = dateEnchere;
		this.montantEnchere = montantEnchere;
	}

	public Date getDateEnchere() {
		return dateEnchere;
	}

	public void setDateEnchere(Date dateEnchere) {
		this.dateEnchere = dateEnchere;
	}

	public int getMontantEnchere() {
		return montantEnchere;
	}

	public void setMontantEnchere(int montantEnchere) {
		this.montantEnchere = montantEnchere;
	}
	
	
	
}
