package controle;

import modelo.*;


public class ControleDados {
    private Dados d = new Dados();

    public ControleDados() {
        this.d.SomeData();
    }

    public Dados getDados() {
        return this.d;
    }

    public void setDados(Dados d) {
        this.d = d;
    }

    public Pastel[] getPastel() {
        return this.d.getPasteis();
    }

    public Bebida[] getBebida() {
        return this.d.getBebidas();
    }

    public int getQtdPasteis() {
        return this.d.getQtdPasteis();
    }

    public int getQtdBebidas() {
        return this.d.getQtdBebidas();
    }
}
