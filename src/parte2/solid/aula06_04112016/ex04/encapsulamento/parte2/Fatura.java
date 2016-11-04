package parte2.solid.aula06_04112016.ex04.encapsulamento.parte2;

import java.util.ArrayList;
import java.util.List;

public class Fatura {

    private String cliente;
    private double total;
    private List<Pagamento> pagamentos;
    private double valorPago;
    private boolean pago;

    public Fatura(String cliente, double total) {
        this.cliente = cliente;
        this.total = total;
        this.valorPago = 0;
        this.pagamentos = new ArrayList<Pagamento>();
        this.pago = false;
    }

    public String getCliente() {
        return cliente;
    }

    public double getTotal() {
        return total;
    }

    public List<Pagamento> getPagamentos() {
        return pagamentos;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

	public void adiciona(Pagamento pagamento) {
		pagamentos.add(pagamento);
		this.valorPago += pagamento.getValor();
		
	}

	public void atualizaStatusPagamento() {
		
		if (this.valorPago >= this.total) {
			this.pago = true;
		}
		
	}


}

