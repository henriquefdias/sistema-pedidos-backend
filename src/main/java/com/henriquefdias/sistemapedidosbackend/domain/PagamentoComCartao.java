package com.henriquefdias.sistemapedidosbackend.domain;

import com.henriquefdias.sistemapedidosbackend.domain.enums.EstadoPagamento;

public class PagamentoComCartao extends Pagamento {
	
	private Integer numeroDeParcelas;
	
	public PagamentoComCartao() {
		
	}

	public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido) {
		super(id, estado, pedido);
		// TODO Auto-generated constructor stub
	}

}
