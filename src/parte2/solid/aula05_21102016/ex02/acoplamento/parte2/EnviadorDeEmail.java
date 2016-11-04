package parte2.solid.aula05_21102016.ex02.acoplamento.parte2;


public class EnviadorDeEmail implements AcaoAposGerarNota {

	@Override
    public void executa(NotaFiscal nf) {
    	System.out.println("Enviando email ...");
    }
}

