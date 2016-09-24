package parte1.boasPraticas.aula03_23092016.parte1;

public class GerenciadorDeDividas {
	public void efetuaPagamento(Divida divida, Pagamento pagamento) {
		
		//divida.getPagamentos().add(pagamento);
		divida.registra( pagamento );
	}

	// outros métodos
}