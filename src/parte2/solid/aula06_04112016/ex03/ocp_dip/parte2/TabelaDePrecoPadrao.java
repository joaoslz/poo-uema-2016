package parte2.solid.aula06_04112016.ex03.ocp_dip.parte2;

public class TabelaDePrecoPadrao implements TabelaDePreco {
	
	
	/* (non-Javadoc)
	 * @see parte2.solid.aula06_04112016.ex03.ocp_dip.parte2.TabelaDePreco#descontoPara(double)
	 */
	@Override
	public double descontoPara(double valor) {
		if (valor > 5000)
			return 0.03;

		if (valor > 1000)
			return 0.05;
		return 0;
	}
}
