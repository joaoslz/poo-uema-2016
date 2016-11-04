package parte2.solid.aula06_04112016.ex03.ocp_dip.parte2;

public class CalculadoraDePrecos {

	private ServicoDeEntrega servicoDeEntrega;
	private TabelaDePreco tabelaDePreco;

	public CalculadoraDePrecos(ServicoDeEntrega servicoDeEntrega, TabelaDePreco tabelaDePreco) {
		this.servicoDeEntrega = servicoDeEntrega;
		this.tabelaDePreco = tabelaDePreco;

	}

	public double calcula(Compra produto) {

		double desconto = tabelaDePreco.descontoPara(produto.getValor());
		double frete = servicoDeEntrega.para(produto.getCidade());

		return produto.getValor() * (1 - desconto) + frete;
	}
}
