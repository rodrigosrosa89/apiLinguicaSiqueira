package br.com.rodrigorosa.linguicasiqueira.controller;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.rodrigorosa.linguicasiqueira.controller.dto.LinguicaDto;
import br.com.rodrigorosa.linguicasiqueira.controller.form.LinguicaForm;
import br.com.rodrigorosa.linguicasiqueira.modelo.Linguica;
import br.com.rodrigorosa.linguicasiqueira.repository.CategoriaRepository;
import br.com.rodrigorosa.linguicasiqueira.repository.LinguicaRepository;

@RestController
public class LinguicasController {
	
	@Autowired
	LinguicaRepository linguicaRepository; 
	
	@Autowired
	CategoriaRepository categoriaRepository; 


	@GetMapping("/linguicas")
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
	
	@PostMapping("/linguicas")
	public ResponseEntity<LinguicaDto> cadastrar(@RequestBody LinguicaForm form, UriComponentsBuilder uriBuilder) {
		Linguica linguica = form.converter(categoriaRepository);
		linguicaRepository.save(linguica);
		
		URI uri = uriBuilder.path("/topicos/{id}").buildAndExpand(linguica.getId()).toUri();
		return ResponseEntity.created(uri).body(new LinguicaDto(linguica));
	}

}
