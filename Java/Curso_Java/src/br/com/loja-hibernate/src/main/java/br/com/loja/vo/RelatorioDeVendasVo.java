package br.com.loja.vo;

import java.time.LocalDate;

public class RelatorioDeVendasVo {
	
	private String nomeProduto;
	private Long quantiadeVendida;
	private LocalDate dataUltimaVenda;
	
	
	public RelatorioDeVendasVo(String nomeProduto, Long quantiadeVendida, LocalDate dataUltimaVenda) {
		super();
		this.nomeProduto = nomeProduto;
		this.quantiadeVendida = quantiadeVendida;
		this.dataUltimaVenda = dataUltimaVenda;
	}

	

	@Override
	public String toString() {
		return "RelatorioDeVendasVo [nomeProduto=" + nomeProduto + ", quantiadeVendida=" + quantiadeVendida
				+ ", dataUltimaVenda=" + dataUltimaVenda + "]";
	}



	public String getNomeProduto() {
		return nomeProduto;
	}


	public Long getQuantiadeVendida() {
		return quantiadeVendida;
	}


	public LocalDate getDataUltimaVenda() {
		return dataUltimaVenda;
	}
	
	
}
