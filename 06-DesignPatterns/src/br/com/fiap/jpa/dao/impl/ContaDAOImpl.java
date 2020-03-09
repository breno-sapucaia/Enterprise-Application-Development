package br.com.fiap.jpa.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.jpa.dao.ContaDAO;
import br.com.fiap.jpa.entites.Conta;

public class ContaDAOImpl 
	extends GenericDAOImpl<Conta,Integer> 
	implements ContaDAO{

	public ContaDAOImpl(EntityManager em) {
		super(em);
	}
	
	
}
