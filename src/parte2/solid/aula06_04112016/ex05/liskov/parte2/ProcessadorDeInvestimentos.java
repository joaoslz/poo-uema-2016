package parte2.solid.aula06_04112016.ex05.liskov.parte2;

import java.util.Arrays;
import java.util.List;

public class ProcessadorDeInvestimentos {

    public static void main(String[] args) {

        for (ContaComum conta : contasDoBanco()) {
            conta.somaInvestimento(); 
        	System.out.println("Novo Saldo:");
            System.out.println(conta.getSaldo());
        }
    }

    private static List<ContaComum> contasDoBanco() {
        
    	return  Arrays.asList(umaContaCom(100), umaContaCom(150),
                umaContaCom(200));
    }

    private static ContaUniversitaria contaUniversitaria(double amount) {
        ContaUniversitaria c = new ContaUniversitaria();
        c.deposita(amount);
        return c;
    }

    private static ContaComum umaContaCom(double valor) {
        ContaComum c = new ContaComum();
        c.deposita(valor);
        return c;
    }

}

