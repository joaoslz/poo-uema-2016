package parte2.solid.aula04_07102016.ex04.encapsulamento.parte1;

import java.util.List;

public class ProcessadorDeBoletos {

    public void processa(List<Boleto> boletos, Fatura fatura) {

        double total = 0;
        for(Boleto boleto : boletos) {
            Pagamento pagamento = new Pagamento(boleto.getValor(), MeioDePagamento.BOLETO);
            fatura.getPagamentos().add(pagamento);

            total += fatura.getValor();
        }

        if(total >= fatura.getValor()) {
            fatura.setPago(true);
        }
    }
}
