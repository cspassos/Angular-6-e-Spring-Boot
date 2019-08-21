package com.example.algamoneyapi.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.algamoneyapi.api.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
