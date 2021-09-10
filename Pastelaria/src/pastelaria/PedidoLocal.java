package pastelaria;

import java.util.*;

public class PedidoLocal extends Pedido{
	
	private List<Pastel> pastel = new ArrayList<>();
	private List<Bebida> bebida = new ArrayList<>();
	private String statusMesa;
	private int numeroMesa;
	
	
	public PedidoLocal(String statusMesa, int numeroMesa) {
		data = new Date();
		this.numeroPedido = getNumeroPedido();
		setNumeroPedido(this.numeroPedido + 1);
		this.statusMesa = statusMesa;
		this.numeroMesa = numeroMesa;
	}
	
	public void adicionarPastel(Pastel p) {
		pastel.add(p);
	}
	
	public void removerPastel(int i) {
		pastel.remove(i);
	}
	
	public void adicionarBebida(Bebida b) {
		bebida.add(b);
	}
	
	public void removerBebida(int i) {
		bebida.remove(i);
	}
	
	public void editarPedido(String a, Pastel p, int i) {
		switch (a) {
		case "adicionar":
			adicionarPastel(p);
			break;
		default:
			removerPastel(i);
			break;
		}
	}
	
	public void editarPedido(String a, Bebida b, int i) {
		switch (a) {
		case "adicionar":
			adicionarBebida(b);
			break;
		default:
			removerBebida(i);
			break;
		}
	}
	
	public String toString() {
		return "*****Pedido Local*****\n\n" + pastel + "\n\n" + bebida + "\nstatus mesa: " + statusMesa + "\nnumero mesa: "
				+ numeroMesa + "\n\ndata/hora: " + data + "\nnumero pedido: " + numeroPedido + ", status: "
				+ status + ", observacoes: " + observacoes + "]";
	}
	

	public List<Pastel> getPastel() {
		return pastel;
	}

	public void setPastel(List<Pastel> pastel) {
		this.pastel = pastel;
	}

	public List<Bebida> getBebida() {
		return bebida;
	}

	public void setBebida(List<Bebida> bebida) {
		this.bebida = bebida;
	}

	public String getStatusMesa() {
		return statusMesa;
	}
	
	public void setStatusMesa(String statusMesa) {
		this.statusMesa = statusMesa;
	}
	
	public int getNumeroMesa() {
		return numeroMesa;
	}
	
	public void setNumeroMesa(int numeroMesa) {
		this.numeroMesa = numeroMesa;
	}
	
	
	public Date getData() {
		return data;
	}
	
	
	public void setData(Date data) {
		this.data = data;
	}
	
	
	public int getHora() {
		return hora;
	}
	
	
	public void setHora(int hora) {
		this.hora = hora;
	}
	
	
	public int getNumeroPedido() {
		return numeroPedido;
	}
	
	
	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}
	
	
	public String getStatus() {
		return status;
	}
	
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	public String getObservacoes() {
		return observacoes;
	}
	
	
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}	
}
