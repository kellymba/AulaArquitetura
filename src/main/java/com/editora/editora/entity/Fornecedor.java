package com.editora.editora.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fornecedor")
public class Fornecedor extends Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int fornecedor_id; 
	
	@Column(name="especialidade")
	private String especialidade;
	
	public int getFornecedor_id() {
		return fornecedor_id;
	}

	public void setFornecedor_id(int fornecedor_id) {
		this.fornecedor_id = fornecedor_id;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public void informarStatus() {
		
	}
	
}

