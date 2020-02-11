package br.com.fiap.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="TB_PRODUTO")
@SequenceGenerator(name= "produto", sequenceName = "SQ_TB_PRODUTO",allocationSize = 1)
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produto")
	@Column(name = "CD_PRODUTO")
	private int codigo;
	
	@Column(name = "NM_PRODUTO", nullable=false)
	private String nome;
	
	@Column(name = "VL_PRODUTO")
	private double valor;
	
	@Transient
	private double valorLiquido;
}
