package br.com.fiap.jpa.singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Classe que gerenia o objeto da F�brica de Entity Manager, 
 * permitindo somente uma �nica inst�ncia da F�brica.
 */
public class EntityManagerFactorySingleton  {

	//atributo est�tico que armazena a �nica inst�ncia
	private static EntityManagerFactory entityManagerFactory;
	
	//construtor privado -> n�o � poss�vel instanciar a classe
	private EntityManagerFactorySingleton() {}
	
	//m�todo est�tico qe ertorna a �nica inst�ncia	
	public static EntityManagerFactory getInstance() {
	
		if(entityManagerFactory == null)
			entityManagerFactory = Persistence.createEntityManagerFactory("oracle");

		return entityManagerFactory;
	}
	
}
