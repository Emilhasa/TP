package pastelaria;

public class Venda {
	private PedidoLocal pedidoLocal;
	private PedidoDelivery pDelivery;
	private String formaPagamento;
	private double valor;
	
	
	public Venda(String formaPagamento, PedidoDelivery pedidoDelivery) {
		this.formaPagamento = formaPagamento;
		this.pDelivery = pedidoDelivery;
		pedidoDelivery.setStatus("Saiu para entrega");
		
		for (int i = 0; i < pedidoDelivery.getPastel().size(); i++) {
			this.valor += pedidoDelivery.getPastel().get(i).getValor();
		}
		
		for (int i = 0; i < pedidoDelivery.getBebida().size(); i++) {
			this.valor += pedidoDelivery.getBebida().get(i).getValor();
		}
	}

	public Venda(String formaPagamento, PedidoLocal pedidoLocal) {
		this.formaPagamento = formaPagamento;
		this.pedidoLocal = pedidoLocal;
		pedidoLocal.setStatus("Finalizado");
		
		for (int i = 0; i < pedidoLocal.getPastel().size(); i++) {
			this.valor += pedidoLocal.getPastel().get(i).getValor();
		}
		
		for (int i = 0; i < pedidoLocal.getBebida().size(); i++) {
			this.valor += pedidoLocal.getBebida().get(i).getValor();
		}
	}
	
	public String toString() {
		return "\n\t****Venda****\n\n" + pedidoLocal + "\n"+ pDelivery + "\nFormaPagamento:" + formaPagamento
				+ "\nValor Total:" + valor;
	}

	public PedidoLocal getPedidoLocal() {
		return pedidoLocal;
	}
	
	public void setPedidoLocal(PedidoLocal pedidoLocal) {
		this.pedidoLocal = pedidoLocal;
	}
	
	public PedidoDelivery getPDelivery() {
		return pDelivery;
	}
	
	public void setPeDelivery(PedidoDelivery pedidoDelivery) {
		this.pDelivery = pedidoDelivery;
	}
	
	public String getFormaPagamento() {
		return formaPagamento;
	}
	
	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}	
	
}
