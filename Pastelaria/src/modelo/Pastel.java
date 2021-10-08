package modelo;

public class Pastel extends Produto {
    private String ingredientes;
    private int tempoPreparo;

    public Pastel(String nome, String ingredientes, int tempoPreparo, double valor) {
        this.nome = nome;
        this.ingredientes = ingredientes;
        this.tempoPreparo = tempoPreparo;
        this.valor = valor;
    }

    public void editarPastel(String name, String ingredientes, int tempoPreparo, double valor) {
        this.setNome(name);
        this.setIngredientes(ingredientes);
        this.setTempoPreparo(tempoPreparo);
        this.setValor(valor);
    }

    public String toString() {
        return "*****Pastel***** \nnome: " + this.getNome() + "\ningredientes: " + this.getIngredientes() + "\ntempoPreparo:" + this.getTempoPreparo() + " min\nvalor: R$" + this.getValor();
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

    public String getIngredientes() {
        return this.ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int getTempoPreparo() {
        return this.tempoPreparo;
    }

    public void setTempoPreparo(int tempoPreparo) {
        this.tempoPreparo = tempoPreparo;
    }
}