package com.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configuracion {
	
	// el id del bean es experienciaServicio 
	@Bean
	public ExperienciaServicio experienciaServicio() {
		ExperienciaServicio experienciaServicio = new PocaExperienciaServicio(); 
		return experienciaServicio;
	}
	// el id del bean es entrenadorBaloncesto 
	@Bean
	public Entrenador entrenadorBaloncesto() {
	// se inyecta la dependencia experienciaServicio al bean entrenadorBaloncesto 
		Entrenador entrenador = new EntrenadorBaloncesto(experienciaServicio()); 
		return entrenador;
	}
}
