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

import br.com.fiap.jpa.enums.TipoCargoColaborador;
@Entity
@Table(name="TB_COLABORADOR")
@SequenceGenerator(name = "colaborador_seq",allocationSize = 30,initialValue = 1,sequenceName ="colaborador_seq_2")
public class Colaborador {

	@Id
	@Column(name="cd_colaborador")
	@GeneratedValue(generator = "colaborador_seq",strategy = GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="nm_colaborador",nullable=false,length = 100)
	private String nome;
	
	@Column(name="ds_cargo")
	@Enumerated(EnumType.STRING)
	private TipoCargoColaborador cargo;
	
	@Column(name="dt_admissao")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar registroAdmissao;
	
	@Column(name="vl_salario")
	private float salario;
}
