package parte2.solid.aula06_04112016.ex05.liskov.parte1;

public class ContaUniversitaria extends ContaComum {

    private int milhas;

    public void deposita(double valor) {
        super.deposita(valor);
        this.milhas += (int)valor;
    }

    public int getMilhas() {
        return milhas;
    }
    
    @Override
    public void somaInvestimento() {
    	throw new RuntimeException("Não pode ter investimento!!");
    }
}

