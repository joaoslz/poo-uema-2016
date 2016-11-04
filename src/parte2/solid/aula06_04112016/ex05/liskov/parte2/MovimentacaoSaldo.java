package parte2.solid.aula06_04112016.ex05.liskov.parte2;

class MovimentacaoSaldo {

	private double saldo;

	MovimentacaoSaldo() {
		this.saldo = 0;
	}

	void deposita(double valor) {
		this.saldo += valor;
	}

	void saca(double valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	double getSaldo() {
		return saldo;
	}
}
