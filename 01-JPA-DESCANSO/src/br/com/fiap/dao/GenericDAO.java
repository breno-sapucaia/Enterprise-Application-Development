package br.com.fiap.dao;

public interface GenericDAO<Entity,Key> {
	
	void cadastrar(Entity entity);
	
	void atualizar(Entity entity);
	
	Entity pesquisar(Key id);
	
	void deletar(Key id);
	
	void commit();

}
