package br.com.fiap.domain.entities;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "T_VEICULO")
@SequenceGenerator(allocationSize = 50,initialValue = 1,sequenceName = "SQ_T_VEICULO",name = "vei")
public class Veiculo {
	@Id
	@Column(name="CD_VEICULO", nullable=false)
	@GeneratedValue(generator = "vei", strategy = GenerationType.SEQUENCE)
	private int codigo;
	@Column(name = "DS_PLACA", nullable=false, length=9)
	private String placa;
	@Column(name = "DS_COR", nullable = false, length=20)
	private String cor;
	@Column(name = "NR_ANO")
	private int ano;
	public Veiculo(int codigo, String placa, String cor, int ano) {
		super();
		this.codigo = codigo;
		this.placa = placa;
		this.cor = cor;
		this.ano = ano;
	}

	public Veiculo() {}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
}
