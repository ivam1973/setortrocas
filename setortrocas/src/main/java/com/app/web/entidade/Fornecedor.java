package com.app.web.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fornecedores2")
public class Fornecedor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nome_fornecedor", nullable = false)
	private String nome_fornecedor;
	
	@Column(name = "segmento_fornecedor", nullable = true)
	private String segmento_fornecedor;
	
	@Column(name = "dia_da_visita_fornecedor", nullable = true)
	private String dia_da_visita_fornecedor;
	
	public Fornecedor() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome_fornecedor() {
		return nome_fornecedor;
	}

	public void setNome_fornecedor(String nome_fornecedor) {
		this.nome_fornecedor = nome_fornecedor;
	}

	public String getSegmento_fornecedor() {
		return segmento_fornecedor;
	}

	public void setSegmento_fornecedor(String segmento_fornecedor) {
		this.segmento_fornecedor = segmento_fornecedor;
	}

	public String getDia_da_visita_fornecedor() {
		return dia_da_visita_fornecedor;
	}

	public void setDia_da_visita_fornecedor(String dia_da_visita_fornecedor) {
		this.dia_da_visita_fornecedor = dia_da_visita_fornecedor;
	}

	@Override
	public String toString() {
		return "Fornecedor [id=" + id + ", nome_fornecedor=" + nome_fornecedor + ", segmento_fornecedor="
				+ segmento_fornecedor + ", dia_da_visita_fornecedor=" + dia_da_visita_fornecedor + "]";
	}

	public Fornecedor(Long id, String nome_fornecedor, String segmento_fornecedor, String dia_da_visita_fornecedor) {
		super();
		this.id = id;
		this.nome_fornecedor = nome_fornecedor;
		this.segmento_fornecedor = segmento_fornecedor;
		this.dia_da_visita_fornecedor = dia_da_visita_fornecedor;
	}

	public Fornecedor(String nome_fornecedor, String segmento_fornecedor, String dia_da_visita_fornecedor) {
		super();
		this.nome_fornecedor = nome_fornecedor;
		this.segmento_fornecedor = segmento_fornecedor;
		this.dia_da_visita_fornecedor = dia_da_visita_fornecedor;
	}

	
	
	
}
