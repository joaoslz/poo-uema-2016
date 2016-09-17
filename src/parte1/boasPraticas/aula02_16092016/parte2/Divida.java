package parte1.boasPraticas.aula02_16092016.parte2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Divida {

	private double total;
	private double valorPago;
	private String credor;
	private String cnpjCredor;

	private ArrayList<Pagamento> historicoPagamentos = new ArrayList<>();

	
	public List<Pagamento> getPagamentos() {
		return  Collections.unmodifiableList(historicoPagamentos);
	}

	private void paga(double valor) {

		if (valor < 0) {
			throw new IllegalArgumentException("Valor não pode ser negativo");
		}

		if (valor > 1000) {
			valor = valor - 8;
		}

		this.valorPago = this.valorPago + valor;

	}

	public void registra(Pagamento pagamento) {

		this.historicoPagamentos.add(pagamento);
		this.paga(pagamento.getValor());
	}

	public double getTotal() {
		return this.total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getValorPago() {
		return this.valorPago;
	}

	public String getCredor() {
		return this.credor;
	}

	public void setCredor(String credor) {
		this.credor = credor;
	}

	public String getCnpjCredor() {
		return this.cnpjCredor;
	}

	public void setCnpjCredor(String cnpjCredor) {
		this.cnpjCredor = cnpjCredor;
	}

}