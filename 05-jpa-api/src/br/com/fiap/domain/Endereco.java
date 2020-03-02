package br.com.fiap.domain;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "TB_ENDERECO")
@SequenceGenerator(name = "end", sequenceName = "SQ_TB_ENDERECO", allocationSize = 1)
public class Endereco {
	public Endereco() {};
	public Endereco(int codigo, String cep, String logradouro, Tipo tipo, Calendar cadastro) {
		this.codigo = codigo;
		this.cep = cep;
		this.logradouro = logradouro;
		this.tipo = tipo;
		this.cadastro = cadastro;
	}
	@Id
	@Column(name = "cd_endereco")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "end")
	private int codigo;

	@Column(name = "nr_cep", length = 8, nullable = false)
	private String cep;

	@Column(name = "ds_logradouro", length = 50, nullable = false)
	private String logradouro;

	@Column(name = "ds_tipo")
	@Enumerated(EnumType.STRING)
	private Tipo tipo;

	@Column(name = "dt_cadastro")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar cadastro;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Calendar getCadastro() {
		return cadastro;

	}

	public void setCadastro(Calendar cadastro) {
		this.cadastro = cadastro;
	}

	public Endereco(String cep, String logradouro, Tipo tipo, Calendar cadastro) {
		super();
		this.cep = cep;
		this.logradouro = logradouro;
		this.tipo = tipo;
		this.cadastro = cadastro;
	}

	public Endereco(Builder builder) {
		this.codigo = builder.codigo;
		this.cep = builder.cep;
		this.logradouro = builder.logradouro;
		this.tipo = builder.tipo;
		this.cadastro = builder.cadastro;
	}

	public static class Builder {
		private int codigo;
		private String cep;
		private Tipo tipo;
		private String logradouro;
		private Calendar cadastro;

		public Builder setCadastro(Calendar cadastro) {
			this.cadastro = cadastro;
			return this;
		}

		public Builder codigo(int codigo) {
			this.codigo = codigo;
			return this;
		}

		public Builder cep(String cep) {
			this.cep = cep;
			return this;
		}

		public Builder tipo(Tipo tipo) {
			this.tipo = tipo;
			return this;
		}

		public Builder logradouro(String logradouro) {
			this.logradouro = logradouro;
			return this;
		}
		
		public Endereco build() {
			return new Endereco(this);
		}
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Enderco: "+ this.tipo + " " + this.logradouro + " -  " + this.cep;
	}

}
