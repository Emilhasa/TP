package pastelaria;

//import java.util.*;

public class Teste {
	static Pastel p1;
	static Bebida b1;
	static PedidoLocal peL;
	static PedidoDelivery peD;
	static Endereco e;
	static Venda v1, v2;
	
	public static void main(String[] args) {
		p1 = new Pastel("Carne", "Massa, Carne-moida, cebola, pimentão", 10, 4.99);
		b1 = new Bebida("Coca-Cola", 310, 3.99);
		
		System.out.println(p1.toString()+"\n");
		
		peL = new PedidoLocal("Ocupada", 3);
		peL.adicionarPastel(p1);
		peL.adicionarBebida(b1);
		
		p1.editarPastel("Queijo", "Massa, Queijo meia-cura", 9, 4.99);
		b1.editarBebida("Guarana", 310, 3.49);
		
		e = new Endereco("St Leste Projeção A", 0, "Gama", 72444240, null);
		
		peD = new PedidoDelivery(e, "Emilio", 619999999, "Lucio");
		peD.adicionarPastel(p1);
		peD.adicionarBebida(b1);
		
		v1 = new Venda("PIX", peL);
		v2 = new Venda("Cartão Credito", peD);
		
		System.out.println(p1.toString() + "\n");
		System.out.println(b1.toString() + "\n");
		System.out.println(peL.toString());
		System.out.println(peD.toString());
		System.out.println(e.toString());
		System.out.println(v1.toString());
		System.out.println(v2.toString());
		

	}
}
