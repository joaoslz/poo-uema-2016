package parte2.solid.aula06_04112016.ex05.liskov.parte2;

public class ContaUniversitaria {

    private int milhas;
    private MovimentacaoSaldo movimentacao;
    
    public ContaUniversitaria() {
    	this.movimentacao = new MovimentacaoSaldo();
	}

    public void deposita(double valor) {
        // comportamento
    	this.movimentacao.deposita(valor);
        this.milhas += (int)valor;
    }
    
    public void saca(double valor) {
    	this.movimentacao.saca(valor);
    }

    public int getMilhas() {
        return milhas;
    }
 }

