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
		
		// obtener el bean
		Entrenador entrenador3 = context.getBean("mientrenador3", 
				Entrenador.class); 
		System.out.println(entrenador3.getEmail());
		System.out.println(entrenador3.getEquipo()); 
		
		// obtener el bean por datos properties
				Entrenador entrenador4 = context.getBean("mientrenador4", 
						Entrenador.class); 
				System.out.println(entrenador4.getEmail());
				System.out.println(entrenador4.getEquipo());
				System.out.println(entrenador4.getJugadores());  
		
		// cierra el context
		context.close();
	}

}
