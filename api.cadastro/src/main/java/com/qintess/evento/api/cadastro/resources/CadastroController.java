package com.qintess.evento.api.cadastro.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qintess.evento.api.cadastro.models.CadastroCliente;
import com.qintess.evento.api.cadastro.repository.CadastroRepository;

@RestController
@RequestMapping(value="/api")
public class CadastroController {

	@Autowired
	CadastroRepository cadastroRepository;
	
	@GetMapping("/cadastrocliente")
	public List<CadastroCliente> ListaCliente(){
		return cadastroRepository.findAll();
		
	}
}
