package parte1.boasPraticas.aula03_23092016.parte1;

import java.util.HashMap;

import parte1.boasPraticas.aula03_23092016.parte2.Divida;
import parte1.boasPraticas.aula03_23092016.parte2.Documento;
import parte1.boasPraticas.aula03_23092016.parte2.Pagamento;

public class BalancoEmpresa {

	private HashMap<Documento, Divida> dividas = new HashMap<>();

	public void registraDivida(Divida divida) {
		dividas.put( divida.getDocumentoCredor(), divida );
	}

	
	public void pagaDividaPJ(Documento documentoCredor, Pagamento pagamento) {
		
		Divida divida = dividas.get(documentoCredor);
		if (divida != null) {
			divida.registra(pagamento);
		}
	}


}