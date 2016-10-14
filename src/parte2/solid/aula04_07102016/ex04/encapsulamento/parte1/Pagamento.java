package parte2.solid.aula04_07102016.ex04.encapsulamento.parte1;
public class Pagamento {

    private double valor;
    private MeioDePagamento forma;

    public Pagamento(double valor, MeioDePagamento forma) {
        this.valor = valor;
        this.forma = forma;
    }

    public double getValor() {
        return valor;
    }

    public MeioDePagamento getForma() {
        return forma;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Pagamento)) {
            return false;
        }
        Pagamento outro = (Pagamento) obj;
        if (forma != outro.forma
                || Double.doubleToLongBits(valor) != Double
                        .doubleToLongBits(outro.valor)) {
            return false;
        }

        return true;
    }

}