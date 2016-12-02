package parte3.padroes.chain;

public class SemDesconto implements RegraDeDesconto {

	@Override
	public double desconta(Orcamento orcamento) {
		return 0;
	}

	@Override
	public void setProximo(RegraDeDesconto regra) {
		// não tem
	}

}
