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
		setRua(rua);
		setNumero(numero);
		setBairro(bairro);
		setCep(cep);
		setObservacoes(observacoes);
	}

	public String toString() {
		return getRua() + ", " + getNumero() + ", " + getBairro() + ", " + getCep() + ", obs: "
				+ getObservacoes();
	}

	public String getRua() {
		return rua;
	}
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public int getCep() {
		return cep;
	}
	
	public void setCep(int cep) {
		this.cep = cep;
	}
	
	public String getObservacoes() {
		return observacoes;
	}
	
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	
}
