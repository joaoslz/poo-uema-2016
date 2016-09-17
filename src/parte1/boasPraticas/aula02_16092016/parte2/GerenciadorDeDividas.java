package parte1.boasPraticas.aula02_16092016.parte2;

public class GerenciadorDeDividas {
	public void efetuaPagamento(Divida divida, Pagamento pagamento) {
		
		//divida.getPagamentos().add(pagamento);
		divida.registra( pagamento );
	}

	// outros métodos
}