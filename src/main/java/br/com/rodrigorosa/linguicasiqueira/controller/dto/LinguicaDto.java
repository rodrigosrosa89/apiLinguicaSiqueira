package br.com.rodrigorosa.linguicasiqueira.controller.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import br.com.rodrigorosa.linguicasiqueira.modelo.Linguica;

public class LinguicaDto {

	private long id;
	private String nomeProduto;
	private LocalDateTime dataFabricacao;

	public LinguicaDto(Linguica linguica) {
		this.id = linguica.getId();
		this.nomeProduto = linguica.getNomeProduto();
		this.dataFabricacao = linguica.getDataFabricacao();

	}

	public long getId() {
		return id;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public LocalDateTime getDataFabricacao() {
		return dataFabricacao;
	}

	public static List<LinguicaDto> converter(List<Linguica> linguicas) {
		return linguicas.stream().map(LinguicaDto::new).collect(Collectors.toList());
	}

}
