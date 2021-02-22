package fr.eni.Encheres.dal;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.eni.Encheres.bo.ArticleVendu;

public class ArticleVenduDAOJdbcImpl implements ArticleVenduDAO {

	private static final String SQL_SELECT_ALL = "SELECT nom_article, prix_initial, date_fin_encheres, pseudo, a.no_utilisateur, libelle FROM articles_vendus a INNER JOIN utilisateurs u ON a.no_utilisateur = u.no_utilisateur INNER JOIN categories c ON a.no_categorie = c.no_categorie";
		
	private final String SQL_INSERT = "INSERT INTO articles_vendus (nom_article,description,date_debut_encheres,date_fin_encheres, "
			+ " prix_initial,prix_vente,no_utilisateur,no_categorie) values (?,?,?,?,?,?,?,?)";

	private final String SQL_UPDATE = "UPDATE articles_vendus nom_article=?,description=?,date_debut_encheres=?,date_fin_encheres=?, "
			+ " prix_initial=?,prix_vente=?,no_utilisateur=?,no_categorie=? where no_article = ?";

	private final String SQL_DELETE = "DELETE FROM articles_vendus where no_article=?";
	
	private final String SQL_SELECT_BY_CATEGORIE = "SELECT nom_article, prix_initial, date_fin_encheres, pseudo, a.no_utilisateur, libelle "
			+" FROM articles_vendus a INNER JOIN utilisateurs u ON a.no_utilisateur = u.no_utilisateur "
			+" INNER JOIN categories c ON a.no_categorie = c.no_categorie WHERE libelle = ?";
	
	private final String SQL_SELECT_BY_MOT_CLE = "SELECT nom_article, prix_initial, date_fin_encheres, pseudo, a.no_utilisateur, libelle "
			+" FROM articles_vendus a INNER JOIN utilisateurs u ON a.no_utilisateur = u.no_utilisateur "
			+" INNER JOIN categories c ON a.no_categorie = c.no_categorie where nom_article LIKE ?";

	private final String SQL_SELECT_BY_MOT_CLE_ET_CATEGORIE = "SELECT nom_article, prix_initial, date_fin_encheres, pseudo, a.no_utilisateur, libelle "
			+" FROM articles_vendus a INNER JOIN utilisateurs u ON a.no_utilisateur = u.no_utilisateur "
			+" INNER JOIN categories c ON a.no_categorie = c.no_categorie where nom_article LIKE ? AND libelle = ?";

	@Override
	public void insert(ArticleVendu articleVendu) {
		try(Connection cnx = ConnectionProvider.getConnection()){
			PreparedStatement stmt = cnx.prepareStatement(SQL_INSERT, PreparedStatement.RETURN_GENERATED_KEYS);
			stmt.setString(1, articleVendu.getNomArticle());
			stmt.setString(2, articleVendu.getDescription());
			stmt.setDate(3, java.sql.Date.valueOf(articleVendu.getDateDebutEncheres()));
			stmt.setDate(4, java.sql.Date.valueOf(articleVendu.getDateFinEncheres()));
			stmt.setInt(5, articleVendu.getMiseAPrix());
			stmt.setInt(6, articleVendu.getPrixVente());
			stmt.executeUpdate();
			ResultSet rs = stmt.getGeneratedKeys();
			if(rs.next()) {
				articleVendu.setNoArticle(1);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void update(ArticleVendu articleVendu) {
		try(Connection cnx = ConnectionProvider.getConnection()){
			PreparedStatement stmt = cnx.prepareStatement(SQL_UPDATE);
			stmt.setString(1, articleVendu.getNomArticle());
			stmt.setString(2, articleVendu.getDescription());
			stmt.setDate(3, java.sql.Date.valueOf(articleVendu.getDateDebutEncheres()));
			stmt.setDate(4, java.sql.Date.valueOf(articleVendu.getDateFinEncheres()));
			stmt.setInt(5, articleVendu.getMiseAPrix());
			stmt.setInt(6, articleVendu.getPrixVente());
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(int id) {
		try(Connection cnx = ConnectionProvider.getConnection()){
			PreparedStatement stmt = cnx.prepareStatement(SQL_DELETE);
			stmt.setInt(1, id);
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<ArticleVendu> selectAll() {
		List<ArticleVendu> listeArticles = new ArrayList<>();
		try(Connection cnx = ConnectionProvider.getConnection();
			PreparedStatement stmt = cnx.prepareStatement(SQL_SELECT_ALL);){
			ResultSet rs = stmt.executeQuery();
			ArticleVendu articleCourant = null;
			while(rs.next()) {
				articleCourant = new ArticleVendu();

				articleCourant.setNomArticle(rs.getString("nom_article"));
				articleCourant.setMiseAPrix(rs.getInt("prix_initial"));
				articleCourant.setDateFinEncheres(rs.getDate("date_fin_encheres").toLocalDate());
				articleCourant.setPseudoVendeur(rs.getString("pseudo"));
				articleCourant.setNumeroUtilisateur(rs.getInt("no_utilisateur"));
				articleCourant.setLibelleCategorie(rs.getString("libelle"));

				listeArticles.add(articleCourant);
			}
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listeArticles;
	}
	
	@Override
	public List<ArticleVendu> selectArticlesByCategorie(String categorie){
		List<ArticleVendu> listeArticles = new ArrayList<>();
		try(Connection cnx = ConnectionProvider.getConnection()){
			PreparedStatement stmt = cnx.prepareStatement(SQL_SELECT_BY_CATEGORIE);
			stmt.setString(1, categorie);
			ResultSet rs = stmt.executeQuery();
			ArticleVendu articleCourant = null;
			while(rs.next()) {
				articleCourant = new ArticleVendu();

				articleCourant.setNomArticle(rs.getString("nom_article"));
				articleCourant.setMiseAPrix(rs.getInt("prix_initial"));
				articleCourant.setDateFinEncheres(rs.getDate("date_fin_encheres").toLocalDate());
				articleCourant.setPseudoVendeur(rs.getString("pseudo"));
				articleCourant.setNumeroUtilisateur(rs.getInt("no_utilisateur"));
				articleCourant.setLibelleCategorie(rs.getString("libelle"));

				listeArticles.add(articleCourant);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listeArticles;
	}

	@Override
	public List<ArticleVendu> selectArticlesByMotCle(String motCle) {
		List<ArticleVendu> listeArticles = new ArrayList<>();
		try(Connection cnx = ConnectionProvider.getConnection()){
			PreparedStatement stmt = cnx.prepareStatement(SQL_SELECT_BY_MOT_CLE);
			stmt.setString(1, "%" + motCle + "%");
			ResultSet rs = stmt.executeQuery();
			ArticleVendu articleCourant = null;
			while(rs.next()) {
				articleCourant = new ArticleVendu();

				articleCourant.setNomArticle(rs.getString("nom_article"));
				articleCourant.setMiseAPrix(rs.getInt("prix_initial"));
				articleCourant.setDateFinEncheres(rs.getDate("date_fin_encheres").toLocalDate());
				articleCourant.setPseudoVendeur(rs.getString("pseudo"));
				articleCourant.setNumeroUtilisateur(rs.getInt("no_utilisateur"));
				articleCourant.setLibelleCategorie(rs.getString("libelle"));

				listeArticles.add(articleCourant);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listeArticles;
	}
	
	@Override
	public List<ArticleVendu> selectArticlesByNumeroUtilisateur(int numeroUtilisateur) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArticleVendu selectById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ArticleVendu> selectArticlesByMotCleEtCategorie(String motCle, String categorie) {
		List<ArticleVendu> listeArticles = new ArrayList<ArticleVendu>();
		try(Connection cnx = ConnectionProvider.getConnection()){
			PreparedStatement stmt = cnx.prepareStatement(SQL_SELECT_BY_MOT_CLE_ET_CATEGORIE);
			stmt.setString(1, "&" + motCle + "&");
			stmt.setString(2, categorie);
			ResultSet rs = stmt.executeQuery();
			ArticleVendu articleCourant = null;
			while(rs.next()) {
			articleCourant = new ArticleVendu();
			articleCourant.setNomArticle(rs.getString("nom_article"));
			articleCourant.setMiseAPrix(rs.getInt("prix_initial"));
			articleCourant.setDateFinEncheres(rs.getDate("date_fin_encheres").toLocalDate());
			articleCourant.setPseudoVendeur(rs.getString("pseudo"));
			articleCourant.setNumeroUtilisateur(rs.getInt("no_utilisateur"));
			articleCourant.setLibelleCategorie(rs.getString("libelle"));
			listeArticles.add(articleCourant);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listeArticles;
	}
	
}
