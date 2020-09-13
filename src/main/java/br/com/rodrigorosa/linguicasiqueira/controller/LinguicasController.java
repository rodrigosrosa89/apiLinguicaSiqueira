package br.com.rodrigorosa.linguicasiqueira.controller;

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
	public List<LinguicaDto> lista() {
		List<Linguica> linguicas = linguicaRepository.findAll();

		return LinguicaDto.converter(linguicas);
	}

}
