package parte2.solid.aula04_07102016.ex03.ocp_dip.parte1;
public class CalculadoraDePrecos {

    public double calcula(Compra produto) {
        
    	TabelaDePrecoPadrao tabela = new TabelaDePrecoPadrao();
        Frete correios = new Frete();

        double desconto = tabela.descontoPara(produto.getValor());
        double frete = correios.para(produto.getCidade());

        return produto.getValor() * (1-desconto) + frete;
    }
}

