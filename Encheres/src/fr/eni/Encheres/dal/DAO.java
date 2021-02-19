package fr.eni.Encheres.dal;

import java.util.List;

public interface DAO<T> {

	/*methode générique pour récupérer toutes les valeurs dans la BDD
	 * retourne une liste de type T*/
	List<T> selectAll();
	
	/*methode générique pour récupérer dans la BDD toutes les valeurs correspondante
	 * à un int id passé en parametre
	 * retourne une liste de type T*/
	T selectById(int id);
	
	
	/*methode générique pour insérer un objet dans la BDD
	 prend en parametre un objet*/
	void insert(T obj);
	
	/*methode générique pour mettre a jour une ligne de la BDD
	 * prend en parametre un objet*/
	void update(T obj);
	
	/*methode générique pour supprimer une ligne dans la BDD
	 * prend en parametre un objet*/
	void delete(int id);
	
	
}
