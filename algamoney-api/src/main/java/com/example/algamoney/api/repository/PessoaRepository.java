package com.example.algamoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.algamoney.api.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

	@Query("select p from Pessoa p"
			+ " where p.codigo = :codigo")
	Pessoa findOne(@Param("codigo") Long codigo);
}
