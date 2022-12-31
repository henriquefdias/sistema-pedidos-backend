package com.henriquefdias.sistemapedidosbackend.domain;

public class Cidade {

	private Integer id;
	private String nome;
	
	private Estado estado;
	
	public Cidade() {
		
	}

	public Cidade(Integer id, String nome, Estado estado) {
		super();
		this.id = id;
		this.nome = nome;
		this.estado = estado;
	}
	
}
