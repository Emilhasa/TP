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
		setNome(name);
		setIngredientes(ingredientes);
		setTempoPreparo(tempoPreparo);
		setValor(valor);
	}

	public String toString() {
		return "*****Pastel***** \nnome: " + getNome() + "\ningredientes: " + getIngredientes() + "\ntempoPreparo:" + getTempoPreparo() + " min\nvalor: R$"
				+ getValor();
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

	
	public String getIngredientes() {
		return ingredientes;
	}


	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}


	public int getTempoPreparo() {
		return tempoPreparo;
	}


	public void setTempoPreparo(int tempoPreparo) {
		this.tempoPreparo = tempoPreparo;
	}
	
	
		
}
