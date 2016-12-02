package parte3.padroes.chain;

public class ICMS implements Imposto {
	
	@Override
	public double calcula(Orcamento orcamento) {
		
	  double icms = orcamento.getValorTotal() * 0.10;
	  return icms;
	}

}
