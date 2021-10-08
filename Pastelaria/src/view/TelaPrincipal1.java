package view;

import controle.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class TelaPrincipal1 extends JFrame implements ActionListener {
    private JPanel toolBar;
    private JPanel secondPanel;
    private static JButton pLocal;
    private static JButton pDeli;
    private static JButton venda;
    private static JButton pastel;
    private static JButton bebida;
    private JLabel vendas;
    private JLabel produtos;
    private ControleDados data = new ControleDados();

    public TelaPrincipal1() {
        this.configFrame();
        this.configToolBar();
        this.configSecPanel();
        
        this.add(this.toolBar);
        this.add(this.secondPanel);
    }

    public void configFrame() {
        this.setTitle("Pastelaria");
        this.setSize(new Dimension(800, 505));
        this.setLayout((LayoutManager)null);
        this.setLocationRelativeTo((Component)null);
        this.setDefaultCloseOperation(3);
    }

    public void configToolBar() {
        this.toolBar = new JPanel();
        this.toolBar.setLayout((LayoutManager)null);
        
        this.toolBar.setBounds(0, 0, 800, 105);
        this.toolBar.setBackground(Color.white);
        
        pLocal = new JButton();
        pDeli = new JButton();
        venda = new JButton("Venda");
        pastel = new JButton("Pasteis");
        bebida = new JButton("Bebidas");
        
        pLocal.setText("<html>Pedido<br>Local</html>");
        pDeli.setText("<html>Pedido<br>Delivery</html>");
        
        this.vendas = new JLabel("Vendas");
        this.produtos = new JLabel("Produtos");
        
        pLocal.setBounds(0, 0, 100, 90);
        pDeli.setBounds(100, 0, 100, 90);
        venda.setBounds(200, 0, 100, 90);
        pastel.setBounds(305, 0, 100, 90);
        bebida.setBounds(405, 0, 100, 90);
        
        this.vendas.setBounds(140, 90, 300, 15);
        this.produtos.setBounds(375, 90, 200, 15);
        
        this.toolBar.add(pLocal);
        this.toolBar.add(pDeli);
        this.toolBar.add(venda);
        this.toolBar.add(pastel);
        this.toolBar.add(bebida);
        this.toolBar.add(this.vendas);
        this.toolBar.add(this.produtos);
    }

    public void configSecPanel() {
        this.secondPanel = new JPanel();
        this.secondPanel.setLayout((LayoutManager)null);
        this.secondPanel.setBounds(0, 105, 800, 400);
        this.secondPanel.setBackground(Color.gray);
    }

    public static void main(String[] args) {
        TelaPrincipal t = new TelaPrincipal();
        t.setVisible(true);
        
        pLocal.addActionListener(t);
        pDeli.addActionListener(t);
        venda.addActionListener(t);
        pastel.addActionListener(t);
        bebida.addActionListener(t);
    }

    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        
        if (src == pastel) 
			ShowPanel(new TelaProduto(data, 1));
        
		if (src == bebida)
			ShowPanel(new TelaProduto(data, 2));
    }

    private void ShowPanel(JPanel p) {
        p.setLocation(0, 0);
        this.secondPanel.removeAll();
        this.secondPanel.add(p, "Center");
        this.secondPanel.revalidate();
        this.secondPanel.repaint();
    }
}