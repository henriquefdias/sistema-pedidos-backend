package com.henriquefdias.sistemapedidosbackend.domain;

import com.henriquefdias.sistemapedidosbackend.domain.enums.EstadoPagamento;

public class Pagamento {
	
	private Integer id;
	private EstadoPagamento estado;

	private Pedido pedido;
}
