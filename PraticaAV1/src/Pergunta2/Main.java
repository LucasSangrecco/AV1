package Pergunta2;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

     String dataHoraPagamento;
     int numeroPagamento;
     double valorPago;
     String numCartaoC;
     String bandeiraCartao;
     String titularCartaoCredito;
     boolean comprovanteTransacaoPix;
     String numCartaoD;
     String titularCartaoDebito;

     CartaoCredito cc1 = new CartaoCredito("06/10/2022 21:36", 1, 1000, "123456789", "Visa", "João da Silva");
     JOptionPane.showMessageDialog(null, cc1.imprimirCupomFiscal(), "Mensagem", JOptionPane.DEFAULT_OPTION);
     Pix pix1 = new Pix("05/10/2022 19:20",2,2000, true);
     JOptionPane.showMessageDialog(null, pix1.imprimirCupomFiscal(), "Mensagem",JOptionPane.DEFAULT_OPTION);
     CartaoDebito cd1 = new CartaoDebito("04/10/2022 22:10", 3, 3000, "987654321", "João da Silva");
     JOptionPane.showMessageDialog(null, cd1.imprimirCupomFiscal(), "Mensagem", JOptionPane.DEFAULT_OPTION);

    }

}
