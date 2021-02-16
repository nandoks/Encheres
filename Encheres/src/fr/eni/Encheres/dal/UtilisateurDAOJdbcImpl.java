package fr.eni.Encheres.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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

	private final String sqlDelete = "delete from utilisateur where no_utilisateur=?";

	private final String sqlUtilisateurExiste = "select * from utilisateurs where pseudo=? or email=?";
	
	/*Retourne tous les utilisateurs de la BDD*/
	@Override
	public List<Utilisateur> selectAll() {
		List<Utilisateur> listeUtilisateur = new ArrayList<>();
		
		try(Connection conn = ConnectionProvider.getConnection();
				PreparedStatement prst = conn.prepareStatement(sqlSelectAll)){
			ResultSet rs = prst.executeQuery();
			while(rs.next()) {
				Utilisateur utilisateur = utilisateurBuilder(rs);
				listeUtilisateur.add(utilisateur);				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return listeUtilisateur;
	}

	

	/* Prends en paramentre un int ID
	 * retourne un utilisateur*/
	@Override
	public Utilisateur selectById(int id) {
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

	
	/*Cherche dans la BDD si le pseudo ou le mail existe
	 * si dans le ResultSet est vide alors il n'existe aucune ocurence
	 * du pseudo ou du mail dans ce cas on retourne false 
	 * sinon retourne true*/
	@Override
	public boolean utilisateurExisteDansLaBDD(String pseudo, String email) {
		boolean utilisateurExiste = false;


		return utilisateurExiste ;
	}

	
	/*Methode qui prends en parametre un ResultSet rs
	 * et qui retourne un objet du type Utilisateur*/
	private Utilisateur utilisateurBuilder(ResultSet rs) throws SQLException {
		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setNumeroUtilisateur(rs.getInt("no_utilisateur"));
		utilisateur.setPseudo(rs.getString("pseudo"));
		utilisateur.setNom(rs.getString("nom"));
		utilisateur.setPrenom(rs.getString("prenom"));
		utilisateur.setTelephone(rs.getString("telephone"));
		utilisateur.setRue(rs.getString("rue"));
		utilisateur.setCodePostal(rs.getString("code_postal"));
		utilisateur.setVille(rs.getString("ville"));
		utilisateur.setMotDePasse(rs.getString("mot_de_passe"));
		utilisateur.setCredit(rs.getInt("credit"));
		utilisateur.setAdministrateur(rs.getBoolean("administrateur"));
		return utilisateur;
	}
}
