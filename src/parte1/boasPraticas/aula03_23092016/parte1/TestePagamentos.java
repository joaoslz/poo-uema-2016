package parte1.boasPraticas.aula03_23092016.parte1;

public class TestePagamentos {
	
	public static void main(String[] args) {
		
		Pagamento pagamento1 = new Pagamento();
		pagamento1.setValor(300);
		
		Pagamento pagamento2 = new Pagamento();
		pagamento2.setValor(200);
		
				
		Pagamentos pagamentos = new Pagamentos();
		
		pagamentos.registra(pagamento1);
		pagamentos.registra(pagamento2);
		
				
		//Iterable<Pagamento> lista = new ArrayList<Pagamento>();
		//Iterable<Pagamento> lista = new Pagamentos();
		
		
//		Iterable<Pagamento> lista = pagamentos;
		
//		Iterator<Pagamento> iterator = lista.iterator();
//		
//		while( iterator.hasNext() ) {
//			Pagamento p = iterator.next();
//			System.out.println( p.getValor() );
//		}
		

		for (Pagamento pagamento : pagamentos ) {
			System.out.println( pagamento.getValor() );

		}
		
		
		
		
		
		
		
		
	}

}
