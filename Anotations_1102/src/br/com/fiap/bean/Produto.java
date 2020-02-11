
package br.com.fiap.bean;

import br.com.fiap.anotacao.Coluna;

public class Produto {
	@Coluna(nome = "CD_PRODUTO", chave = true)
	private int codigo;
	@Coluna(nome = "VL_PRODUTO")
	private double valor;
	@Coluna(nome = "NM_PRODUTO")
	private String nome;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
