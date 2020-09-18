package br.com.rodrigorosa.linguicasiqueira.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rodrigorosa.linguicasiqueira.modelo.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	public Categoria findByNome(String nome);


}
