package com.algaworks.cobranca.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TituloController {

	@RequestMapping("/titulo/cadastro")
	public String titulo() {
		return "CadastroTitulo";
	}
}
