package controle;

import modelo.*;

public class ControlePastel {
    private Pastel[] p;
    private int qtdPasteis;
    private ControleDados d;

    public ControlePastel(ControleDados d) {
        this.p = d.getPastel();
        this.qtdPasteis = d.getQtdPasteis();
        this.d = d;
    }

    public String[] getNomePastel() {
        String[] s = new String[this.qtdPasteis];

        for(int i = 0; i < this.qtdPasteis; ++i) {
            s[i] = this.p[i].getNome();
        }

        return s;
    }

    public String[] getIngredientesP() {
        String[] s = new String[this.qtdPasteis];

        for(int i = 0; i < this.qtdPasteis; ++i) {
            s[i] = this.p[i].getIngredientes();
        }

        return s;
    }

    public int[] getTempo() {
        int[] s = new int[this.qtdPasteis];

        for(int i = 0; i < this.qtdPasteis; ++i) {
            s[i] = this.p[i].getTempoPreparo();
        }

        return s;
    }

    public double[] getValue() {
        double[] s = new double[this.qtdPasteis];

        for(int i = 0; i < this.qtdPasteis; ++i) {
            s[i] = this.p[i].getValor();
        }

        return s;
    }

    public int getQtd() {
        return this.qtdPasteis;
    }

    public void setQtd(int qtd) {
        this.qtdPasteis = qtd;
    }

    public String getNome(int i) {
        return this.p[i].getNome();
    }

    public double getValor(int i) {
        return this.p[i].getValor();
    }

    public String getIngredientes(int i) {
        return this.p[i].getIngredientes();
    }

    public int getTempoPreparo(int i) {
        return this.p[i].getTempoPreparo();
    }

    public boolean inserirEditarPastel(String[] dadosPastel) {
        if (dadosPastel[3].matches("[0-9]+") && dadosPastel[4].matches("[0-9]+")) {
            new Pastel(dadosPastel[1], dadosPastel[2], Integer.parseInt(dadosPastel[3]), Double.parseDouble(dadosPastel[4]));
            return true;
        } else {
            return false;
        }
    }
}