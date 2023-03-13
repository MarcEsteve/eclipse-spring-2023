package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainSpring {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new
				AnnotationConfigApplicationContext(Configuracion.class);
		Entrenador entrenador = context.getBean("entrenadorBaloncesto", 
				Entrenador.class); 
		System.out.println(entrenador.getExperiencia());
		context.close();
		
	}
}
