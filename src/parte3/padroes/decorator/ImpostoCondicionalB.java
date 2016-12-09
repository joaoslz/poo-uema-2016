package parte3.padroes.decorator;

public class ImpostoCondicionalB extends TemplateDeImpostoCondicional {

	@Override
	protected double aplicaAMinimaTaxacao(Orcamento orcamento) {
		return orcamento.getValorTotal() * 0.05;
	}

	@Override
	protected double aplicaAMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValorTotal() * 0.12;
	}

	@Override
	protected boolean deveAplicarAMaximaTaxacao(Orcamento orcamento) {
		return (orcamento.getValorTotal() > 100 && orcamento.getQuantidadeDeItens() > 3);
	}

}
