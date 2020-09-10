package br.com.rodrigorosa.linguicasiqueira.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rodrigorosa.linguicasiqueira.controller.dto.LinguicaDto;
import br.com.rodrigorosa.linguicasiqueira.modelo.Categoria;
import br.com.rodrigorosa.linguicasiqueira.modelo.Cliente;
import br.com.rodrigorosa.linguicasiqueira.modelo.Linguica;

@RestController
public class LinguicasController {

	@RequestMapping("/linguicas")
	public List<LinguicaDto> lista() {
		Linguica linguica = new Linguica("Linguiça de porco apimentada",
				new Cliente("Fulano", "fulano@hotmail.com", "31999999999"), new Categoria("Porco"));

		return LinguicaDto.converter(Arrays.asList(linguica, linguica, linguica));
	}

}
