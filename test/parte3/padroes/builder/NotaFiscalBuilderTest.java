package parte3.padroes.builder;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NotaFiscalBuilderTest {

	private NotaFiscal notaFiscal;

	@Before
	public void setup() {
		
		this.notaFiscal  = new NotaFiscalBuilder2()
			.paraEmpresa("Instituto Federal")
			.comCnpj("0123.456.567-0001")
			.comItem(new Item("Monitor", 500, 1) )
			.comItem(new Item("Ultrabook", 2500, 1))
			.comItem(new Item("Tablet", 1500, 1))
			.naDataAtual()
			.comObservacoes("Observacao Qualquer")
			.costroi();
			
//		List<Item> itens = Arrays.asList( new Item("Monitor", 500, 1), 
//				                          new Item("Ultrabook", 2500, 1),
//				                          new Item("Tablet", 1500, 1));
//
//		double valorBruto = 0;
//
//		for (Item item : itens) {
//			valorBruto += item.getValorUnitario();
//		}
//		
//		double impostos = valorBruto * 0.05;
//		
//		notaFiscal = new NotaFiscal("razao social qualquer", "0123.456.567-0001", LocalDate.now(), 
//				valorBruto, impostos, itens, "Observacao Qualquer"); 
	}
	
	@Test
	public void devePossuir3Itens() {
		Assert.assertEquals(3, notaFiscal.getQuantidadeDeItens() );
	}

	@Test
	public void deveCalcularValorTotal() {
	    
		double valorEsperado = 4500.0 * 1.05;
		
	    double valorCalculado = notaFiscal.getValorTotal();
		
	    Assert.assertEquals(valorEsperado, valorCalculado, 0.00001);
	}
	

}
