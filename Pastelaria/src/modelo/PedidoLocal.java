package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PedidoLocal extends Pedido {
    private List<Pastel> pastel = new ArrayList<>();
    private List<Bebida> bebida = new ArrayList<>();
    private String statusMesa;
    private int numeroMesa;

    public PedidoLocal() {
    }

    public PedidoLocal(String statusMesa, int numeroMesa) {
        this.data = new Date();
        this.numeroPedido = this.getNumeroPedido();
        this.setNumeroPedido(this.numeroPedido + 1);
        this.statusMesa = statusMesa;
        this.numeroMesa = numeroMesa;
    }

    public void adicionarPastel(Pastel p) {
        this.pastel.add(p);
    }

    public void removerPastel(int i) {
        this.pastel.remove(i);
    }

    public void adicionarBebida(Bebida b) {
        this.bebida.add(b);
    }

    public void removerBebida(int i) {
        this.bebida.remove(i);
    }

    public void editarPedido(String a, Pastel p, int i) {
        switch(a) {
		    case "adicionar":
		        this.adicionarPastel(p);
		        break;
		    default:
		        this.removerPastel(i);
        }
    }
    

    public void editarPedido(String a, Bebida b, int i) {
    	switch(a) {
            case "adicionar":
                this.adicionarBebida(b);
                break;
            default:
                this.removerBebida(i);
        }    
    }

    public String toString() {
        return "*****Pedido Local*****\n\n" + this.getNumeroPedido() + "\n\n" + this.getBebida() + "\nstatus mesa: " + this.getStatusMesa() + "\nnumero mesa: " + this.getNumeroMesa() + "\n\ndata/hora: " + this.getData() + "\nnumero pedido: " + this.getNumeroPedido() + ", status: " + this.getStatus() + ", observacoes: " + this.getObservacoes() + "]";
    }

    public List<Pastel> getPastel() {
        return this.pastel;
    }

    public void setPastel(List<Pastel> pastel) {
        this.pastel = pastel;
    }

    public List<Bebida> getBebida() {
        return this.bebida;
    }

    public void setBebida(List<Bebida> bebida) {
        this.bebida = bebida;
    }

    public String getStatusMesa() {
        return this.statusMesa;
    }

    public void setStatusMesa(String statusMesa) {
        this.statusMesa = statusMesa;
    }

    public int getNumeroMesa() {
        return this.numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public Date getData() {
        return this.data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getHora() {
        return this.hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getNumeroPedido() {
        return this.numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getObservacoes() {
        return this.observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}