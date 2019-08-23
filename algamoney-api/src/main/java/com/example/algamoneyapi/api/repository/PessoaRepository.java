package com.example.algamoneyapi.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.algamoneyapi.api.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
