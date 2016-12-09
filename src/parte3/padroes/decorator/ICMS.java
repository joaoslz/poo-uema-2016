package parte3.padroes.decorator;

public class ICMS extends ImpostoDecorator {
	

	public ICMS() { 
		super();
	}
	
	public ICMS(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	public double calcula(Orcamento orcamento) {
		
	  return orcamento.getValorTotal() * 0.10 + 
			super.calculaOutroImposto(orcamento);
	  
	}

}
