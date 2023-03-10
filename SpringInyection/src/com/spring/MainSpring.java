package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {

	public static void main(String[] args) {
		// abre el contexto a partir del archivo de configuración 
		ClassPathXmlApplicationContext context =
		new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// obtener el bean
		Entrenador entrenador = context.getBean("mientrenador", Entrenador.class); 
		System.out.println(entrenador.getExperiencia());
		
		// cierra el context
		context.close();
	}

}
