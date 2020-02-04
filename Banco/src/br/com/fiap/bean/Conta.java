package br.com.fiap.bean;

import java.util.Calendar;

public abstract class Conta {

	private int agencia;
	private int numero;
	private Calendar dataAbertura;
	private double saldo;
	
	public abstract double depositar (double valor);
	
	public abstract double retirar (double retirar) throws Exception;

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Calendar getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Calendar dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
}
