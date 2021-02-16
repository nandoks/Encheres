package fr.eni.Encheres.bo;

import java.util.Date;

public class Enchere {
	private Date dateEnchere;
	private int montantEnchere;
	
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
