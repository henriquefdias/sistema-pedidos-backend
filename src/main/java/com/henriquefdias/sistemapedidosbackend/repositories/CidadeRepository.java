package com.henriquefdias.sistemapedidosbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.henriquefdias.sistemapedidosbackend.domain.Categoria;

@Repository
public interface CidadeRepository extends JpaRepository<Categoria, Integer>{
	
	

}
