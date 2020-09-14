package br.com.rodrigorosa.linguicasiqueira.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rodrigorosa.linguicasiqueira.controller.dto.LinguicaDto;
import br.com.rodrigorosa.linguicasiqueira.modelo.Linguica;
import br.com.rodrigorosa.linguicasiqueira.repository.LinguicaRepository;

@RestController
public class LinguicasController {
	
	@Autowired
	LinguicaRepository linguicaRepository; 

	@RequestMapping("/linguicas")
	public List<LinguicaDto> lista(String nome) {
		List<Linguica> linguicas = new ArrayList<>();
		if (nome == null) {
			linguicas = linguicaRepository.findAll();
		} else {
			linguicas = linguicaRepository.carregarPorNomeCategoria(nome);
		}
		
		System.out.println(linguicas.size());

		return LinguicaDto.converter(linguicas);
	}

}
