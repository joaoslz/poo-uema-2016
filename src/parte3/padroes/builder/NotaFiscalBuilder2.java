package parte3.padroes.builder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class NotaFiscalBuilder2 {
	
    private NotaFiscal notaFiscal = new NotaFiscal();

	public NotaFiscalBuilder2 paraEmpresa(String razaoSocial) {
		notaFiscal.setRazaoSocial(razaoSocial);
		return this;
		
	}

	public NotaFiscalBuilder2 comCnpj(String cnpj) {
		notaFiscal.setCnpj(cnpj);
		
		return this;
	}

	public NotaFiscalBuilder2 comItem(Item item) {
		notaFiscal.adiciona(item);
		return this;
	}

	public NotaFiscalBuilder2 naDataAtual() {
		this.notaFiscal.setDataDeEmissao( LocalDate.now() );
		return this;
	}

	public NotaFiscalBuilder2 comObservacoes(String observacoes) {
		this.notaFiscal.setObservacoes(observacoes);
		return this;
		
	}

	public NotaFiscal costroi() {
		
		return notaFiscal;
	}
	

}
