package parte2.solid.aula06_04112016.ex03.ocp_dip.parte2;


public class Frete  implements ServicoDeEntrega {
    
	@Override
	public double para(String cidade) {
        
    	if("SAO PAULO".equals(cidade.toUpperCase())) {
            return 15;
        }
        return 30;
    }
}