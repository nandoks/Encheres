package fr.eni.Encheres.dal;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import fr.eni.Encheres.bll.EnchereDAO;
import fr.eni.Encheres.bo.Enchere;

public class EnchereDAOJdbcImpl implements EnchereDAO {

	private final String sqlInsert = "INSERT INTO encheres (date_enchere, montant_enchere, no_article, no_utilisateur) values"
			+ "(?,?,?,?)";
	
	
	@Override
	public List<Enchere> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Enchere selectById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Enchere enchere) {
		try(Connection con = ConnectionProvider.getConnection();
				PreparedStatement prst = con.prepareStatement(sqlInsert, PreparedStatement.RETURN_GENERATED_KEYS)){
			prst.setDate(1, (Date) enchere.getDateEnchere());
			prst.setInt(2, enchere.getMontantEnchere());
			prst.setInt(3, enchere.getNumeroArticle());
			prst.setInt(4, enchere.getNumeroUtilisateur());
			prst.executeUpdate();
			ResultSet rs = prst.getGeneratedKeys();
			if(rs.next()) {
				enchere.setNumeroEnchere(rs.getInt(1));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void update(Enchere obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
