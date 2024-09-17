package entities; 

public class Endereco {
  private String uf;
  private String cidade;
  private String endereco;
  private int numero;

  public String getUf() {
    return uf;
  }
  public void setUf(String uf) {
    this.uf = uf;
  }
  public String getCidade() {
    return cidade;
  }
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }
  public String getEndereco() {
    return endereco;
  }
  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }
  public int getNumero() {
    return numero;
  }
  public void setNumero(int numero) {
    this.numero = numero;
  }

}
