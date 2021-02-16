package fr.eni.Encheres.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.eni.Encheres.bll.ArticleVenduManager;
import fr.eni.Encheres.bo.ArticleVendu;
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

	private final String sqlAuthentificationValide = "select * from utilisateurs where mot_de_passe=? et email=?";

	/* Retourne tous les utilisateurs de la BDD */
	@Override
	public List<Utilisateur> selectAll() {
		List<Utilisateur> listeUtilisateur = new ArrayList<>();

		try (Connection conn = ConnectionProvider.getConnection();
				PreparedStatement prst = conn.prepareStatement(sqlSelectAll)) {
			ResultSet rs = prst.executeQuery();
			while (rs.next()) {
				Utilisateur utilisateur = utilisateurBuilder(rs);
				listeUtilisateur.add(utilisateur);
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return listeUtilisateur;
	}

	/*
	 * Prends en paramentre un int ID retourne un utilisateur
	 */
	@Override
	public Utilisateur selectById(int id) {
		Utilisateur utilisateur = new Utilisateur();
		try (Connection conn = ConnectionProvider.getConnection();
				PreparedStatement prst = conn.prepareStatement(sqlSelectById)) {
			prst.setInt(1, id);
			ResultSet rs = prst.executeQuery();
			if (rs.next()) {
				utilisateur = utilisateurBuilder(rs);
			}
			ArticleVenduManager am = new ArticleVenduManager();
			utilisateur.setListeArticlesVendus(am.getArticlesByNumeroUtilisateur(utilisateur.getNumeroUtilisateur()));

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return utilisateur;
	}

	/*
	 * Cree un utilisateur dans la BDD avec les informations de l'objet utilisateur
	 * passé en parametres affecte un numeroUtilisateur qui est généré par la BDD à
	 * l'utilisateur
	 */
	@Override
	public void insert(Utilisateur utilisateur) {

		try (Connection conn = ConnectionProvider.getConnection();
				PreparedStatement prst = conn.prepareStatement(sqlInsert, PreparedStatement.RETURN_GENERATED_KEYS)) {

			int index = 1;
			prst.setString(index++, utilisateur.getPseudo());
			prst.setString(index++, utilisateur.getNom());
			prst.setString(index++, utilisateur.getPrenom());
			prst.setString(index++, utilisateur.getEmail());
			prst.setString(index++, utilisateur.getTelephone());
			prst.setString(index++, utilisateur.getRue());
			prst.setString(index++, utilisateur.getTelephone());
			prst.setString(index++, utilisateur.getCodePostal());
			prst.setString(index++, utilisateur.getVille());
			prst.setString(index++, utilisateur.getMotDePasse());
			prst.setInt(index++, 100);
			prst.setBoolean(index++, false);
			prst.executeUpdate();

			ResultSet rs = prst.getGeneratedKeys();
			if (rs.next()) {
				utilisateur.setNumeroUtilisateur(rs.getInt(1));
			}
			rs.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	/* Met à jour les données de l'utilisateur passé en parametre */
	@Override
	public void update(Utilisateur utilisateur) {
		try (Connection conn = ConnectionProvider.getConnection();
				PreparedStatement prst = conn.prepareStatement(sqlUpdate)) {

			int index = 1;
			prst.setString(index++, utilisateur.getPseudo());
			prst.setString(index++, utilisateur.getNom());
			prst.setString(index++, utilisateur.getPrenom());
			prst.setString(index++, utilisateur.getEmail());
			prst.setString(index++, utilisateur.getTelephone());
			prst.setString(index++, utilisateur.getRue());
			prst.setString(index++, utilisateur.getTelephone());
			prst.setString(index++, utilisateur.getCodePostal());
			prst.setString(index++, utilisateur.getVille());
			prst.setString(index++, utilisateur.getMotDePasse());
			prst.setInt(index++, 100);
			prst.setBoolean(index++, false);
			prst.setInt(index++, utilisateur.getNumeroUtilisateur());
			prst.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	/*
	 * prends en parametre un id et Supprime de la DBB l'utilisateur associé à l'id
	 */
	@Override
	public void delete(int id) {
		try (Connection conn = ConnectionProvider.getConnection();
				PreparedStatement prst = conn.prepareStatement(sqlDelete)) {
			prst.setInt(1, id);
			prst.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	/*
	 * Cherche dans la BDD si le pseudo ou le mail existe si dans le ResultSet est
	 * vide alors il n'existe aucune ocurence du pseudo ou du mail dans ce cas on
	 * retourne false sinon retourne true
	 */
	@Override
	public boolean utilisateurExisteDansLaBDD(String pseudo, String email) {
		boolean utilisateurExiste = false;
		try (Connection conn = ConnectionProvider.getConnection();
				PreparedStatement prst = conn.prepareStatement(sqlUtilisateurExiste)) {
			prst.setString(1, pseudo);
			prst.setString(2, email);
			ResultSet rs = prst.executeQuery();
			if (rs.next()) {
				utilisateurExiste = true;
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return utilisateurExiste;
	}

	/*
	 * Methode qui prends en parametre un ResultSet rs et qui retourne un objet du
	 * type Utilisateur
	 */
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
