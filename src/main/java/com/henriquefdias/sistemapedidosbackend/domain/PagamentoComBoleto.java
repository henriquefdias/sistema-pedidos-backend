package com.henriquefdias.sistemapedidosbackend.domain;

import java.util.Date;

import com.henriquefdias.sistemapedidosbackend.domain.enums.EstadoPagamento;

public class PagamentoComBoleto extends Pagamento {
	
	private Date dataVencimento;
	private Date dataPagamento;

	public PagamentoComBoleto() {
	}

	public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido) {
		super(id, estado, pedido);
	}
}
