package com.henriquefdias.sistemapedidosbackend.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.henriquefdias.sistemapedidosbackend.domain.Categoria;
import com.henriquefdias.sistemapedidosbackend.repositories.CategoriaRepository;

@Service
public class ClienteService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new com.henriquefdias.sistemapedidosbackend.services.exceptions.ObjectNotFoundException("Objeto não encontrado! ID: " + id + ", Tipo: " + Categoria.class.getName()));
	}
	
}
