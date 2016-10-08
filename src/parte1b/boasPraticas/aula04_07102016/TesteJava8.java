package parte1b.boasPraticas.aula04_07102016;

import static java.util.Comparator.comparing;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class TesteJava8 {
	
	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<>();
		
		palavras.add("Java");
		palavras.add("C#");
		palavras.add("Python");
		palavras.add("Javascript");
		
//		for (String p : palavras) {
//			System.out.print(p + "   ");
//		}
//		
//		Consumer<String> consumidorString = new ConsumidorString();
//		palavras.forEach(consumidorString);
		
//		palavras.forEach(new Consumer<String>() {
//			@Override
//			public void accept(String p) {
//				System.out.print(p + "   ");
//			}
//			
//		});
		palavras.forEach( p -> System.out.println(p)	);
		palavras.forEach(System.out::println );
		
		
		ComparadorPorTamanho porTamanho = new ComparadorPorTamanho();

//		palavras.sort((String s1, String s2)  -> {
//				if ( s1.length() < s2.length() ) {
//					return -1;
//				}
//				if ( s1.length() > s2.length() ) {
//					return 1;
//				}
//				return 0;
//			}
//		);
		
		
//		palavras.sort((String s1, String s2)  -> {
//			return Integer.compare(s1.length(), s2.length());
//		}
		palavras.sort((s1, s2)  -> 
			Integer.compare(s1.length(), s2.length())
		);
		
		
		Comparator<String> comparador = Comparator.comparing(s -> s.length());
		
		palavras.sort(Comparator.comparing(String::length));
		
		palavras.sort(comparing(String::length));
	
		
		
//		Collections.sort(palavras,  porTamanho );

		System.out.println("\n--------------");
		for (String p : palavras) {
			System.out.print(p + "   ");
		}
	}

}

class ConsumidorString implements Consumer<String> {

	@Override
	public void accept(String p) {
		System.out.print(p + "   ");
	}
	
}


class ComparadorPorTamanho implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		if ( s1.length() < s2.length() ) {
			return -1;
		}
		if ( s1.length() > s2.length() ) {
			return 1;
		}
		return 0;
	}
	
}
