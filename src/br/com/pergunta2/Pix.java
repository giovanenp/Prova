package br.com.pergunta2;

public class Pix extends Pagamento{
  private boolean comprovanteTransacaoPix;

  public Pix(String dataHoraPagamento, int numeroPagamento, double valorPago, boolean comprovanteTransacaoPix) {
    super(dataHoraPagamento, numeroPagamento, valorPago);
    this.comprovanteTransacaoPix = comprovanteTransacaoPix;
  }

  public boolean isComprovanteTransacaoPix() {
    return comprovanteTransacaoPix;
  }

  public void setComprovanteTransacaoPix(boolean comprovanteTransacaoPix) {
    this.comprovanteTransacaoPix = comprovanteTransacaoPix;
  }
  
  public String imprimirCupomFiscal() {
    return "Data/Hora pagamento: " + getDataHoraPagamento() + "\nNúmero do pagamento: " + getNumeroPagamento() + "\nValor Pago: " + getValorPago() + "\nSucesso na transação? " + this.comprovanteTransacaoPix;
  }
}
