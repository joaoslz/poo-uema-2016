package parte2.solid.aula05_21102016.ex02.acoplamento.parte2;

import java.util.List;

public class GeradorDeNotaFiscal {

	private List<AcaoAposGerarNota> acoes;

	public GeradorDeNotaFiscal(List<AcaoAposGerarNota> acoes) {
		this.acoes = acoes;

	}

	public NotaFiscal gera(Fatura fatura) {

		// gera a notafiscal
		double valor = fatura.getValorMensal();
		NotaFiscal nf = new NotaFiscal(valor, impostoSimplesSobreO(valor));

		// executa ações após gerar a nota
		executaAcaoAposGerarNota(nf);

		return nf;
	}

	private void executaAcaoAposGerarNota(NotaFiscal notaFiscal) {
		
		for (AcaoAposGerarNota acaoAposGerarNota : acoes) {
			acaoAposGerarNota.executa(notaFiscal);
			
		}
		
	}

	private double impostoSimplesSobreO(double valor) {
		return valor * 0.06;
	}
}
