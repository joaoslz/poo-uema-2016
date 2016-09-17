package parte1.boasPraticas.aula02_16092016.parte3;

public class Divida {

	private double total;
	private String credor;
	private Cnpj cnpjCredor;
	
	private Pagamentos pagamentos;


	public Cnpj getCnpjCredor() {
		return cnpjCredor;
	}
	
	public void setCnpjCredor(Cnpj cnpjCredor) {
		this.cnpjCredor = cnpjCredor;
	}

	public String getCredor() {
		return this.credor;
	}

	public double getTotal() {
		return this.total;
	}


	public void setCredor(String credor) {
		this.credor = credor;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double valorAPagar() {
		return this.total - this.pagamentos.getValorPago();
	}

	public void registra(Pagamento pagamento) {
		pagamentos.registra(pagamento);
	}


}