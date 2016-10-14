package parte2.solid.aula04_07102016.ex01.coesao_SRP.parte2;

public class RegraDeDezOuVintePorcento implements RegraDeCalculo {

	@Override
	public double calcula(Funcionario funcionario) {
		
		if (funcionario.getSalarioBase() > 3000.0) {
			return funcionario.getSalarioBase() * 0.8;
		} else {
			return funcionario.getSalarioBase() * 0.9;
		}
	}

}
