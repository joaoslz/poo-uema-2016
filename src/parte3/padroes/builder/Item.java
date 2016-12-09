package parte3.padroes.builder;

import java.math.BigDecimal;

public class Item {
	
	private String nome;
	private double valorUnitario;
	private Integer quantidade;
	
	
	public Item(String nome, double valor, Integer quantidade) {
		this.nome = nome;
		this.valorUnitario = valor;
		this.quantidade = quantidade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getValorUnitario() {
		return this.valorUnitario;
	}
	
	public double getSubTotal() {
		return this.valorUnitario * this.quantidade; 
	}
}
