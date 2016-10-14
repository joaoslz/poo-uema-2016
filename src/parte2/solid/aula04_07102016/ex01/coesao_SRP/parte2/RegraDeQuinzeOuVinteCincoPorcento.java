package parte2.solid.aula04_07102016.ex01.coesao_SRP.parte2;

public class RegraDeQuinzeOuVinteCincoPorcento implements RegraDeCalculo {
	
	@Override
	public double calcula(Funcionario funcionario) {
	        if(funcionario.getSalarioBase() > 2000.0) {
	            return funcionario.getSalarioBase() * 0.75;
	        }
	        else {
	            return funcionario.getSalarioBase() * 0.85;
	        }
	    }

}
