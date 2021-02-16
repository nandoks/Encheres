package fr.eni.Encheres.bo;

import java.io.Serializable;

public class Categorie implements Serializable {
	private static final long serialVersionUID = 1L;

	private int libelle;
	private int noCategorie;

	// Constructeur vide
	public Categorie() {
	}

	// Constructeur avec tous les paramètres
	public Categorie(int libelle, int noCategorie) {
		super();
		this.libelle = libelle;
		this.noCategorie = noCategorie;
	}

	public int getLibelle() {
		return libelle;
	}

	public void setLibelle(int libelle) {
		this.libelle = libelle;
	}

	public int getNoCategorie() {
		return noCategorie;
	}

	public void setNoCategorie(int noCategorie) {
		this.noCategorie = noCategorie;
	}

}
