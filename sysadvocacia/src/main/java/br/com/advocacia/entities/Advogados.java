package br.com.advocacia.entities;

import br.com.advocacia.abstraticEntities.Pessoa;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Advogados extends Pessoa {

  private Integer oabRegistro;

  private Endereco endereco;

  public Advogados(String nome, String CPF, String email, Integer oabRegistro, String numeroContato,
      Endereco endereco) {
    super(nome, CPF, email, numeroContato);
    this.oabRegistro = oabRegistro;
    this.endereco = endereco;

  }

  @Override
  public String toString() {
    return "Nome: " + getNome() + "\n" +
        ", CPF: " + getCpf() + "\n" +
        ", Email: " + getEmail() + "\n" +
        ", Registro OAB: " + oabRegistro + "\n" +
        ", Número para contato: " + getNumeroContato() + "\n" +
        ", Endereço: " + endereco + "\n";
  }

  // public Integer getOabRegistro() {
  // return oabRegistro;
  // }

  // public void setOabRegistro(Integer oabRegistro) {
  // this.oabRegistro = oabRegistro;
  // }

  // public Endereco getEndereco() {
  // return endereco;
  // }

  // public void setEndereco(Endereco endereco) {
  // this.endereco = endereco;
  // }

}
