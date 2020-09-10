package br.com.rodrigorosa.linguicasiqueira.modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Linguica {

	private long id;
	private String nomeProduto;
	private LocalDateTime dataFabricacao = LocalDateTime.now();
	private StatusLinguicaEnum status = StatusLinguicaEnum.AGUARDANDO_PEDIDO;
	private Cliente cliente;
	private Categoria categoria;
	private List<Venda> vendas = new ArrayList<>();

	public Linguica(String nomeProduto, Cliente cliente, Categoria categoria) {
		this.nomeProduto = nomeProduto;
		this.cliente = cliente;
		this.categoria = categoria;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
		result = prime * result + ((dataFabricacao == null) ? 0 : dataFabricacao.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((nomeProduto == null) ? 0 : nomeProduto.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((vendas == null) ? 0 : vendas.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Linguica other = (Linguica) obj;
		if (categoria == null) {
			if (other.categoria != null)
				return false;
		} else if (!categoria.equals(other.categoria))
			return false;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (dataFabricacao == null) {
			if (other.dataFabricacao != null)
				return false;
		} else if (!dataFabricacao.equals(other.dataFabricacao))
			return false;
		if (id != other.id)
			return false;
		if (nomeProduto == null) {
			if (other.nomeProduto != null)
				return false;
		} else if (!nomeProduto.equals(other.nomeProduto))
			return false;
		if (status != other.status)
			return false;
		if (vendas == null) {
			if (other.vendas != null)
				return false;
		} else if (!vendas.equals(other.vendas))
			return false;
		return true;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public LocalDateTime getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(LocalDateTime dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	public StatusLinguicaEnum getStatus() {
		return status;
	}

	public void setStatus(StatusLinguicaEnum status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public List<Venda> getVendas() {
		return vendas;
	}

	public void setVendas(List<Venda> vendas) {
		this.vendas = vendas;
	}

}
