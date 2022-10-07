package Pergunta3;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        Mensalidade m1 = new Mensalidade(1000, 1);
        JOptionPane.showMessageDialog(null, m1.calculaMensalidade(), "Mensagem", JOptionPane.DEFAULT_OPTION);

        Mensalidade m2 = new Mensalidade(1000, 2);
        JOptionPane.showMessageDialog(null, m2.calculaMensalidade(), "Mensagem", JOptionPane.DEFAULT_OPTION);

        Mensalidade m3 = new Mensalidade(1000, 3);
        JOptionPane.showMessageDialog(null, m3.calculaMensalidade(), "Mensagem", JOptionPane.DEFAULT_OPTION);

        Mensalidade m4 = new Mensalidade(1000, 0);
        JOptionPane.showMessageDialog(null, m4.calculaMensalidade(), "Mensagem", JOptionPane.DEFAULT_OPTION);
    }
}
