package parte3.padroes.decorator;

public abstract class ImpostoDecorator implements Imposto {

	private Imposto impostoDecorator;
	
	public ImpostoDecorator() {
	}
	
	public ImpostoDecorator(Imposto outroImposto) {
		this.impostoDecorator = outroImposto;
	}
	
	
	protected double calculaOutroImposto(Orcamento orcamento) {
		
		if (this.impostoDecorator != null) {
			return impostoDecorator.calcula(orcamento);
		}
		return 0;
	}





}
