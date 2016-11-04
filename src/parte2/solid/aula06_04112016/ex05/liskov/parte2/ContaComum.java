package parte2.solid.aula06_04112016.ex05.liskov.parte2;
public class ContaComum implements ContasComInvestimento {
	
	private MovimentacaoSaldo movimentacao;


    public ContaComum() {
    	this.movimentacao = new MovimentacaoSaldo();
    }

    public void deposita(double valor) {
        this.movimentacao.deposita(valor);
    }

    public void saca(double valor) {
    	this.movimentacao.saca(valor);
       
    }

    /* (non-Javadoc)
	 * @see parte2.solid.aula06_04112016.ex05.liskov.parte2.ContasComInvestimento#somaInvestimento()
	 */
    @Override
	public void somaInvestimento() {
    	double rendimento = movimentacao.getSaldo() * 0.01;
    	movimentacao.deposita(rendimento);
    }

    public double getSaldo() {
        return movimentacao.getSaldo();
    }

}