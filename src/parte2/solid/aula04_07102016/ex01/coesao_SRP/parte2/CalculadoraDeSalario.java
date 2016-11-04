package parte2.solid.aula04_07102016.ex01.coesao_SRP.parte2;

public class CalculadoraDeSalario {

	public double calcula(Funcionario funcionario) {

		//return funcionario.getCargo().getRegra().calcula(funcionario);
		
		return funcionario.calculaSalario();

	}

}
