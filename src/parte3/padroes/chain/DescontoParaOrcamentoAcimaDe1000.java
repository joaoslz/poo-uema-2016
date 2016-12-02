package parte3.padroes.chain;

public class DescontoParaOrcamentoAcimaDe1000 implements RegraDeDesconto {
	
	private RegraDeDesconto proximo;

	@Override
	public double desconta(Orcamento orcamento) {
		
		 if (orcamento.getValorTotal() > 500 || orcamento.temItemComValorMaiorQue100()) {
			 return orcamento.getValorTotal() * 0.07;

		 } else {
			 return proximo.desconta(orcamento);
		 }
		
	}

	@Override
	public void setProximo(RegraDeDesconto proximo) {
		this.proximo = proximo;
		
	}

}
