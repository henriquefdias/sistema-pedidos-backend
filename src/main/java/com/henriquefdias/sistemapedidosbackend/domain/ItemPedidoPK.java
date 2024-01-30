package com.henriquefdias.sistemapedidosbackend.domain;

import java.io.Serializable;

public class ItemPedidoPK implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Pedido pedido;
	private Produto produto;
}
