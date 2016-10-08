package parte1b.boasPraticas.aula04_07102016;

import static java.util.Comparator.comparing;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class TesteJava8v2 {
	
	public static void main(String[] args) {
		
		
		Impressora impressora = () -> System.out.println("Imprimindo o texto ..." );
		
		List<String> palavras = new ArrayList<>();
		
		palavras.add("Java");
		palavras.add("C#");
		palavras.add("Python");
		palavras.add("Javascript");
		

		palavras.forEach( p -> System.out.println(p)	);
		palavras.forEach(System.out::println );
		
		
		palavras.sort((s1, s2)  -> 
			Integer.compare(s1.length(), s2.length())
		);
		
		
		Function<String, Integer> funcao =  p -> p.length() ;
		
		Function<String, Integer> funcao2 = new Function<String, Integer>() {

			@Override
			public Integer apply(String p) {
				return p.length();
			}
		};
		
//		Function<String, Integer> funcao = s -> s.length();

		Comparator<String> comparador = Comparator.comparing(funcao);
		
		palavras.sort(Comparator.comparing(String::length));
		palavras.sort(comparing(String::length));
	
		
		
//		Collections.sort(palavras,  porTamanho );

		System.out.println("\n--------------");
		for (String p : palavras) {
			System.out.print(p + "   ");
		}
	}
}

