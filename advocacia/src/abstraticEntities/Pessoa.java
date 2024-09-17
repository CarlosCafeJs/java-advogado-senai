package abstraticEntities;

public abstract class Pessoa {
  private String nome;
  private String CPF;
  private String CNPJ;
  private String email;
  private String documento;
  private int numeroContato;

  public Pessoa(String nome, String cPF, String cNPJ, String email, String documento, int numeroContato) {
    this.nome = nome;
    this.CPF = cPF;
    this.CNPJ = cNPJ;
    this.email = email;
    this.numeroContato = numeroContato;
    this.documento = documento;
  }

  public Pessoa(String nome, String cPF, String email, int numeroContato) {
    this.nome = nome;
    this.CPF = cPF;
    this.email = email;
    this.numeroContato = numeroContato;
  }


  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCPF() {
    return CPF;
  }

  public void setCPF(String cPF) {
    CPF = cPF;
  }

  public String getCNPJ() {
    return CNPJ;
  }

  public void setCNPJ(String cNPJ) {
    CNPJ = cNPJ;
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

  public int getNumeroContato() {
    return numeroContato;
  }

  public void setNumeroContato(int numeroContato) {
    this.numeroContato = numeroContato;
  }

}
