package br.com.rodrigorosa.linguicasiqueira.modelo;

import java.time.LocalDateTime;

public class Venda {

	private long id;
	private String valor;
	private Linguica linguica;
	private LocalDateTime dataDaVenda;
	private Cliente cliente;
	private boolean vendaRealizada = false;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public Linguica getLinguica() {
		return linguica;
	}

	public void setLinguica(Linguica linguica) {
		this.linguica = linguica;
	}

	public LocalDateTime getDataDaVenda() {
		return dataDaVenda;
	}

	public void setDataDaVenda(LocalDateTime dataDaVenda) {
		this.dataDaVenda = dataDaVenda;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public boolean isVendaRealizada() {
		return vendaRealizada;
	}

	public void setVendaRealizada(boolean vendaRealizada) {
		this.vendaRealizada = vendaRealizada;
	}

}
