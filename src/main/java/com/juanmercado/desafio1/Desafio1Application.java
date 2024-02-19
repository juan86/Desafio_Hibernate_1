package com.juanmercado.desafio1;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.juanmercado.desafio1.dao.IPersonaRepository;
import com.juanmercado.desafio1.dao.ITelefonoRepository;
import com.juanmercado.desafio1.entities.Persona;
import com.juanmercado.desafio1.entities.Telefono;

@SpringBootApplication
public class Desafio1Application implements CommandLineRunner{
	
	@Autowired
	private IPersonaRepository personaRepository;

	// @Autowired
	// private ITelefonoRepository telefonoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Persona persona1 = new Persona("Juan", "Mercado", 36);
		Persona persona2 = new Persona("Pedro", "Apellido", 33);


		Telefono motorola = new Telefono("Motorola", "Moto E13", 12345678);
		Telefono motorola2 = new Telefono("Motorola", "Moto E13", 87654321);
		Telefono samsung = new Telefono("Samsung", "FE20", 98765432 );
		Telefono xiaomi = new Telefono("Xiaomi", "Redmi 13C", 123789456);
		Telefono xiaomi2 = new Telefono("Xiaomi", "Redmi 13C", 123789123);


		persona1.setTelefonos(Arrays.asList(motorola, samsung, xiaomi));
		persona2.setTelefonos(Arrays.asList(motorola2, xiaomi2));

		personaRepository.save(persona1);
		personaRepository.save(persona2);

	}

}
