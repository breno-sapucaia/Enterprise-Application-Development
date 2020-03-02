package br.com.fiap.repository.dao;

import javax.persistence.EntityManager;

import br.com.fiap.domain.Endereco;
import br.com.fiap.domain.exceptions.CommitException;
import br.com.fiap.domain.exceptions.EnderecoNaoExistenteException;
import br.com.fiap.domain.interfaces.repository.EnderecoRepository;

public class EnderecoDAO implements EnderecoRepository,AutoCloseable{

	private EntityManager em;
	
	
	public EnderecoDAO(EntityManager em) {
		this.em = em;
	}
	
	
	@Override
	public void cadastrar(Endereco end) {
		em.persist(end);
	}

	@Override
	public Endereco pesquisar(int id) throws EnderecoNaoExistenteException {
		Endereco end = em.find(Endereco.class, id);
		if( end == null ) throw new EnderecoNaoExistenteException("Endereço de código "+id+" não consta na base");
		return  end;		
	}

	@Override
	public void atualizar(Endereco end) throws EnderecoNaoExistenteException {
		this.pesquisar(end.getCodigo());
		em.merge(end);
	}

	@Override
	public void deletar(int id) throws EnderecoNaoExistenteException {
		Endereco end = this.pesquisar(id);
		em.remove(end);
	}
	
	public void commit() throws CommitException {
		try {
			em.getTransaction().begin();
			em.getTransaction().commit();
			
		}catch(Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
			throw new CommitException(e.getMessage());
		}
	}


	@Override
	public void close() throws Exception {
		em.close();
	}
}
