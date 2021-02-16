package fr.eni.Encheres.dal;

import java.util.List;

import fr.eni.Encheres.bo.ArticleVendu;

public class ArticleVenduDAOJdbcImpl implements ArticleVenduDAO {

	/*private static final String sqlSelectAll = "SELECT no_article,nom_article,description,date_debut_encheres,date_fin_encheres,"
			+ "prix_initial, prix_vente, no_utilisateur, no_categorie, libelle, rue, code_postal, ville, from articles_vendus a"+
			"INNER JOIN retraits r ON a.no_article = r.no_article";

	private final String sqlSelectById = "SELECT no_article,nom_article,description,date_debut_encheres,date_fin_encheres,"
			+ "prix_initial, prix_vente, no_utilisateur, no_categorie from articles_vendus where no_article = ?;";

	private final String sqlInsert = "INSERT INTO articles_vendus (nom_article,description,date_debut_encheres,date_fin_encheres,"
			+ "prix_initial,prix_vente,no_utilisateur,no_categorie,rue,code_postal,ville) values (?,?,?,?,?,?,?,?,?,?,?)";

	private final String sqlUpdate = "UPDATE utilisateurs pseudo=?,nom=?,prenom=?,email=?,telephone=?,rue=?,code_postal=?,"
			+ "ville=?,mot_de_passe=?,credit=?,administrateur=? where no_utilisateur = ?";

	private final String sqlDelete = "delete from utilisateur where no_utilisateur=?";

	private final String sqlUtilisateurExiste = "select * from utilisateurs where pseudo=? or email=?";*/
	
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
	public void insert(ArticleVendu obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(ArticleVendu obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
