package parte1.boasPraticas.aula03_23092016.parte2;

public class Cpf implements Documento {
	
	private String valor;
	
	public Cpf(String valor) {
		this.valor = valor;
		
		if  (naoEhValido() ) {
			throw new IllegalArgumentException("Valor do CPF inválido");
		}
	}
	
	@Override
	public boolean ehValido() {
		return true;
	}

	private boolean naoEhValido() {
		return !ehValido();
	}

	@Override
	public String getValor() {
		return valor;
	}
	
	
	@Override
	public String toString() {
		return this.valor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((valor == null) ? 0 : valor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cpf other = (Cpf) obj;
		if (valor == null) {
			if (other.valor != null)
				return false;
		} else if (!valor.equals(other.valor))
			return false;
		return true;
	}
	
	
}
