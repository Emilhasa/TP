package modelo;

public class Bebida extends Produto {
    private int volumeBebida;

    public Bebida(String name, int volumeBebida, double valor) {
        this.nome = name;
        this.volumeBebida = volumeBebida;
        this.valor = valor;
    }

    public void editarBebida(String nome, int volumeBebida, double valor) {
        this.setNome(nome);
        this.setVolumeBebida(volumeBebida);
        this.setValor(valor);
    }

    public String toString() {
        return "*****Bebida*****\nnome: " + this.getNome() + "\nvolumeBebida: " + this.getVolumeBebida() + " ml\nvalor: R$" + this.getValor();
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getVolumeBebida() {
        return this.volumeBebida;
    }

    public void setVolumeBebida(int volumeBebida) {
        this.volumeBebida = volumeBebida;
    }
}