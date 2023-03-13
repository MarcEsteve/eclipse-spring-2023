package com.demo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controlador {
	// http://localhost:8080/spring-demo-mcv/
	@RequestMapping("/")
	public String index() {
	// Nos devolverá el contenido de la plantilla index.jsp
		return "index";
	}
}
