package br.com.fiap.jpa.singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Classe que gerenia o objeto da Fábrica de Entity Manager, 
 * permitindo somente uma única instância da Fábrica.
 */
public class EntityManagerFactorySingleton  {

	//atributo estático que armazena a única instância
	private static EntityManagerFactory entityManagerFactory;
	
	//construtor privado -> não é possível instanciar a classe
	private EntityManagerFactorySingleton() {}
	
	//método estático qe ertorna a única instância	
	public static EntityManagerFactory getInstance() {
	
		if(entityManagerFactory == null)
			entityManagerFactory = Persistence.createEntityManagerFactory("oracle");

		return entityManagerFactory;
	}
	
}
