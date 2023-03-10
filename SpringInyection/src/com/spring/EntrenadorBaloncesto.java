package com.spring;

public class EntrenadorBaloncesto implements Entrenador {

	private ExperienciaServicio experienciaServicio; 
	@Override
	public String getEntrenamiento() { 
		return "Lanzar 30 tiros a canasta";
	}
	@Override
	public int getExperiencia() {
		return experienciaServicio.getExperiencia();
	}
	// inyección del servicio en un método setter
	public void setExperienciaServicio(ExperienciaServicio experienciaServicio) { 
		System.out.println("Inyección en un método setter"); 
		this.experienciaServicio = experienciaServicio;
	}
	
}
