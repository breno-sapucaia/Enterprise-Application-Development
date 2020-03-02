package br.com.fiap.domain.interfaces.repository;

import br.com.fiap.domain.Endereco;
import br.com.fiap.domain.exceptions.CommitException;
import br.com.fiap.domain.exceptions.EnderecoNaoExistenteException;

public interface EnderecoRepository{
	
	void cadastrar(Endereco end);
	
	Endereco pesquisar(int id) throws EnderecoNaoExistenteException;
	
	void atualizar(Endereco end) throws EnderecoNaoExistenteException;
	
	void deletar(int id) throws EnderecoNaoExistenteException;
	
	void commit() throws CommitException;
	
}
