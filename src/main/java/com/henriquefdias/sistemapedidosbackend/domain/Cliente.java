package com.henriquefdias.sistemapedidosbackend.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.henriquefdias.sistemapedidosbackend.domain.enums.TipoCliente;

public class Cliente {
	
	private Integer id;
	private String nome;
	private String email;
	private String cpfOuCnpj;
	private TipoCliente tipo;
	
	private List<Endereco> enderecos = new ArrayList<>();
	
	private Set<String> telefones = new HashSet<>();

}
