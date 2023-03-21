public class Aluno extends Pessoa {
  private String matri;
  private double nota_P1;
  private double nota_P2;
  private int falta;

  public Aluno() {
  }

  public Aluno(String name, String ende, String cpf, String rg, String matri, double nota1, double nota2, int falta) {
    super(name, ende, cpf, rg);
    this.matri = matri;
    this.nota_P1 = nota1;
    this.nota_P2 = nota2;
    this.falta = falta;
  }

  public String getMatri() {
    return matri;
  }

  public void setMatri(String matri) {
    this.matri = matri;
  }

  public double getNota_P1() {
    return nota_P1;
  }

  public void setNota_P1(double nota_P1) {
    this.nota_P1 = nota_P1;
  }

  public double getNota_P2() {
    return nota_P2;
  }

  public void setNota_P2(double nota_P2) {
    this.nota_P2 = nota_P2;
  }

  public int getFalta() {
    return falta;
  }

  public void setFalta(int falta) {
    this.falta = falta;
  }

  public boolean ImprimeFaltas() {
    if (this.falta <= 10) {
      return true;
    } else {
      return false;
    }
  }

  public double media() {
    return ((this.nota_P1 + this.nota_P2) / 2);
  }

  // public void media_de_aprvacao() {
  // if (this.media() >= 7) {
  // System.out.println("Aprovado");
  // }
  // }
  //
  // public void media_de_reprovacao() {
  // if (this.media() < 3) {
  // System.out.println("Reprovado");
  // }
  // }

  public void result() {
    if (ImprimeFaltas()) {
      if (this.media() >= 7) {
        System.out.println("Aprovado\n");
      } else if (this.media() < 3) {
        System.out.println("Reprovado\n");
      } else {
        System.out.println("Reavaliação\n");
      }
    } else {
      System.out.println("Reprovado\n");
    }
  }

  public void imprimeAluno() {
    ImprimePessoa();
    System.out.println("Falta total :" + this.falta);
    result();
  }
}