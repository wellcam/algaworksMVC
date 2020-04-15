package com.algaworks.cobranca.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.algaworks.cobranca.model.Titulo;

@Controller
@RequestMapping("/titulo")
public class TituloController {

	@GetMapping("/novo")
	public String titulo() {
		return "CadastroTitulo";
	}
	
	@PostMapping
	public String salvar(Titulo titulo) {
		
		System.out.println("OK");
		
		return "CadastroTitulo";
	}
}
