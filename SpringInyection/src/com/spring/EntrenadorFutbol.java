package com.spring;

public class EntrenadorFutbol implements Entrenador {
	
	protected String email, equipo;
	
	private ExperienciaServicio experienciaServicio;

	// constructor con el servicio inyectado
	public EntrenadorFutbol(ExperienciaServicio experienciaServicio) { 
		System.out.println("Inyección en el constructor"); 
		this.experienciaServicio = experienciaServicio;
	}
	@Override
	public String getEntrenamiento() { 
		return "Correr durante 30 minutos";
	}
	// implementación del método del servicio inyectado 
	@Override
	public int getExperiencia() {
		return experienciaServicio.getExperiencia();
	}
	@Override
	public String getEmail() {
		return email;
	}
	@Override
	public void setEmail(String email) {
		System.out.println("Inyección de un literal en un método setter: " 
				+ email); 
		this.email = email;
	}
	@Override
	public String getEquipo() {
		return equipo;
	}
	@Override
	public void setEquipo(String equipo) {
		System.out.println("Inyección de un literal en un método setter: " 
				+ equipo); 
		this.equipo = equipo;

	}
	@Override
	public int getJugadores() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void setJugadores(int jugadores) {
		// TODO Auto-generated method stub
		
	}
}
