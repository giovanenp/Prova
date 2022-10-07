package br.com.pergunta2;

import javax.swing.JOptionPane;

public class Main {
  public static void main(String[] args) {
    Pix pix = new Pix("06/10/2022 20:50", 1234567890, 17250.50, true);
    JOptionPane.showMessageDialog(null, pix.imprimirCupomFiscal(), "Detalhes da Transação", JOptionPane.INFORMATION_MESSAGE);

    CartaoCredito cartaoCredito = new CartaoCredito("06/10/2022 20:57", 123412340, 123456.54, "000000000000001", "Master", "Giovane Santos");
    JOptionPane.showMessageDialog(null, cartaoCredito.imprimirCupomFiscal(), "Detalhes da Transação", JOptionPane.INFORMATION_MESSAGE);
  }
}
