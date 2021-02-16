package fr.eni.Encheres.dal;

import java.util.List;

import fr.eni.Encheres.bo.Utilisateur;

public class UtilisateurDAOJdbcImpl implements UtilisateurDAO {

	private final String sqlSelectAll = "SELECT no_utilisateur,pseudo,nom,prenom,email,telephone,rue,code_postal,"
			+ "ville,mot_de_passe,credit,administrateur	from utilisateurs";

	private final String sqlSelectById = "SELECT no_utilisateur,pseudo,nom,prenom,email,telephone,rue,code_postal,"
			+ "ville,mot_de_passe,credit,administrateur	from utilisateurs where no_utilisateur = ?;";

	private final String sqlInsert = "INSERT INTO utilisateur (pseudo,nom,prenom,email,telephone,rue,code_postal,"
			+ "ville,mot_de_passe,credit,administrateur) values (?,?,?,?,?,?,?,?,?,?,?)";

	private final String sqlUpdate = "UPDATE utilisateurs pseudo=?,nom=?,prenom=?,email=?,telephone=?,rue=?,code_postal=?,"
			+ "ville=?,mot_de_passe=?,credit=?,administrateur=? where no_utilisateur = ?";

	private final String sqlDelete = "";

	private final String sqlGetElementByPseudo = "";

	private final String sqlGetElementByEmail = "";

	@Override
	public List<Utilisateur> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Utilisateur> selectById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Utilisateur obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Utilisateur obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Utilisateur getUtilisateurByPseudo(String pseudo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur getUtilisateurByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
