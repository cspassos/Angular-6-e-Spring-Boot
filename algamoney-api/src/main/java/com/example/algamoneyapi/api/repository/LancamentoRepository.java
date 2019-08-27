package com.example.algamoneyapi.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.algamoneyapi.api.model.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

	@Query("select l from Lancamento l"
			+ " where l.codigo = :codigo")
	Lancamento findOne(@Param("codigo") Long codigo);
}
