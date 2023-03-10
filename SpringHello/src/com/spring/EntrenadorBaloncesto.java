package com.spring;

import org.springframework.stereotype.Component;

//Anotation @Component genera un bean llamado "entrenadorBaloncesto"
@Component
public class EntrenadorBaloncesto implements Entrenador {

	@Override
	public String getEntrenamiento() {
		return "Lanzar 30 tiros a canasta";
	}
	
}
