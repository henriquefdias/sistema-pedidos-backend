package com.henriquefdias.sistemapedidosbackend.domain;

import java.util.ArrayList;
import java.util.List;

public class Produto {
	
	private Integer id;
	private String nome;
	private Double preco;
	
	private List<Categoria> categorias = new ArrayList<>();

}
