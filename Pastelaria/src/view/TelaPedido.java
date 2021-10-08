package view;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JPanel;

public class TelaPedido extends JPanel {
    private JButton addProduto;
    private JButton editPedido;

    public TelaPedido() {
        this.setLayout((LayoutManager)null);
        this.setBounds(0, 0, 800, 400);
        
        this.addProduto = new JButton("Adicionar");
        this.editPedido = new JButton("Editar");
        this.addProduto.setBounds(100, 10, 150, 50);
        this.editPedido.setBounds(450, 10, 150, 50);
        
        this.add(this.addProduto);
        this.add(this.editPedido);
    }
}