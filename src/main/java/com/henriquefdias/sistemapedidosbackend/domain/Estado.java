package com.henriquefdias.sistemapedidosbackend.domain;

import java.util.ArrayList;
import java.util.List;

public class Estado {
	
	private Integer id;
	private String nome;
	
	private List<Cidade> cidades = new ArrayList<>();

	public Estado() {
		
	}
}
