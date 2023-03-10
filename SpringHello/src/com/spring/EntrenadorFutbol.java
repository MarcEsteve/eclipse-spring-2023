package com.spring;

import org.springframework.stereotype.Component;

//Anotation @Component genera un bean llamado "entrenadorFutbol"
@Component
public class EntrenadorFutbol implements Entrenador {
	public String getEntrenamiento() {
		return "Correr durante 30 minutos";
	}
}
