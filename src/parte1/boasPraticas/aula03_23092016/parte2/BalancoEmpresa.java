package parte1.boasPraticas.aula03_23092016.parte2;

public class BalancoEmpresa {

	private ArmazenadorDeDividas bd;
	
	public BalancoEmpresa(ArmazenadorDeDividas bd) {
		this.bd = bd;
	}

	public void registraDivida(Divida divida) {
		bd.salva(divida);
	}

	public void pagaDivida(Documento documentoCredor, Pagamento pagamento) {
		
		Divida divida = bd.carrega(documentoCredor);
		if (divida != null) {
			divida.registra(pagamento);
		}
		bd.salva(divida);
	}


}