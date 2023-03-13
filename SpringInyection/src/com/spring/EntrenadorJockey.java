package com.spring;

public class EntrenadorJockey implements Entrenador {

	protected String email, equipo, jugadores;
	
	private ExperienciaServicio experienciaServicio;
	 
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		System.out.println("Inyección de un literal en un método setter: " 
				+ email); 
		this.email = email;
	}
	public String getEquipo() { 
		return equipo;
	}
	public void setEquipo(String equipo) {
		System.out.println("Inyección de un literal en un método setter: " 
				+ equipo); 
		this.equipo = equipo;
	}
	@Override
	public String getEntrenamiento() {
		// TODO Auto-generated method stub
		return "Golpear 30 bolas con el stick";
	}
	@Override
	public int getExperiencia() {
		// TODO Auto-generated method stub
		return experienciaServicio.getExperiencia();
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
