package br.com.fiap.teste;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.domain.Endereco;
import br.com.fiap.domain.Tipo;
import br.com.fiap.domain.exceptions.CommitException;
import br.com.fiap.domain.exceptions.EnderecoNaoExistenteException;
import br.com.fiap.repository.dao.EnderecoDAO;

public class Teste {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("oracle");
		EntityManager em = emf.createEntityManager();
		
		EnderecoDAO dao = new EnderecoDAO(em);
		Endereco end =  new Endereco.Builder()
							.cep("06180000")
							.logradouro("Fidencio Ramos")
							.tipo(Tipo.RUA)
							.build();
		
		try {
			dao.cadastrar(end);
			dao.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		try {
			end = dao.pesquisar(6);
			System.out.println(end);
		} catch (EnderecoNaoExistenteException e) {
			e.printStackTrace();
		}
		
		
		try {
			end.setLogradouro("Rua inexistente");
			dao.atualizar(end);
			dao.commit();
			System.out.println("Atualizando ....");
		}catch(EnderecoNaoExistenteException | CommitException e) {
			e.printStackTrace();
		}
		
		try {
			dao.deletar(10);
			dao.commit();
			System.out.println("Deletando ....");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		try {
			dao.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		em.close();
		emf.close();
		
	}
}
