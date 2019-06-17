package com.editora.editora.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="coordenador")

public class Coordenador extends Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int coordenador_id;
	
	
	@Column(name="setor")
	private String setor;
	
	public int getCoordenador_id() {
		return coordenador_id;
	}

	public void setCoordenador_id(int coordenador_id) {
		this.coordenador_id = coordenador_id;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public void coordenarProjetos() {
		
	}
	
	public void coordenarFornecedores() {
		
	}
	
	public void manterPrazos() {
		
	}
	
}
