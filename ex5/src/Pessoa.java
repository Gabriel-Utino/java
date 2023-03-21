public class Pessoa {
  private String name;
  private String ende;
  private String cpf;
  private String rg;

  public Pessoa() {
  }

  public Pessoa(String name, String ende, String cpf, String rg) {
    this.name = name;
    this.ende = ende;
    this.cpf = cpf;
    this.rg = rg;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEnde() {
    return ende;
  }

  public void setEnde(String ende) {
    this.ende = ende;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getRg() {
    return rg;
  }

  public void setRg(String rg) {
    this.rg = rg;
  }

  public void ImprimePessoa() {
    System.out.println("Nome :" + this.name + "\nEndereco :" + this.ende + "CPF :" + this.cpf + "  RG :" + this.rg);
  }
}