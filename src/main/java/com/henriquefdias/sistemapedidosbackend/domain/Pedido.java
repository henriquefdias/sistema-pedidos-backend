package com.henriquefdias.sistemapedidosbackend.domain;

import java.util.Date;

public class Pedido {

	private Integer id;
	private Date instante;
	
	private Pagamento pagamento;
	
	private Cliente cliente;
	
	private Endereco enderecoDeEntrega;
}
