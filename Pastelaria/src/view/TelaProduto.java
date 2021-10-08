package view;

import controle.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class TelaProduto extends JPanel implements ActionListener, ListSelectionListener {
    private JLabel titulo;
    private JList<String> listaPasteis;
    private JList<String> listaBebidas;
    private JButton cadastrarP;
    private JButton refreshListP;
    private JButton cadastrarB;
    private JButton refreshListB;
    private String[] listaNomes = new String[10];
    private static ControleDados dados;

    public TelaProduto(ControleDados d, int op) {
        this.setLayout((LayoutManager)null);
        this.setBounds(0, 0, 800, 400);
        dados = d;
        switch(op) {
        case 1:
            this.ListP(dados);
            break;
        case 2:
            this.ListB(dados);
            break;
        default:
            JOptionPane.showMessageDialog((Component)null, "Opção não encontrada!", (String)null, 0);
        }

    }

    public void ListP(ControleDados dados) {
        this.listaNomes = new ControlePastel(dados).getNomePastel();
        this.listaPasteis = new JList<String>(listaNomes);
        
        this.titulo = new JLabel("Lista de Pasteis");
        this.titulo.setFont(new Font("Arial", 1, 20));
        this.cadastrarP = new JButton("Cadastrar");
        this.refreshListP = new JButton("Atualizar");
        
        this.titulo.setBounds(300, 10, 250, 30);
        this.cadastrarP.setBounds(100, 300, 100, 30);
        this.refreshListP.setBounds(575, 300, 100, 30);
        this.listaPasteis.setBounds(40, 50, 720, 220);
        
        this.listaPasteis.setSelectionMode(1);
        this.listaPasteis.setVisibleRowCount(10);
        
        this.add(this.titulo);
        this.add(this.listaPasteis);
        this.add(this.cadastrarP);
        this.add(this.refreshListP);
        
        this.cadastrarP.addActionListener(this);
        this.refreshListP.addActionListener(this);
        this.listaPasteis.addListSelectionListener(this);
    }

    public void ListB(ControleDados dados) {
        this.listaNomes = (new ControleBebida(dados)).getNomeBebida();
        this.listaBebidas = new JList<String>(listaNomes);
        
        this.titulo = new JLabel("Lista de Bebidas");
        this.titulo.setFont(new Font("Arial", 1, 20));
        this.cadastrarB = new JButton("Cadastrar");
        this.refreshListB = new JButton("Atualizar");
        
        this.titulo.setBounds(300, 10, 250, 30);
        this.cadastrarB.setBounds(100, 300, 100, 30);
        this.refreshListB.setBounds(575, 300, 100, 30);
        this.listaBebidas.setBounds(40, 50, 720, 220);
        
        this.listaBebidas.setSelectionMode(1);
        this.listaBebidas.setVisibleRowCount(10);
        
        this.add(this.titulo);
        this.add(this.listaBebidas);
        this.add(this.cadastrarB);
        this.add(this.refreshListB);
        
        this.cadastrarB.addActionListener(this);
        this.refreshListB.addActionListener(this);
        this.listaBebidas.addListSelectionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src == this.cadastrarP) {
            new TelaDetalheProduto(1, dados, 0);
        }

    }

    public void valueChanged(ListSelectionEvent e) {
    }
}