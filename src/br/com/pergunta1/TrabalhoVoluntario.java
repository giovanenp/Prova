package br.com.pergunta1;

public class TrabalhoVoluntario extends Projeto {
  private String tipoTrabalho;
  private int duracaoTrabalho;

  public TrabalhoVoluntario(String nome, String descricao, String endereco, String datainicio, String datafim,
      String tipoTrabalho, int duracaoTrabalho) {
    super(nome, descricao, endereco, datainicio, datafim);
    this.tipoTrabalho = tipoTrabalho;
    this.duracaoTrabalho = duracaoTrabalho;
  }

  public String getTipoTrabalho() {
    return tipoTrabalho;
  }

  public void setTipoTrabalho(String tipoTrabalho) {
    this.tipoTrabalho = tipoTrabalho;
  }

  public int getDuracaoTrabalho() {
    return duracaoTrabalho;
  }

  public void setDuracaoTrabalho(int duracaoTrabalho) {
    this.duracaoTrabalho = duracaoTrabalho;
  }

  @Override
  public boolean validaProjeto() {
    if (this.duracaoTrabalho > 2) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public String imprimeProjeto() {
    return "Projeto: " + getNome() + "\nDescrição: " + getDescricao() + "\nData de inicio: " + getDatainicio() +  "\nData fim: " + getDatafim() + "\nTipo do trabalho: " + this.tipoTrabalho + "\nDuração: " + this.duracaoTrabalho;
  }

}
