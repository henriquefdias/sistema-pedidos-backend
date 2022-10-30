package com.henriquefdias.sistemapedidosbackend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.henriquefdias.sistemapedidosbackend.domain.Categoria;

@SpringBootApplication
public class SistemaPedidosBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SistemaPedidosBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");
		
	}

}
