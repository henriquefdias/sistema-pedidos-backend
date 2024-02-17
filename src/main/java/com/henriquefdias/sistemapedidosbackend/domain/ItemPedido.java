package com.henriquefdias.sistemapedidosbackend.domain;

public class ItemPedido {
	
	private ItemPedidoPK id = new ItemPedidoPK();
	
	private Double desconto;
	private Integer quantidade;
	private Double preco;
	
	public ItemPedido() {
		
	}

	public ItemPedido(ItemPedidoPK id, Double desconto, Integer quantidade, Double preco) {
		super();
		this.id = id;
		this.desconto = desconto;
		this.quantidade = quantidade;
		this.preco = preco;
	}

}
