package parte1.boasPraticas.aula03_23092016.parte2;

public class Cnpj implements Documento {
	
	
	private String valor;
	
	public Cnpj(String valor) {
		this.valor = valor;
		
		if  (naoEhValido() ) {
			throw new IllegalArgumentException("Valor do CNPJ inválido");
		}
	}
	
	@Override
	public boolean ehValido() {
		return primeiroDigitoVerificador() == primeiroDigitoCorreto()
				&& segundoDigitoVerificador() == segundoDigitoCorreto();
	}

	private boolean naoEhValido() {
		return !ehValido();
	}

	@Override
	public String getValor() {
		return valor;
	}
	
	
	private int primeiroDigitoCorreto() {
		// Extrai o primeiro dígito verificador do CNPJ armazenado
		// no atributo cnpj

		return 0;
	}

	private int primeiroDigitoVerificador() {
		// Extrai o segundo dígito verificador do CNPJ armazenado
		// no atributo cnpj
		return 0;
	}

	private int segundoDigitoCorreto() {
		// Calcula o primeiro dígito verificador correto para
		// o CNPJ armazenado no atributo cnpj
		return 0;
	}

	private int segundoDigitoVerificador() {
		// Calcula o primeiro dígito verificador correto para
		// o CNPJ armazenado no atributo cnpj
		return 0;

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
		Cnpj other = (Cnpj) obj;
		if (valor == null) {
			if (other.valor != null)
				return false;
		} else if (!valor.equals(other.valor))
			return false;
		return true;
	}
	
	
}
