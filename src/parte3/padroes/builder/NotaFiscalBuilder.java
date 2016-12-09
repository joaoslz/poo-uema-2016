package parte3.padroes.builder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class NotaFiscalBuilder {
	
	private String razaoSocial;
	private String cnpj;
	private LocalDate dataDeEmissao;
	private double valorBruto;
	private double impostos;
	public List<Item> itens = new ArrayList<>();
	public String observacoes;

	public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
		
	}

	public NotaFiscalBuilder comCnpj(String cnpj) {
		this.cnpj = cnpj;
		
		return this;
	}

	public NotaFiscalBuilder comItem(Item item) {
		
		double subTotal = item.getSubTotal();
		
		this.valorBruto += subTotal;
		this.impostos += subTotal * 0.05;
		
		itens.add(item);
		
		return this;
	}

	public NotaFiscalBuilder naDataAtual() {
		this.dataDeEmissao = LocalDate.now();
		
		return this;
	}

	public NotaFiscalBuilder comObservacoes(String observacoes) {
		this.observacoes = observacoes;
		
		return this;
		
	}

	public NotaFiscal costroi() {
		
		if(this.cnpj == null || this.cnpj.isEmpty()) {
			throw new IllegalArgumentException("Deve possuir um CNPJ Válido!!!");
		}
		
		return new NotaFiscal(razaoSocial, cnpj, dataDeEmissao, valorBruto, 
				              impostos, itens, observacoes);
	}
	

}
