package parte3.padroes.templateMethod;

public class ImpostoCondicionalA extends TemplateDeImpostoCondicional {

	@Override
	protected double aplicaAMinimaTaxacao(Orcamento orcamento) {
		return orcamento.getValorTotal() * 0.06;
	}

	@Override
	protected double aplicaAMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValorTotal() * 0.09;
	}

	@Override
	protected boolean deveAplicarAMaximaTaxacao(Orcamento orcamento) {
		return (orcamento.getValorTotal() > 1000 );
	}
	
	
	
	

}
