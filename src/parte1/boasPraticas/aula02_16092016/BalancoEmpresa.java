package parte1.boasPraticas.aula02_16092016;

import java.util.HashMap;

public class BalancoEmpresa {

	private HashMap<String, Divida> dividas = new HashMap<>();

	public void registraDivida(String credor, String cnpjCredor, double valor) {
		Divida divida = new Divida();
		divida.setTotal(valor);
		divida.setCredor(credor);
		divida.setCnpjCredor(cnpjCredor);
		dividas.put(cnpjCredor, divida);
	}

	public void pagaDivida(String cnpjCredor, double valor) {
		
		Divida divida = dividas.get(cnpjCredor);
		if (divida != null) {
			divida.paga(valor);
		}
	}

}