package br.com.fiap.dao.impl;

import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;

import br.com.fiap.dao.GenericDAO;

public class GenericDAOImpl<Entity, Key> implements GenericDAO<Entity, Key> {
	
	private EntityManager em;
	private Class<Entity> __class__;
	
	@SuppressWarnings("all")
	public GenericDAOImpl(EntityManager em) {
		this.em = em;
		this.__class__ = (Class<Entity>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0]; 
	}
	
	@Override
	public void cadastrar(Entity entity) {
		em.persist(entity);
		
	}

	@Override
	public void atualizar(Entity entity) {
		em.merge(entity);
		
	}

	@Override
	public Entity pesquisar(Key id) {
		Entity entity = em.find(__class__, id);
		
		if(entity == null) {
			throw KeyNotFoundException;
		}
		
		return null;
	}

	@Override
	public void deletar(Key id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void commit() {
		// TODO Auto-generated method stub
		
	}

}
