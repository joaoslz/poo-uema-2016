package parte2.solid.aula05_21102016.ex02.acoplamento.parte2;

public class NotaFiscalDao implements AcaoAposGerarNota {
	
	
   @Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Salvando no banco ...");
	}
}
