package com.injection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainSpring {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new
		AnnotationConfigApplicationContext(Configuracion.class);
		// el id del bean es el nombre del método declarado en el archivo de 
		// configuración Java
		Entrenador entrenador = context.getBean("entrenadorBaloncesto", Entrenador.class); 
		System.out.println(entrenador.getExperiencia());
		context.close();
		
	}
}
