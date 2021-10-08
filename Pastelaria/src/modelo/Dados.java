package modelo;

public class Dados {
    private Pastel[] pasteis = new Pastel[10];
    private int qtdPasteis;
    private Bebida[] bebidas = new Bebida[10];
    private int qtdBebidas;

    public Dados() {
    }

    public void SomeData() {
        this.pasteis[0] = new Pastel("Carne com Queijo", "Carne Moida, Pimentão, Queijo Meia-Cura", 10, 4.99D);
        this.pasteis[1] = new Pastel("Frango com Queijo", "Frango Desfiado, milho, Queijo Meia-Cura", 12, 4.99D);
        this.pasteis[2] = new Pastel("Presunto e Queijo", "Presunto, Oregano, Queijo Meia-Cura", 10, 4.99D);
        this.pasteis[3] = new Pastel("Calabresa com Queijo", "Calabresa picada, Queijo Meia-Cura", 10, 4.99D);
        this.pasteis[4] = new Pastel("Queijo", "Queijo Mussarela, Queijo Meia-Cura", 8, 4.99D);
        this.pasteis[5] = new Pastel("Tomate Seco com Queijo", "Tomate Seco, Queijo Meia-Cura", 10, 4.99D);
        
        this.bebidas[0] = new Bebida("Coca-Cola", 350, 3.99D);
        this.bebidas[1] = new Bebida("Fanta Laranja", 350, 3.49D);
        this.bebidas[2] = new Bebida("Fanta Guarana", 350, 3.49D);
        this.bebidas[3] = new Bebida("Fanta Uva", 350, 3.49D);
        this.bebidas[4] = new Bebida("Guarana Antarctica", 350, 2.99D);
        
        this.qtdPasteis = 6;
        this.qtdBebidas = 4;
    }

    public Pastel[] getPasteis() {
        return this.pasteis;
    }

    public void setPasteis(Pastel[] pasteis) {
        this.pasteis = pasteis;
    }

    public int getQtdPasteis() {
        return this.qtdPasteis;
    }

    public void setQtdPasteis(int qtdPasteis) {
        this.qtdPasteis = qtdPasteis;
    }

    public Bebida[] getBebidas() {
        return this.bebidas;
    }

    public void setBebidas(Bebida[] bebidas) {
        this.bebidas = bebidas;
    }

    public int getQtdBebidas() {
        return this.qtdBebidas;
    }

    public void setQtdBebidas(int qtdBebidas) {
        this.qtdBebidas = qtdBebidas;
    }

    public void inserirEditarPastel(Pastel p, int pos) {
        this.pasteis[pos] = p;
        
        if (pos == this.qtdPasteis) {
            ++this.qtdPasteis;
        }
    }

    public void inserirEditarBebida(Bebida b, int pos) {
        this.bebidas[pos] = b;
        
        if (pos == this.qtdBebidas) {
            ++this.qtdBebidas;
        }
    }
}