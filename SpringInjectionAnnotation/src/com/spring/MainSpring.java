package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
				
		// obtener el bean por constructor
		Entrenador entrenador = context.getBean("entrenadorTennis", 
				Entrenador.class); 
		System.out.println(entrenador.getExperiencia());
		
		context.close();
		
	}

}
