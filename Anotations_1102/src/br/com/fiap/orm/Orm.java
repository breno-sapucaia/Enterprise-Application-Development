package br.com.fiap.orm;

import br.com.fiap.anotacao.Tabela;

public class Orm {
	public String gerarSql(Object o) {
		//recuperar a anotação @Tabela da classe
		Tabela tabela = o.getClass().getAnnotation(Tabela.class);
		//Retornar o SQL de select
		return "SELECT * FROM " + tabela.nome();
		
		
	}
}
