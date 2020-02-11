package br.com.fiap.teste;

import br.com.fiap.anotacao.Tabela;
import br.com.fiap.bean.Aluno;

public class TesteAluno {

	public static void main(String[] args) {
		Aluno a = new Aluno();
		
		
		Tabela tabela = a.getClass().getAnnotation(Tabela.class);
		System.out.println("SELECT * FROM " + tabela.nome());

	}

}
