package com.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//se carga el archivo de configuración, que se encuentra en la ruta 
//del classpath y su nombre es datos.properties
@PropertySource("classpath:datos.properties") 
public class Configuracion {
	//se inyecta el valor de la clave email del archivo properties en el 
	// atributo email 
	@Value("${email}")
	private String email;
	//se inyecta el valor de la clave equipo del archivo properties en el 
	// atributo equipo 
	@Value("${equipo}")
	private String equipo;
	@Bean
	public Entrenador entrenadorBaloncesto() {
		//los valores leídos desde el archivo properties son pasados 
		// al constructor de la clase 
		Entrenador entrenador = new EntrenadorBaloncesto(email, equipo);
		return entrenador;
	}
}