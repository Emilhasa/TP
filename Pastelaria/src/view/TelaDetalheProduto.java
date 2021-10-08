package view;

import controle.ControleDados;
import controle.ControlePastel;
import java.awt.Component;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaDetalheProduto extends JFrame implements ActionListener {
    private JLabel nome = new JLabel("Nome: ");
    private JLabel ingredients = new JLabel("Ingredientes: ");
    private JLabel tPreparo = new JLabel("Tempo Preparo: ");
    private JLabel valor = new JLabel("Valor: ");
    private JLabel volume = new JLabel("Volume: ");
    private JTextField vNome;
    private JTextField vIngredients;
    private JTextField vTempo;
    private JTextField value;
    private JTextField size;
    private JButton delete = new JButton("Excluir");
    private JButton save = new JButton("Salvar");
    private String[] newdata = new String[8];
    private static ControleDados data;
    private static ControlePastel dadosP;
    private int pos;
    private int op;
    private String s;

    public TelaDetalheProduto(int op, ControleDados data, int pos) {
        this.op = op;
        TelaDetalheProduto.data = data;
        this.pos = pos;
        if (op == 1) {
            this.s = "Cadastro de Pastel";
        }

        if (op == 2) {
            this.s = "Cadastro de Bebida";
        }

        if (op == 3) {
            this.s = "Detalhe de Pastel";
        }

        if (op == 4) {
            this.s = "Detalhe de Bebida";
        }

        this.setTitle(this.s);
        
        if (op == 3) {
            this.DetalhePastel();
        } else if (op == 4) {
            this.DetalheBebida();
        } else {
            this.vNome = new JTextField(200);
            this.vIngredients = new JTextField(200);
            this.vTempo = new JTextField(200);
            this.value = new JTextField(200);
            this.size = new JTextField(200);
            this.save.setBounds(245, 175, 115, 30);
        }

        this.nome.setBounds(30, 20, 150, 25);
        this.ingredients.setBounds(30, 50, 150, 25);
        this.volume.setBounds(30, 50, 150, 25);
        this.valor.setBounds(30, 80, 150, 25);
        this.tPreparo.setBounds(30, 110, 150, 25);
        this.vNome.setBounds(180, 20, 180, 25);
        this.vIngredients.setBounds(180, 50, 180, 25);
        this.size.setBounds(180, 50, 180, 25);
        this.value.setBounds(180, 80, 180, 25);
        this.vTempo.setBounds(180, 110, 180, 25);
        
        if (op == 1 || op == 3) {
            this.add(this.ingredients);
            this.add(this.tPreparo);
            this.add(this.vIngredients);
            this.add(this.vTempo);
        }

        if (op == 2 || op == 4) {
            this.add(this.volume);
            this.add(this.size);
        }

        if (op == 3 || op == 4) {
            this.save.setBounds(120, 175, 115, 30);
            this.delete.setBounds(245, 175, 115, 30);
            this.add(this.delete);
        }

        this.add(this.nome);
        this.add(this.vNome);
        this.add(this.valor);
        this.add(this.value);
        this.add(this.save);
        
        this.setLayout((LayoutManager)null);
        this.setSize(400, 250);
        this.setVisible(true);
        this.setLocationRelativeTo((Component)null);
        
        this.save.addActionListener(this);
        this.delete.addActionListener(this);
    }

    public void DetalhePastel() {
        this.vNome = new JTextField(data.getPastel()[this.pos].getNome(), 200);
        this.vIngredients = new JTextField(data.getPastel()[this.pos].getIngredientes(), 200);
        this.vTempo = new JTextField(String.valueOf(data.getPastel()[this.pos].getTempoPreparo()), 200);
        this.value = new JTextField(String.valueOf(data.getPastel()[this.pos].getValor()), 200);
        this.size = new JTextField(200);
    }

    public void DetalheBebida() {
        this.vNome = new JTextField(data.getBebida()[this.pos].getNome(), 200);
        this.value = new JTextField(String.valueOf(data.getBebida()[this.pos].getValor()), 200);
        this.size = new JTextField(String.valueOf(data.getBebida()[this.pos].getVolumeBebida()), 200);
        this.vIngredients = new JTextField(200);
        this.vTempo = new JTextField(200);
    }

    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src == this.save) {
            /*try {
                if (this.op == 1) {
                    this.newdata[0] = Integer.toString(data.getQtdPasteis());
                } else if (this.op == 2) {
                    this.newdata[0] = Integer.toString(data.getQtdBebidas());
                } else {
                    this.newdata[0] = Integer.toString(this.pos);
                }

                this.newdata[1] = this.vNome.getText();
                this.newdata[4] = this.value.getText();
                if (this.op == 1 || this.op == 3) {
                    this.newdata[2] = this.vIngredients.getText();
                    this.newdata[3] = this.vTempo.getText();
                    
                }
            } catch (NullPointerException ) {
            }*/
        }

    }
}