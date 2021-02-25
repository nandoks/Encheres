package fr.eni.Encheres.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import fr.eni.Encheres.bo.Retrait;

public class RetraitDAOJdbcImpl implements RetraitDAO{

	public final String sqlInsert = "INSERT INTO retraits (no_article, rue, code_postal, ville)"
			+ "values (?,?,?,?)";
	
	public final String sqlSelectById = "SELECT rue, code_postal, ville FROM retraits where no_article = ?";
	
	@Override
	public List<Retrait> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Retrait selectById(int id) {
		Retrait retrait = new Retrait();
		try(Connection conn = ConnectionProvider.getConnection();
				PreparedStatement prst = conn.prepareStatement(sqlInsert, PreparedStatement.RETURN_GENERATED_KEYS)){
			prst.setInt(1, id);
			ResultSet rs = prst.executeQuery();
			if(rs.next()) {
				retrait.setRue(rs.getString("rue"));
				retrait.setCodePostal(rs.getString("code_postal"));
				retrait.setVille(rs.getString("ville"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return retrait;
	}

	@Override
	public void insert(Retrait retrait) {
		try(Connection conn = ConnectionProvider.getConnection();
				PreparedStatement prst = conn.prepareStatement(sqlSelectById)){
			int index = 1;
			prst.setInt(index++, retrait.getNumeroArticle());
			prst.setString(index++, retrait.getRue());
			prst.setString(index++, retrait.getCodePostal());
			prst.setString(index++, retrait.getVille());
			prst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void update(Retrait obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
