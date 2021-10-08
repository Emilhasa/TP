package modelo;

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
        this.data = new Date();
        this.numeroPedido = this.getNumeroPedido();
        this.setNumeroPedido(this.numeroPedido + 1);
        this.endereco = endereco;
        this.nome = nome;
        this.telefone = telefone;
        this.nomeEntregador = nomeEntregador;
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
        return "\n*****Pedido Delivery*****\n\n" + this.getPastel() + "\n\n" + this.getBebida() + "\nendereco: " + this.getEndereco() + "\nnome: " + this.getNome() + "\ntelefone: " + this.getTelefone() + "\nnome entregador: " + this.getNomeEntregador() + "\n\ndata/hora: " + this.getData() + "\nnumero pedido:" + this.getNumeroPedido() + ", status: " + this.getStatus() + "\nobs:" + this.getObservacoes();
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

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return this.telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getNomeEntregador() {
        return this.nomeEntregador;
    }

    public void setNomeEntregador(String nomeEntregador) {
        this.nomeEntregador = nomeEntregador;
    }

    public int getTempoEntrega() {
        return this.tempoEntrega;
    }

    public void setTempoEntrega(int tempoEntrega) {
        this.tempoEntrega = tempoEntrega;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return this.endereco;
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