package abstraticEntities;

import validations.EmailValidation;

public abstract class Pessoa {
  private String nome;
  private String cpf;
  private String cnpj;
  private String email;
  private String documento;
  private String numeroContato;

  public Pessoa(String nome, String cnpj, String email, String documento, String numeroContato) {
   
    this.nome = nome;
    this.cnpj = cnpj;
    this.email = email;
    this.numeroContato = numeroContato;
    this.documento = documento;
  }

  public Pessoa(String nome, String cpf, String email, String numeroContato) {
    this.nome = nome;
    this.cpf = cpf;
    if(EmailValidation.validar(email)){

      this.email = email;
    }else{
      System.out.println("Email não é valido! \nPor favor digite um E-mail valido!");
    }
    this.numeroContato = numeroContato;
  }


  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getDocumento() {
    return documento;
  }

  public void setDocumento(String documento) {
    this.documento = documento;
  }

  public String getNumeroContato() {
    return numeroContato;
  }

  public void setNumeroContato(String numeroContato) {
    this.numeroContato = numeroContato;
  }

}
