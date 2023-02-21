package com.henriquefdias.sistemapedidosbackend.domain;

import java.util.ArrayList;
import java.util.List;

import com.henriquefdias.sistemapedidosbackend.domain.enums.TipoCliente;

public class Cliente {
	
	private Integer id;
	private String nome;
	private String email;
	private String cpfOuCnpj;
	private TipoCliente tipo;
	
	private List<Endereco> enderecos = new ArrayList<>();

}
