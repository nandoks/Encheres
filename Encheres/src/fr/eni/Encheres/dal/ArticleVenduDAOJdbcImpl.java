package fr.eni.Encheres.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import fr.eni.Encheres.bo.ArticleVendu;

public class ArticleVenduDAOJdbcImpl implements ArticleVenduDAO {

	/*private static final String sqlSelectAll = "SELECT no_article,nom_article,description,date_debut_encheres,date_fin_encheres,"
			+ "prix_initial, prix_vente, no_utilisateur, no_categorie, libelle, rue, code_postal, ville, from articles_vendus a"+
			"INNER JOIN retraits r ON a.no_article = r.no_article";

	private final String sqlSelectById = "SELECT no_article,nom_article,description,date_debut_encheres,date_fin_encheres,"
			+ "prix_initial, prix_vente, no_utilisateur, no_categorie from articles_vendus where no_article = ?;";*/

	private final String SQL_INSERT = "INSERT INTO articles_vendus (nom_article,description,date_debut_encheres,date_fin_encheres,"
			+ "prix_initial,prix_vente,no_utilisateur,no_categorie) values (?,?,?,?,?,?,?,?)";

	private final String SQL_UPDATE = "UPDATE articles_vendus nom_article=?,description=?,date_debut_encheres=?,date_fin_encheres=?,"
			+ "prix_initial=?,prix_vente=?,no_utilisateur=?,no_categorie=? where no_article = ?";

	private final String SQL_DELETE = "DELETE FROM articles_vendus where no_article=?";

	
	@Override
	public List<ArticleVendu> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArticleVendu selectById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

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
	public List<ArticleVendu> getArticlesByNumeroUtilisateur(int numeroUtilisateur) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ArticleVendu> selectByNoCategorie(int noCategorie) {
		// TODO Auto-generated method stub
		return null;
	}

}
