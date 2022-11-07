package com.henriquefdias.sistemapedidosbackend.domain;

import java.util.ArrayList;
import java.util.List;

public class Produto {
	
	private Integer id;
	private String nome;
	private Double preco;
	
	private List<Categoria> categorias = new ArrayList<>();

	public Produto() {
		
	}

	public Produto(Integer id, String nome, Double preco) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}
	
}
