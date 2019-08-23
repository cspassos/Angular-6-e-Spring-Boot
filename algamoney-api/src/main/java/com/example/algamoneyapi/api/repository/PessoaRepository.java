package com.example.algamoneyapi.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.algamoneyapi.api.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

	@Query("select p from Pessoa p"
			+ " where p.codigo = :codigo")
	Pessoa findOne(@Param("codigo") Long codigo);


}
//update User set count = count + ?2 where id = ?1