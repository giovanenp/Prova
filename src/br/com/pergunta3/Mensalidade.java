package br.com.pergunta3;

public class Mensalidade {
  private double valorMensalidade;
  private int numeroIrmaos;

  public Mensalidade(double valorMensalidade, int numeroIrmaos) {
    this.valorMensalidade = valorMensalidade;
    this.numeroIrmaos = numeroIrmaos;
  }

  public double calculaMensalidade() {
    if (this.numeroIrmaos == 1) {
      return this.valorMensalidade -= (this.valorMensalidade * 0.05);
    } else if (this.numeroIrmaos == 2) {
      return this.valorMensalidade -= (this.valorMensalidade * 0.1);
    } else if (this.numeroIrmaos > 2) {
      return this.valorMensalidade -= (this.valorMensalidade * 0.15);
    } else {
      return this.valorMensalidade;
    }
  }

}
