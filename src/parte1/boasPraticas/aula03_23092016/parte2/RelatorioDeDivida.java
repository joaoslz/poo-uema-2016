package parte1.boasPraticas.aula03_23092016.parte2;

import java.text.NumberFormat;
import java.util.Locale;

public class RelatorioDeDivida {

	private Divida divida;

	public RelatorioDeDivida(Divida divida) {
		this.divida = divida;
	}

	public void geraRelatorio(NumberFormat formatador) {

		System.out.println("Credor: " + divida.getCredor() );
		System.out.println("Cnpj credor: " + divida.getDocumentoCredor() );
		
		// agora utilizamos uma instância da classe NumberFormat
		// para fazer a exibição dos valores
		
		System.out.println("Valor a pagar: " + formatador.format( divida.valorAPagar()) );
		System.out.println("Valor total: " + formatador.format( divida.getTotal() ) );
	}
	
	public static void main(String[] args) {
		
		Divida divida = new Divida();
		
		divida.setDocumentoCredor(new Cnpj("123213213"));
		divida.setCredor("Uma Emprea");
		divida.setTotal(1000);
		
		Pagamento pagamento = new Pagamento();
		pagamento.setValor(200);
		
		divida.registra(pagamento);
		
		RelatorioDeDivida relatorio = new RelatorioDeDivida(divida);
//		NumberFormat formatador = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
//		NumberFormat formatador = NumberFormat.getCurrencyInstance( Locale.US );
		NumberFormat formatador = NumberFormat.getCurrencyInstance( Locale.UK );

		relatorio.geraRelatorio(formatador);
	}
	
	
}