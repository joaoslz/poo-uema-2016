package parte1.boasPraticas.aula02_16092016;

public class GerenciadorDeDividas {
	public void efetuaPagamento(Divida divida, double valor) {
		
		//divida.setValorPago(divida.getValorPago() + valor);
		divida.paga(valor);
	}

	// outros métodos
}