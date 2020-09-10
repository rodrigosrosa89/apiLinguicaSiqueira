package br.com.rodrigorosa.linguicasiqueira.modelo;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Venda {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String valor;
	
	@ManyToOne
	private Linguica linguica;
	private LocalDateTime dataDaVenda;
	
	@ManyToOne
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
