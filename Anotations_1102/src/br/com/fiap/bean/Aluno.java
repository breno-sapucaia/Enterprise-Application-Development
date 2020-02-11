package br.com.fiap.bean;

import br.com.fiap.anotacao.Coluna;
import br.com.fiap.anotacao.Tabela;

@Tabela(nome="TAB_ALUNO")
public class Aluno {
	@Coluna(nome="NM_ALUNO")
	private String nome;
}
