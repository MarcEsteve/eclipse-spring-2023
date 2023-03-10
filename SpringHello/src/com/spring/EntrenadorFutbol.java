package com.spring;

import org.springframework.stereotype.Component;

//mientrenador es el id del bean 
@Component
public class EntrenadorFutbol implements Entrenador {
	public String getEntrenamiento() {
		return "Correr durante 30 minutos";
	}
}
