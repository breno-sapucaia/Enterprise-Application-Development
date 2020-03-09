package br.com.fiap.jpa.view;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.jpa.dao.GenericDAO;
import br.com.fiap.jpa.dao.impl.GenericDAOImpl;
import br.com.fiap.jpa.entites.Colaborador;
import br.com.fiap.jpa.excpetions.CommitException;
import br.com.fiap.jpa.singleton.EntityManagerFactorySingleton;

public class View2 {

	public static void main(String[] args) {
		EntityManagerFactory emf = EntityManagerFactorySingleton.getInstance();
		EntityManager em = emf.createEntityManager();
		
		//Utilizar o dao genérico sem precisar criar a classe e interface
		GenericDAO<Colaborador, Integer> dao = new GenericDAOImpl<Colaborador, Integer>(em){};
		
		try {
			Colaborador c = new Colaborador();
			dao.cadastrar(c);
			dao.commit();
		}catch (CommitException e) {
			e.printStackTrace();
			System.out.println("Error ao cadastra..");
		}
		
		
		em.close();
		emf.close();
	}

}
