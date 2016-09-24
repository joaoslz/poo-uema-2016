package parte1.boasPraticas.aula03_23092016.parte2;

public class Divida {

	private double total;
	private String credor;
	private Documento documentoCredor;
	
	private Pagamentos pagamentos = new Pagamentos();


	public Documento getDocumentoCredor() {
		return documentoCredor;
	}
	
	public void setDocumentoCredor(Documento cnpjCredor) {
		this.documentoCredor = cnpjCredor;
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