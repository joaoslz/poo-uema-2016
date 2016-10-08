package parte1b.boasPraticas.aula04_07102016;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import parte1.boasPraticas.aula03_23092016.parte2.Pagamento;

public class TestePagamento {
	
	public static void main(String[] args) {
		
		Pagamento pagamento1 = new Pagamento();
		pagamento1.setValor(150);
		
		Pagamento pagamento2 = new Pagamento();
		pagamento2.setValor(50);
		
		Pagamento pagamento3 = new Pagamento();
		pagamento3.setValor(250);
		
		Pagamento pagamento4 = new Pagamento();
		pagamento4.setValor(300);
		
		List<Pagamento> pagamentos = 
				Arrays.asList(pagamento1, pagamento2, pagamento3, pagamento4);
		
		
		double mediaPag = pagamentos.stream()
		          .filter(p -> (p.getValor() > 100))
		          .mapToDouble(p -> p.getValor())
		          .average()
		          .getAsDouble();
		
		System.out.println(mediaPag);
		          
		
		
		Optional<Pagamento> optional = pagamentos.stream()
	               .filter(p -> (p.getValor() > 1000) )
	               .findAny();
	
		        
		optional.ifPresent(p -> System.out.println(p.getValor()));
		
		Pagamento pagamento = optional.orElse(new Pagamento());
		
		
		System.out.println("########## " + pagamento.getValor());
		
		
		
	}

}
