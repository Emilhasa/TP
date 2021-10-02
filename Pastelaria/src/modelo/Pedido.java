package modelo;

import java.util.*;

public abstract class Pedido {
	protected Date data;
	protected int hora;
	protected int numeroPedido;
	protected String status;
	protected String observacoes;


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
