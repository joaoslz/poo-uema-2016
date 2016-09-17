package parte1.boasPraticas.aula01_02092016;

public class DividaTest {
	
	public static void main(String[] args) {
		
		Divida divida = new Divida(1000);
		divida.credor = "Joao";
		
		divida.setTotal(10);

		Divida divida2 = new Divida();
		
		divida2.credor = "Joao";
		
		divida2.setTotal(2000);
		
		System.out.println("Total da Divida 1 : " + divida.getTotal() );
		System.out.println("Total da Divida 2 : " + divida2.getTotal() );
		
		
		
		
		
		
		
	}

}
