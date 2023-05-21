package com.diego.Enrutamiento2.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	
	
	@RequestMapping("/{dojo}")
	public String dojos(@PathVariable("dojo")String texto) {
		System.out.println(texto);
		if(texto.contains("dojo")) {
			return "¡El dojo es increible!";
		}else if (texto.contains("burbank-dojo")) {
			return "El Dojo Burbank está localizado al sur de California";
		}else if(texto.contains("san-jose")) {
			return "El Dojo SJ es el cuartel general";
		}else {
			return "Ingresa algo válido";
		}
	}
}
