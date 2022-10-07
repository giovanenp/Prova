package br.com.pergunta2;

public class CartaoCredito extends Pagamento {
  private String numCartao;
  private String bandeiraCartao;
  private String titularCartao;

  public CartaoCredito(String dataHoraPagamento, int numeroPagamento, double valorPago, String numCartao, String bandeiraCartao, String titularCartao) {
    super(dataHoraPagamento, numeroPagamento, valorPago);
    this.numCartao = numCartao;
    this.bandeiraCartao = bandeiraCartao;
    this.titularCartao = titularCartao;
  }

  public String getNumCartao() {
    return numCartao;
  }

  public void setNumCartao(String numCartao) {
    this.numCartao = numCartao;
  }

  public String getBandeiraCartao() {
    return bandeiraCartao;
  }

  public void setBandeiraCartao(String bandeiraCartao) {
    this.bandeiraCartao = bandeiraCartao;
  }

  public String getTitularCartao() {
    return titularCartao;
  }

  public void setTitularCartao(String titularCartao) {
    this.titularCartao = titularCartao;
  }

  public String imprimirCupomFiscal() {
    return "Data/Hora pagamento: " + getDataHoraPagamento() + "\nNúmero do pagamento: " + getNumeroPagamento()
        + "\nValor Pago: " + getValorPago() + "\nNúmero do cartão:  " + this.numCartao + "\nBandeira: "
        + this.bandeiraCartao + "\nNome do titular: " + this.titularCartao;
  }

}
