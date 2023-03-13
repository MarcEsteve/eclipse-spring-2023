package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//la clase se convierte en un bean 
@Component
public class EntrenadorTennis implements Entrenador {

	private ExperienciaServicio experienciaServicio;
	// constructor con el servicio inyectado 
	@Autowired
	public EntrenadorTennis(ExperienciaServicio experienciaServicio) { 
		System.out.println("Inyección en el constructor"); 
		this.experienciaServicio = experienciaServicio;
	}
	public int getExperiencia() {
		return this.experienciaServicio.getExperiencia();
	}

}
