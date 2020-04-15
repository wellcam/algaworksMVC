package com.algaworks.cobranca.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.algaworks.cobranca.model.Titulo;
import com.algaworks.cobranca.repository.TituloRepository;

@Controller
@RequestMapping("/titulo")
public class TituloController {
	
	@Autowired
	private TituloRepository tituloRepository; 

	@GetMapping("/novo")
	public String titulo() {
		return "CadastroTitulo";
	}
	
	@PostMapping
	public String salvar(Titulo titulo) {
		
		tituloRepository.save(titulo);
		
		return "CadastroTitulo";
	}
}
