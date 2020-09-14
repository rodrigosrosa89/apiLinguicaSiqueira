package br.com.rodrigorosa.linguicasiqueira.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.rodrigorosa.linguicasiqueira.modelo.Linguica;

public interface LinguicaRepository extends JpaRepository<Linguica, Long>{

	List<Linguica> findByNome(String nomeLinguica);
	
	// Pode ser chamado simplesmente com findByCategoriaNome(), mas é importante saber que se usar o "_"
	// você indica pro Spring que é para pegar da entidade Categoria, o atributo Nome.
	List<Linguica> findByCategoria_Nome(String nomeCategoria);
	
	@Query("SELECT l FROM Linguica l WHERE l.categoria.nome = :nomeCategoria")
	List<Linguica> carregarPorNomeCategoria(@Param("nomeCategoria") String nomeCategoria);

}
