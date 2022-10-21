package com.henriquefdias.sistemapedidosbackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.henriquefdias.sistemapedidosbackend.domain.Categoria;
import com.henriquefdias.sistemapedidosbackend.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Categoria obj = repo.findOne(id);
	}
	
}
