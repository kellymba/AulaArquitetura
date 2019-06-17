package com.editora.editora.entity;

import java.sql.Date;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="atividade")
public class Atividade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_atividade;
	
	@Column(name="status")
	private String status;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="fornecedores")
	private ArrayList<Fornecedor> fornecedores;
	
	@Column(name="prazo_fornecedor")
	private Date prazo_fornecedor;
	
	@Column(name="prazo_atividade")
	private Date prazo_atividade;
	
	@Column(name="inicio_atividade")
	private Date inicio_atividade;
	
	@Column(name="fim_atividade")
	private Date fim_atividade;
	
	@Column(name="inicio_real_atividade")
	private Date inicio_real_atividade;
	
	@Column(name="fim_real_atividade")
	private Date fim_real_atividade;
	
	
	public int getId_atividade() {
		return id_atividade;
	}

	public void setId_atividade(int id_atividade) {
		this.id_atividade = id_atividade;
	}

	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public ArrayList<Fornecedor> getFornecedores() {
		return fornecedores;
	}



	public void setFornecedores(ArrayList<Fornecedor> fornecedores) {
		this.fornecedores = fornecedores;
	}



	public Date getPrazo_fornecedor() {
		return prazo_fornecedor;
	}



	public void setPrazo_fornecedor(Date prazo_fornecedor) {
		this.prazo_fornecedor = prazo_fornecedor;
	}



	public Date getPrazo_atividade() {
		return prazo_atividade;
	}



	public void setPrazo_atividade(Date prazo_atividade) {
		this.prazo_atividade = prazo_atividade;
	}



	public Date getInicio_atividade() {
		return inicio_atividade;
	}



	public void setInicio_atividade(Date inicio_atividade) {
		this.inicio_atividade = inicio_atividade;
	}



	public Date getFim_atividade() {
		return fim_atividade;
	}



	public void setFim_atividade(Date fim_atividade) {
		this.fim_atividade = fim_atividade;
	}



	public Date getInicio_real_atividade() {
		return inicio_real_atividade;
	}



	public void setInicio_real_atividade(Date inicio_real_atividade) {
		this.inicio_real_atividade = inicio_real_atividade;
	}



	public Date getFim_real_atividade() {
		return fim_real_atividade;
	}



	public void setFim_real_atividade(Date fim_real_atividade) {
		this.fim_real_atividade = fim_real_atividade;
	}



	public void informarStatusAtividade() {
		
	}

}
