package entities;
import abstraticEntities.Pessoa;


public class Advogados extends Pessoa {
  private Integer oabRegistro;
  private Endereco endereco;

  public Advogados(String nome, String CPF, String email, Integer oabRegistro, int numeroContato, Endereco endereco) {
    super(nome, CPF, email, numeroContato);
    this.oabRegistro = oabRegistro;
    this.endereco = endereco;

  }

  public Integer getOabRegistro() {
    return oabRegistro;
  }

  public void setOabRegistro(Integer oabRegistro) {
    this.oabRegistro = oabRegistro;
  }

}
