package parte1.boasPraticas.aula02_16092016.parte2;

import java.util.HashMap;

public class BalancoEmpresa {

	private HashMap<String, Divida> dividas = new HashMap<>();

	public void registraDivida(String credor, String cnpjCredor, double total) {
		
		Divida divida = new Divida();
		divida.setTotal(total);
		divida.setCredor(credor);
		divida.setCnpjCredor(cnpjCredor);
		
		dividas.put(cnpjCredor, divida);
	}

	public void pagaDivida(String cnpjCredor, double valor, String pagador, String cnpjPagador) {
		
		Divida divida = dividas.get(cnpjCredor);
		if (divida != null) {
			
			Pagamento pagamento = new Pagamento();
			pagamento.setCnpjPagador(cnpjPagador);
			pagamento.setPagador(pagador);
			pagamento.setValor(valor);
			
			divida.registra(pagamento);
		}
	}

}