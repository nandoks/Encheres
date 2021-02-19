package fr.eni.Encheres.bo;

import java.util.List;

public class Utilisateur {
	
	private int numeroUtilisateur;
	private String pseudo;
	private String nom;
	private String prenom;
	private String email;
	private String telephone;
	private String rue;
	private String codePostal;
	private String ville;
	private String motDePasse;
	private int credit;
	private boolean administrateur;
	private List<ArticleVendu> listeArticlesVendus;
	private List<Enchere> listeEncheres;
	

	public Utilisateur() {
		
	}
	
	public List<ArticleVendu> getListeArticlesVendus() {
		return listeArticlesVendus;
	}

	public void setListeArticlesVendus(List<ArticleVendu> listeArticlesVendus) {
		this.listeArticlesVendus = listeArticlesVendus;
	}

	public List<Enchere> getListeEncheres() {
		return listeEncheres;
	}

	public void setListeEncheres(List<Enchere> listeEncheres) {
		this.listeEncheres = listeEncheres;
	}
	
	public int getNumeroUtilisateur() {
		return numeroUtilisateur;
	}
	public void setNumeroUtilisateur(int numeroUtilisateur) {
		this.numeroUtilisateur = numeroUtilisateur;
	}
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
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
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public boolean isAdministrateur() {
		return administrateur;
	}
	public void setAdministrateur(boolean administrateur) {
		this.administrateur = administrateur;
	}
	
	public boolean equals(String pseudo, String motDePasse) {
		if(!this.pseudo.equals(pseudo)) {
			return false;
		}
		
		if(!this.motDePasse.equals(motDePasse)) {
			return false;
		}
		return true;
	}

//	@Override
//	public String toString() {
//		return "Utilisateur [numeroUtilisateur=" + numeroUtilisateur + ", pseudo=" + pseudo + ", nom=" + nom
//				+ ", prenom=" + prenom + ", email=" + email + ", telephone=" + telephone + ", rue=" + rue
//				+ ", codePostal=" + codePostal + ", ville=" + ville + ", motDePasse=" + motDePasse + ", credit="
//				+ credit + ", administrateur=" + administrateur + ", listeArticlesVendus=" + listeArticlesVendus
//				+ ", listeEncheres=" + listeEncheres + "]";
//	}	
	
}
