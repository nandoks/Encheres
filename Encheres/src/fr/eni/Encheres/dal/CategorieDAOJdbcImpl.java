package fr.eni.Encheres.dal;

import java.util.List;

import fr.eni.Encheres.bo.Categorie;

public class CategorieDAOJdbcImpl implements CategorieDAO {
	private final String sqlSelectAll = "SELECT no_categorie,libelle,from categorie";

	private final String sqlSelectById = "SELECT no_categorie,libelle,from categorie where no_categorie = ?;";

	private final String sqlInsert = "INSERT INTO categorie (no_categorie, libelle) values (?,?)";

	private final String sqlUpdate = "UPDATE categorie no_categorie=? where no_categorie = ?";

	private final String sqlDelete = "";

	@Override
	public List<Categorie> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Categorie selectById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Categorie obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Categorie obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

}
