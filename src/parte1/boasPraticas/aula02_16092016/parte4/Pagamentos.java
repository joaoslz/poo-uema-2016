package parte1.boasPraticas.aula02_16092016.parte4;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;

public class Pagamentos extends ArrayList<Pagamento> {

	private double valorPago;
	//private ArrayList<Pagamento> historicoPagamentos = new ArrayList<Pagamento>();

	
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
		this.add(pagamento);
		paga(pagamento.getValor());
	}

	
	
	public ArrayList<Pagamento> pagamentosAntesDe(Calendar data) {
		ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
		for (Pagamento pagamento : this) {
			if (pagamento.getData().before(data)) {
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}

	public ArrayList<Pagamento> pagamentosComValorMaiorQue(double valorMinimo) {
		ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
		for (Pagamento pagamento : this) {
			if (pagamento.getValor() > valorMinimo) {
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}

	public ArrayList<Pagamento> pagamentosDo(String cnpjPagador) {
		ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
		for (Pagamento pagamento : this) {
			if (pagamento.getCnpjPagador().equals(cnpjPagador)) {
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}
	
	@Override
	public boolean add(Pagamento pagamento) {
		
		this.paga( pagamento.getValor() );
		return super.add( pagamento );
	}
	
	@Override
	public boolean addAll(Collection<? extends Pagamento> listaPagamentos) {
		
		for (Pagamento pagamento : listaPagamentos) {
			this.paga( pagamento.getValor() );
		}
		
		return super.addAll(listaPagamentos);
	}


}
