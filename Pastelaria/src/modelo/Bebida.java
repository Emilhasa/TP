package modelo;

public class Bebida extends Produto{
	private int volumeBebida;
	
	
	public Bebida(String name, int volumeBebida, double valor) {
		this.nome = name;
		this.volumeBebida = volumeBebida;
		this.valor = valor;
	}
	
	public void editarBebida(String nome, int volumeBebida, double valor) {
		setNome(nome);
		setVolumeBebida(volumeBebida);
		setValor(valor);		
	}

	public String toString() {
		return "*****Bebida*****\nnome: " + getNome() + "\nvolumeBebida: " + getVolumeBebida() + " ml\nvalor: R$" + getValor();
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getVolumeBebida() {
		return volumeBebida;
	}

	public void setVolumeBebida(int volumeBebida) {
		this.volumeBebida = volumeBebida;
	}
	
	

}
