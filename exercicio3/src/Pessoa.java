public class Pessoa {
  private String nome;
  private int idade;
  private String email;

  public Pessoa(String nome, int idade, String email) {
      this.nome = nome;
      this.idade = idade;
      this.email = email;
  }

  public Pessoa(String nome, int idade) {
      this.nome = nome;
      this.idade = idade;
  }

  public Pessoa(String nome) {
    this.nome = nome;
  }

  public Pessoa() {
  }

  public String getNome() {
      return nome;
  }

  public void setNome(String nome) {
      this.nome = nome;
  }

  public int getIdade() {
      return idade;
  }

  public void setIdade(int idade) {
      this.idade = idade;
  }

  public String getEmail() {
      return email;
  }

  public void setEmail(String email) {
      this.email = email;
  }

 
 
  public void imprime ()
  {
      System.out.println(nome);
      System.out.println(idade);
      System.out.println(email);
  }
}
