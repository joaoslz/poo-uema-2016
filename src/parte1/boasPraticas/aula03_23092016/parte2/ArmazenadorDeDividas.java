package parte1.boasPraticas.aula03_23092016.parte2;

public interface ArmazenadorDeDividas {

	void salva(Divida divida);

	Divida carrega(Documento documentoCredor);

}