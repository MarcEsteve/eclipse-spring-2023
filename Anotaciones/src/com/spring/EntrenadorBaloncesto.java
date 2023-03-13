package com.spring;

//no se establece la anotación @Component
public class EntrenadorBaloncesto implements Entrenador {

	private ExperienciaServicio experienciaServicio;
	public EntrenadorBaloncesto(ExperienciaServicio experienciaServicio) { 
		this.experienciaServicio = experienciaServicio;
	}
	@Override
	public int getExperiencia() {
		return experienciaServicio.getExperiencia();
	}
}
