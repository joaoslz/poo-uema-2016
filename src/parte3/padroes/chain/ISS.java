package parte3.padroes.chain;

public class ISS implements Imposto {
	
	@Override
	public double calcula(Orcamento orcamento) {
		
	  double iss = orcamento.getValorTotal() * 0.06;
	  return iss;
	}

}
