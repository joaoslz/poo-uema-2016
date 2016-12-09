package parte3.padroes.templateMethod;

public class CalculadoraDeImpostos {
	
	public double realizaCalculo(Orcamento orcamento, Imposto impostoQualquer) {
		
		return impostoQualquer.calcula(orcamento);

	}

	
	
	
	
	// public double realizaCalculo(Orcamento orcamento, String tipoImposto) {
	//
	// if ( tipoImposto.equalsIgnoreCase("ICMS") ) {
	// return new ICMS().calcula(orcamento);
	// }
	//
	// if (tipoImposto.equalsIgnoreCase("ISS")) {
	// return new ISS().calcula(orcamento);
	// }
	// // if outro imposto
	//
	// return 0;
	//
	//
	//
	// }

	// public double realizaCalculo(Orcamento orcamento, String tipoImposto) {
	//
	// double valorTotal = orcamento.getValorTotal();
	//
	// if ( tipoImposto.equalsIgnoreCase("ICMS") ) {
	// double icms = valorTotal * 0.10;
	// // código complexo
	//
	// return icms;
	// }
	// if (tipoImposto.equalsIgnoreCase("ISS")) {
	// double iss = valorTotal * 0.06;
	// return iss;
	//
	// }
	// // if outro imposto
	//
	// return 0;
	//
	//
	//
	// }

}
