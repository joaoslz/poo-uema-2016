package parte2.solid.aula06_04112016.ex04.encapsulamento.parte2;

import java.util.List;

public class ProcessadorDeBoletos {

    public void processa(List<Boleto> boletos, Fatura fatura) {

        double total = 0;
        for(Boleto boleto : boletos) {
            
        	
        	Pagamento pagamento = new Pagamento(boleto.getValor(), MeioDePagamento.BOLETO);
           
            fatura.adiciona(pagamento);
            
        }
        
        fatura.atualizaStatusPagamento();

    }
}
