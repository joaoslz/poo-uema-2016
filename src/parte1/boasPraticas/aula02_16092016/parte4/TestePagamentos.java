package parte1.boasPraticas.aula02_16092016.parte4;

import java.util.Arrays;
import java.util.List;

public class TestePagamentos {
	
	public static void main(String[] args) {
		
		Pagamento pagamento1 = new Pagamento();
		pagamento1.setValor(300);
		
		Pagamento pagamento2 = new Pagamento();
		pagamento2.setValor(200);
		
		Pagamentos pagamentos = new Pagamentos();
		
		pagamentos.add(pagamento1);
		pagamentos.add(pagamento2);
		
		
		System.out.println( pagamentos.getValorPago() );
		
		//pagamentos.registra(pagamento);
		
		// --------------------
		Pagamento pagamento3 = new Pagamento();
		pagamento3.setValor(300);
		
		Pagamento pagamento4 = new Pagamento();
		pagamento4.setValor(200);
		
		List<Pagamento> listaPagamentos = Arrays.asList(pagamento3, pagamento4);
		
		Pagamentos pagamentosNovos = new Pagamentos();
		pagamentosNovos.addAll(listaPagamentos);
		
		System.out.println( pagamentosNovos.getValorPago() );
		
		
		
		

		
		
		
		
	}

}
