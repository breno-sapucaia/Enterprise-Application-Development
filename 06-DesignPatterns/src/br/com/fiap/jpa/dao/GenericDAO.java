package br.com.fiap.jpa.dao;

import br.com.fiap.jpa.excpetions.CommitException;
import br.com.fiap.jpa.excpetions.KeyNotFoundException;

public interface GenericDAO<T,K> {
		
	void cadastrar(T entity);
	
	void atualizar(T entity);
	
	void deletar(K id) throws KeyNotFoundException;
	
	T pesquisar(K id) throws KeyNotFoundException;
	
	void commit() throws CommitException;
	
	
}
