package parte1.boasPraticas.aula02092016;

class Divida {
	
	String credor;
	private double total;
	private double valorPago;
	
	
	public Divida(double total) {
		
		this.total = total;
	}

	public Divida() {
	}
	
	
	public double getTotal() {
		return total;
	}
	
	public void setTotal(double total) {
		if (total <= 0) {
			throw new IllegalArgumentException("O total deve ser maior do que zero!");
		}
	    this.total = total;
	}
	
}




