package br.com.fiap.domain.entities;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.fiap.domain.enums.Genero;

@Entity
@Table(name="T_MOTORISTA")
public class Motorista {
	@Id
	@Column(name="NR_CARTEIRA", nullable=false)
	private long carteira;
	
	@Column(name="NM_MOTORISTA", nullable=false)
	private String motorista;
	
	@Column(name="DT_NASCIMENTO")
	@Temporal(TemporalType.DATE)
	private Calendar nascimento;
	
	@Lob
	@Column(name="FL_CARTEIRA")
	private byte[] fotoCarteira;
	
	@Column(name="DS_GENERO")
	@Enumerated(EnumType.STRING)
	private Genero genero;
	
	
	
	public Motorista(long carteira, String motorista, Calendar nascimento, byte[] fotoCarteira, Genero genero) {
		super();
		this.carteira = carteira;
		this.motorista = motorista;
		this.nascimento = nascimento;
		this.fotoCarteira = fotoCarteira;
		this.genero = genero;
	}







	public long getCarteira() {
		return carteira;
	}







	public void setCarteira(long carteira) {
		this.carteira = carteira;
	}







	public String getMotorista() {
		return motorista;
	}







	public void setMotorista(String motorista) {
		this.motorista = motorista;
	}







	public Calendar getNascimento() {
		return nascimento;
	}







	public void setNascimento(Calendar nascimento) {
		this.nascimento = nascimento;
	}







	public byte[] getFotoCarteira() {
		return fotoCarteira;
	}







	public void setFotoCarteira(byte[] fotoCarteira) {
		this.fotoCarteira = fotoCarteira;
	}







	public Genero getGenero() {
		return genero;
	}







	public void setGenero(Genero genero) {
		this.genero = genero;
	}







	public Motorista() {
		// TODO Auto-generated constructor stub
	}

}
