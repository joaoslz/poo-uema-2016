package parte3.padroes.chain;

public class DescontoParaItemMaiorDoQue100 implements RegraDeDesconto {
	
	private RegraDeDesconto proximo;

	@Override
	public double desconta(Orcamento orcamento) {
		
		 if (orcamento.getValorTotal() > 1000 ) {
			 return orcamento.getValorTotal() * 0.10;

		 } else {
			 return proximo.desconta(orcamento);
		 }
	}

	@Override
	public void setProximo(RegraDeDesconto regra) {
		this.proximo = regra;
	}

}
