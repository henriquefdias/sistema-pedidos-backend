package com.henriquefdias.sistemapedidosbackend.domain;

import com.henriquefdias.sistemapedidosbackend.domain.enums.EstadoPagamento;

public class PagamentoComCartao extends Pagamento {
	
	private Integer numeroDeParcelas;
	
	public PagamentoComCartao() {
		
	}

	public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer numeroDeParcelas) {
		super(id, estado, pedido);
		this.numeroDeParcelas = numeroDeParcelas;
	}

}
