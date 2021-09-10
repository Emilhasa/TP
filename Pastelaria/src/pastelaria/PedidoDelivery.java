package pastelaria;

import java.util.*;

public class PedidoDelivery extends Pedido {
	
	private List<Pastel> pastel = new ArrayList<>();
	private List<Bebida> bebida = new ArrayList<>();
	private Endereco endereco;
	private String nome;
	private int telefone;
	private String nomeEntregador;
	private int tempoEntrega;
	
	
	public PedidoDelivery(Endereco endereco, String nome, int telefone, String nomeEntregador) {
		data = new Date();
		this.numeroPedido = getNumeroPedido();
		setNumeroPedido(this.numeroPedido + 1);
		this.endereco = endereco;
		this.nome = nome;
		this.telefone = telefone;
		this.nomeEntregador = nomeEntregador;
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
		return "\n*****Pedido Delivery*****\n\n" + pastel + "\n\n" + bebida + "\nendereco: " + endereco + "\nnome: " + nome
				+ "\ntelefone: " + telefone + "\nnome entregador: " + nomeEntregador + "\n\ndata/hora: " + data
				+ "\nnumero pedido:" + numeroPedido + ", status: " + status + "\nobs:" + observacoes;
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
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getTelefone() {
		return telefone;
	}
	
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public String getNomeEntregador() {
		return nomeEntregador;
	}
	
	public void setNomeEntregador(String nomeEntregador) {
		this.nomeEntregador = nomeEntregador;
	}
	
	public int getTempoEntrega() {
		return tempoEntrega;
	}
	
	public void setTempoEntrega(int tempoEntrega) {
		this.tempoEntrega = tempoEntrega;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Endereco getEndereco() {
		return endereco;
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
