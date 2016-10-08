package parte1.boasPraticas.aula03_23092016.parte2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class Pagamentos implements Iterable<Pagamento> {

	private double valorPago;
	private final Collection<Pagamento> pagamentos = new ArrayList<>();
    String texto;
	
	
    public Collection<Pagamento> getPagamentos() {
		return Collections.unmodifiableCollection(pagamentos);
	}
    
    
	public double getValorPago() {
		return this.valorPago;
	}

	private void paga(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Valor invalido para pagamento");
		}
		if (valor > 100) {
			valor = valor - 8;
		}
		this.valorPago += valor;
	}

	public void registra(Pagamento pagamento) {
		pagamentos.add(pagamento);
		paga(pagamento.getValor());
	}

	
	
	public List<Pagamento> pagamentosAntesDe(Calendar data) {
	
		return this.pagamentos.stream()
				           .filter( p -> (  p.getData().before(data) )  )
				           .collect(Collectors.toList());
	            
	}

	public List<Pagamento> pagamentosComValorMaiorQue(double valorMinimo) {
		
		return this.pagamentos.stream()
		               .filter(p -> (p.getValor() > valorMinimo) )
		               .collect( Collectors.toList() )
	}

	public ArrayList<Pagamento> pagamentosDo(String cnpjPagador) {
		ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
		for (Pagamento pagamento : this.pagamentos) {
			if (pagamento.getCnpjPagador().equals(cnpjPagador)) {
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}


	@Override
	public Iterator<Pagamento> iterator() {
		return this.pagamentos.iterator();
	}
	
}
