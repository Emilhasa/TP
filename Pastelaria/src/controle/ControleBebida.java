package controle;

import modelo.*;

public class ControleBebida {
    private Bebida[] b;
    private int qtdBebida;

    public ControleBebida(ControleDados d) {
        this.b = d.getBebida();
        this.qtdBebida = d.getQtdBebidas();
    }

    public String[] getNomeBebida() {
        String[] s = new String[this.qtdBebida];

        for(int i = 0; i < this.qtdBebida; ++i) {
            s[i] = this.b[i].getNome();
        }

        return s;
    }

    public int getQtd() {
        return this.qtdBebida;
    }

    public void setQtd(int qtd) {
        this.qtdBebida = qtd;
    }

    public String getNome(int i) {
        return this.b[i].getNome();
    }

    public double getValor(int i) {
        return this.b[i].getValor();
    }

    public int getVolume(int i) {
        return this.b[i].getVolumeBebida();
    }
}