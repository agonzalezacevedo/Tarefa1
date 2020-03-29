package tarefa1;

import javax.swing.*;

public class Ventana {

    JFrame ventana;
    JPanel panel;
    JButton premer, limpar;
    JTextField datoN, datoP;
    JLabel nome, password;
    JTextArea areaT;

    public Ventana() {
        ventana = new JFrame(" Componentes ");
        
        
        ventana.setSize(800, 500);
        panel = new JPanel();
        panel.setSize(800, 500);
        premer = new JButton(" PREMER ");
        limpar = new JButton(" LIMPAR ");
        areaT = new JTextArea(10,30);
        
        nome = new JLabel("NOME");
        password = new JLabel("PASSWORD");
        datoP = new JTextField(20);
        datoN = new JTextField(20);
        
        panel.add(nome);
        panel.add(datoN);
        panel.add(password);
        panel.add(datoP);
        panel.add(areaT);
        panel.add(premer);
        panel.add(limpar);
        areaT.setText("Area de texto.");
        
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.add(panel);
        ventana.setVisible(true);

    }
}
