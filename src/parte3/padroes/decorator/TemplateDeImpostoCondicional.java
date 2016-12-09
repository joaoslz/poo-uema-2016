package parte3.padroes.decorator;

public abstract class TemplateDeImpostoCondicional implements Imposto {

	// template method
	@Override
	public final double calcula(Orcamento orcamento) {
		double imposto = 0;

		if (deveAplicarAMaximaTaxacao(orcamento) ) {
			imposto = aplicaAMaximaTaxacao(orcamento);
		
		} else {
			imposto = aplicaAMinimaTaxacao(orcamento);
		}
		
		// codigo
		return imposto;
	}

	protected abstract double aplicaAMinimaTaxacao(Orcamento orcamento);

	protected abstract double aplicaAMaximaTaxacao(Orcamento orcamento);

    protected abstract boolean deveAplicarAMaximaTaxacao(Orcamento orcamento);

}
