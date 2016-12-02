package parte3.padroes.chain;

public interface RegraDeDesconto {

	double desconta(Orcamento orcamento);
	
	void setProximo(RegraDeDesconto regra);

}