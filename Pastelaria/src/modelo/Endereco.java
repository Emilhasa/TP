package modelo;

public class Endereco {
    private String rua;
    private int numero;
    private String bairro;
    private int cep;
    private String observacoes;

    public Endereco(String rua, int numero, String bairro, int cep, String observacoes) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;
        this.observacoes = observacoes;
    }

    public void editarEndereco(String rua, int numero, String bairro, int cep, String observacoes) {
        this.setRua(rua);
        this.setNumero(numero);
        this.setBairro(bairro);
        this.setCep(cep);
        this.setObservacoes(observacoes);
    }

    public String toString() {
        return this.getRua() + ", " + this.getNumero() + ", " + this.getBairro() + ", " + this.getCep() + ", obs: " + this.getObservacoes();
    }

    public String getRua() {
        return this.rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return this.bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getCep() {
        return this.cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getObservacoes() {
        return this.observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}