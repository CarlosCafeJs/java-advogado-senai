public abstract class Pessoa {
  private String nome;
  private String CPF;
  private String CNPJ;
  private String email;
  private String documento;

  public Pessoa(String nome, String cPF, String cNPJ, String email, String documento, String numeroContato) {
    this.nome = nome;
    this.CPF = cPF;
    this.CNPJ = cNPJ;
    this.email = email;
    this.numeroContato = numeroContato;
    this.documento = documento;
  }

  public Pessoa(String nome, String cPF, String email, String numeroContato) {
    this.nome = nome;
    this.CPF = cPF;
    this.email = email;
    this.numeroContato = numeroContato;
  }

  private String numeroContato;

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

  public String getNumeroContato() {
    return numeroContato;
  }

  public void setNumeroContato(String numeroContato) {
    this.numeroContato = numeroContato;
  }

}
