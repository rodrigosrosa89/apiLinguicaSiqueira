package br.com.rodrigorosa.linguicasiqueira.controller.form;

import br.com.rodrigorosa.linguicasiqueira.modelo.Categoria;
import br.com.rodrigorosa.linguicasiqueira.modelo.Linguica;
import br.com.rodrigorosa.linguicasiqueira.repository.CategoriaRepository;

public class LinguicaForm {

	private String nome;
	private String nomeCategoria;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeCategoria() {
		return nomeCategoria;
	}

	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}

	public Linguica converter(CategoriaRepository categoriaRepository) {
		Categoria categoria = categoriaRepository.findByNome(nomeCategoria); 
		return new Linguica(nome, categoria);
	}
}
