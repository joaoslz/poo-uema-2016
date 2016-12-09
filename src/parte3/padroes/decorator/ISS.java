package parte3.padroes.decorator;

public class ISS extends ImpostoDecorator {
	
	public ISS() {
		
	}
	
	public ISS(Imposto outroImposto) {
		super(outroImposto);
	}
	
	@Override
	public double calcula(Orcamento orcamento) {
		
	  return orcamento.getValorTotal() * 0.06 +
			 super.calculaOutroImposto(orcamento);
	}

}
