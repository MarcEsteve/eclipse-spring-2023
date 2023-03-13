package com.injection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration 
@ComponentScan("com.spring")
public class Configuracion {
	// el id del bean será el nombre del método (entrenadorBaloncesto) 
	@Bean
	public Entrenador entrenadorTennis() {
	// el método crea un objeto de la clase EntrenadorBaloncesto y lo retorna 
		EntrenadorTennis entrenador = new EntrenadorTennis();
		return entrenador;
	}
}

/*
Esta clase de Java equivaldría al siguiente archivo de configuración XML:
<?xml version="1.0" encoding="UTF-8"?>
<beans ...>
<context:component-scan base-package="com.spring"/>
</beans>
*/