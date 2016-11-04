package parte2.solid.aula06_04112016.ex05.liskov.parte1;
public class ContaComum {

    protected double saldo;

    public ContaComum() {
        this.saldo = 0;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public void saca(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void somaInvestimento(){
        this.saldo += this.saldo * 0.01;
    }

    public double getSaldo() {
        return saldo;
    }

}