package br.com.fiap.jpa.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.jpa.dao.ColaboradorDAO;
import br.com.fiap.jpa.entites.Conta;

public class ColaboradorDAOImpl extends GenericDAOImpl<Conta,Integer> implements ColaboradorDAO{

	public ColaboradorDAOImpl(EntityManager em) {
		super(em);
		// 
	}
	
	

}
