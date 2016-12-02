package parte3.padroes.chain;

public class CalculadoraDeDesconto {
	
	
	public double calculaDesconto(Orcamento orcamento) {
		
		RegraDeDesconto regra1 = new DescontoParaOrcamentoAcimaDe1000();
		RegraDeDesconto regra2 = new DescontoParaItemMaiorDoQue100();
		RegraDeDesconto regra3 = new SemDesconto();
		
		regra1.setProximo(regra2);
		regra2.setProximo(regra3);
		
		double desconto = regra1.desconta(orcamento);
		
		return desconto;
	}
	
	
	
	
	
	
//	public double calculaDesconto(Orcamento orcamento) {
//		
//		double desconto = new DescontoParaOrcamentoAcimaDe1000().desconta(orcamento);
//		
//		if (desconto == 0) {
//			desconto = new DescontoParaItemMaiorDoQue100().desconta(orcamento);
//		}
//		
//		// if (desconto == 0)
//		// terceira, quarta, ... regra de desconto
//		
//		return desconto;
//		
//		
//		
//		
//	}

	
//	public double calculaDesconto(Orcamento orcamento) {
//		double desconto = 0;
//		 if (orcamento.getValorTotal() > 1000 ) {
//			 desconto = orcamento.getValorTotal() * 0.10;
//		
//		 } else if (orcamento.getValorTotal() > 5000 || 
//				    orcamento.temItemComValorMaiorQue100() ) {
//			
//			 desconto = orcamento.getValorTotal() * 0.07;
//		 }
//		 // else if 
//		 return desconto;
//	}



	
	
	
	

}
