package modelo;

public class Venda {
    private PedidoLocal pedidoLocal;
    private PedidoDelivery pDelivery;
    private String formaPagamento;
    private double valor;

    public Venda(String formaPagamento, PedidoDelivery pedidoDelivery) {
        this.formaPagamento = formaPagamento;
        this.pDelivery = pedidoDelivery;
        pedidoDelivery.setStatus("Saiu para entrega");

        int i;
        for(i = 0; i < pedidoDelivery.getPastel().size(); ++i) {
            this.valor += ((Pastel)pedidoDelivery.getPastel().get(i)).getValor();
        }

        for(i = 0; i < pedidoDelivery.getBebida().size(); ++i) {
            this.valor += ((Bebida)pedidoDelivery.getBebida().get(i)).getValor();
        }

    }

    public Venda(String formaPagamento, PedidoLocal pedidoLocal) {
        this.formaPagamento = formaPagamento;
        this.pedidoLocal = pedidoLocal;
        pedidoLocal.setStatus("Finalizado");

        int i;
        for(i = 0; i < pedidoLocal.getPastel().size(); ++i) {
            this.valor += ((Pastel)pedidoLocal.getPastel().get(i)).getValor();
        }

        for(i = 0; i < pedidoLocal.getBebida().size(); ++i) {
            this.valor += ((Bebida)pedidoLocal.getBebida().get(i)).getValor();
        }

    }

    public String toString() {
        PedidoLocal var10000 = this.getPedidoLocal();
        return "\n\t****Venda****\n\n" + var10000 + "\n" + this.getPDelivery() + "\nFormaPagamento:" + this.getFormaPagamento() + "\nValor Total:" + this.getValor();
    }

    public PedidoLocal getPedidoLocal() {
        return this.pedidoLocal;
    }

    public void setPedidoLocal(PedidoLocal pedidoLocal) {
        this.pedidoLocal = pedidoLocal;
    }

    public PedidoDelivery getPDelivery() {
        return this.pDelivery;
    }

    public void setPeDelivery(PedidoDelivery pedidoDelivery) {
        this.pDelivery = pedidoDelivery;
    }

    public String getFormaPagamento() {
        return this.formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}