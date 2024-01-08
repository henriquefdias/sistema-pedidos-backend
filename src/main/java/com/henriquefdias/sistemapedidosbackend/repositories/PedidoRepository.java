package com.henriquefdias.sistemapedidosbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.henriquefdias.sistemapedidosbackend.domain.Categoria;
import com.henriquefdias.sistemapedidosbackend.domain.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer>{
	
	

}
