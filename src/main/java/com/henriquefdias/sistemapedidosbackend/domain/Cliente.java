package com.henriquefdias.sistemapedidosbackend.domain;

import com.henriquefdias.sistemapedidosbackend.domain.enums.TipoCliente;

public class Cliente {
	
	private Integer id;
	private String nome;
	private String email;
	private String cpfOuCnpj;
	private TipoCliente tipo;

}
