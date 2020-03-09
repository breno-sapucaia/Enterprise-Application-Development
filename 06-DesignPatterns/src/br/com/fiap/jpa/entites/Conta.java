package br.com.fiap.jpa.entites;

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

import br.com.fiap.jpa.enums.TipoConta;

@Entity
@Table(name="TB_CONTA")
@SequenceGenerator(allocationSize = 30,initialValue = 1,sequenceName = "conta_seq",name = "conta_seq")
public class Conta {

	@Id
	@Column(name="cd_conta", nullable = false)
	@GeneratedValue(generator = "conta_seq",strategy = GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="nr_agencia",nullable = false)
	private int agencia;
	
	@Column(name="vl_saldo")
	private float saldo;
	
	@Enumerated(EnumType.STRING)
	@Column(name="ds_tipo")
	private TipoConta tipoconta;
	
	@Column(name = "dt_abertura")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar abertura;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public TipoConta getTipoconta() {
		return tipoconta;
	}

	public void setTipoconta(TipoConta tipoconta) {
		this.tipoconta = tipoconta;
	}

	public Calendar getAbertura() {
		return abertura;
	}

	public void setAbertura(Calendar abertura) {
		this.abertura = abertura;
	}

	public Conta() {
		super();
	}
	
}
