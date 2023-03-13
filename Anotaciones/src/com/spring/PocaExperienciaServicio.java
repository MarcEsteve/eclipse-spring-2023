package com.spring;

import org.springframework.stereotype.Component;

@Component
public class PocaExperienciaServicio implements ExperienciaServicio {
	public int getExperiencia() {
		return 3;
	}
}
