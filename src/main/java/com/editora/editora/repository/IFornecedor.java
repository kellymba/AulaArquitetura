package com.editora.editora.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.editora.editora.entity.Fornecedor;

public interface IFornecedor extends JpaRepository<Fornecedor, String> {

}
