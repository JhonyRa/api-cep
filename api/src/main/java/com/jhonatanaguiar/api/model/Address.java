package com.jhonatanaguiar.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "ADDRESS")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "CEP")
	private String cep;
	
	@Column(name = "LOGRADOURO")
	private String logradouro;
	
	@Column(name = "COMPLEMENTO")
	private String complemento;
	
	@Column(name = "BAIRRO")
	private String bairro;
	
	@Column(name = "LOCALIDADE")
	private String localidade;
	
	@Column(name = "UF")
	private String uf;
	
	@Column(name = "UNIDADE")
	private String unidade;
	
	@Column(name = "IBGE")
	private String ibge;
	
	@Column(name = "GIA")
	private String gia;	
}
