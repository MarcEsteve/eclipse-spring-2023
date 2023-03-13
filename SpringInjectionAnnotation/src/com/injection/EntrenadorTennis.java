package com.injection;

import org.springframework.stereotype.Component;

//la clase se convierte en un bean 
@Component
public class EntrenadorTennis implements Entrenador {

	private ExperienciaServicio experienciaServicio;
	
	public EntrenadorTennis(ExperienciaServicio experienciaServicio) { 
		this.experienciaServicio = experienciaServicio;
	}
	public EntrenadorTennis() {
		super();
	}
	@Override
	public int getExperiencia() {
	return experienciaServicio.getExperiencia();
	}
}
