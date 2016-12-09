package parte3.padroes.builder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class NotaFiscal {

	private String razaoSocial;
	private String cnpj;
	private LocalDate dataDeEmissao;
	private double valorBruto;
	private double impostos;
	public List<Item> itens = new ArrayList<>();
	public String observacoes;


	NotaFiscal(String razaoSocial, String cnpj, LocalDate dataDeEmissao, double valorBruto,
			double impostos, List<Item> itens, String observacoes) {

		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.dataDeEmissao = dataDeEmissao;
		this.valorBruto = valorBruto;
		this.impostos = impostos;
		this.itens = itens;
		this.observacoes = observacoes;
	}

	NotaFiscal() { 	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public LocalDate getDataDeEmissao() {
		return dataDeEmissao;
	}
	

	public double getValorBruto() {
		return valorBruto;
	}

	public double getImpostos() {
		return impostos;
	}

	public List<Item> getItens() {
		return itens;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public double getValorTotal() {
		
		double valorTotal = this.valorBruto + this.impostos;
		return valorTotal;
	}

	void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	void setDataDeEmissao(LocalDate dataDeEmissao) {
		this.dataDeEmissao = dataDeEmissao;
	}
	
	void setValorBruto(double valorBruto) {
		this.valorBruto = valorBruto;
	}

	void setImpostos(double impostos) {
		this.impostos = impostos;
	}

	void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public int getQuantidadeDeItens() {
		return itens.size();
	}

	public NotaFiscal constroi() {
		NotaFiscal notaFiscal;

		if (cnpj != null) {
			notaFiscal = new NotaFiscal(razaoSocial, cnpj, dataDeEmissao, valorBruto, impostos, itens, observacoes);
		} else {
			throw new IllegalStateException("Não é possível criar uma nota sem o CNPJ");
		}

		return notaFiscal;
	}

	public void adiciona(Item item) {
		
		double subTotal = item.getSubTotal();
		
		this.valorBruto += subTotal;
		this.impostos += subTotal * 0.05;
		
		this.itens.add(item);
		
	}

}
