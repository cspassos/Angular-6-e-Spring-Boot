package com.example.algamoneyapi.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.algamoneyapi.api.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	@Query("select c from Categoria c"
			+ " where c.codigo = :codigo")
	Categoria findOne(@Param("codigo") Long codigo);
}
