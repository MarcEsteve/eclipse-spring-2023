package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {

	public static void main(String[] args) {
		// abre el contexto a partir del archivo de configuración 
		ClassPathXmlApplicationContext context =
		new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// obtener el bean por constructor
		Entrenador entrenador = context.getBean("mientrenador", Entrenador.class); 
		System.out.println(entrenador.getExperiencia());
		
		// obtener el bean por setter
		Entrenador entrenador2 = context.getBean("mientrenadorBaloncesto"
				, Entrenador.class); 
		System.out.println(entrenador2.getExperiencia());
		
		// cierra el context
		context.close();
	}

}
