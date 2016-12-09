package parte3.padroes.decorator;

import java.util.Arrays;

public class TesteDeImpostoComplexo {
	
	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento();
		
		orcamento.adicionaItem( new Item("Caneta", 20, 7) );
		orcamento.adicionaItem( new Item("Lapis", 4, 8) );
		orcamento.adicionaItem( new Item("Borracha", 6, 5) );
		
		
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		
		Imposto icms = new ICMS();
      	
		Imposto impostoComplexo1 = new ICMS(new ISS());
		Imposto impostoComplexo2 = new ICMS(new ISS(new ImpostoCondicionalB()));
		
		Imposto impostoComplexo3 = new ICMS(impostoComplexo1);
	
		Imposto novoImpostoComplexo = new ICMS(new ImpostoCondicionalA());
		
		
		double imposto = calculadora.realizaCalculo(orcamento, impostoComplexo2);
		
		
		System.out.println(imposto);
		
		
		
		
	}

}
