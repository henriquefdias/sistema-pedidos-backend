package com.henriquefdias.sistemapedidosbackend.domain;

import java.util.ArrayList;
import java.util.List;

public class Estado {
	
	private Integer id;
	private String nome;
	
	private List<Cidade> cidades = new ArrayList<>();

	public Estado() {
		
	}

	public Estado(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
}
