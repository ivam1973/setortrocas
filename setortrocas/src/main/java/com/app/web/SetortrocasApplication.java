package com.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.web.entidade.Fornecedor;
import com.app.web.repositorio.FornecedorRepositorio;

@SpringBootApplication
public class SetortrocasApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SetortrocasApplication.class, args);
	}
	
	@Autowired
	private FornecedorRepositorio repositorio;
	
	@Override
	public void run(String... args) throws Exception {
		/*Fornecedor fornecedor1 = new Fornecedor("Ivam", "FLV","segunda-feira"); 
		repositorio.save(fornecedor1);
		
		Fornecedor fornecedor2 = new Fornecedor("Mary", "Mercearia","sexta-feira"); 
		repositorio.save(fornecedor2);*/
	}

}
