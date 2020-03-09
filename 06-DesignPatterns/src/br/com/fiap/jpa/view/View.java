package br.com.fiap.jpa.view;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.jpa.dao.ContaDAO;
import br.com.fiap.jpa.dao.impl.ContaDAOImpl;
import br.com.fiap.jpa.entites.Conta;
import br.com.fiap.jpa.enums.TipoConta;
import br.com.fiap.jpa.excpetions.CommitException;
import br.com.fiap.jpa.singleton.EntityManagerFactorySingleton;

public class View {
	public static void main(String[] args) {
		//Obter uma instância da fabrica
		EntityManagerFactory emf = EntityManagerFactorySingleton.getInstance();
		
		Conta conta = new Conta();
		conta.setAbertura(Calendar.getInstance());
		conta.setAgencia(1521);
		conta.setSaldo(-260);
		conta.setTipoconta(TipoConta.CORRENTE);
		
		EntityManager em = emf.createEntityManager();
		
		ContaDAO cdi = new ContaDAOImpl(em);
		
		cdi.cadastrar(conta);
		
		try {
			cdi.commit();
		} catch (CommitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		em.close();
		emf.close();
	}

}
