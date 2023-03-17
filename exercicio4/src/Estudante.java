public class Estudante {
  private String name;
  private String endereco;
  private int matricula;
  private double nota_ap;
  private double nota_semestre;
  private double nota_exam;
  private int total_faltas;
  
  public Estudante(
    String name,
    String endereco,
    int matricula,
    double nota_ap,
    double nota_semestre,
    double nota_exam,
    int total_faltas) {
      this.name = name;
      this.endereco = endereco;
      this.matricula = matricula;
      this.nota_ap = nota_ap;
      this.nota_semestre = nota_semestre;
      this.nota_exam = nota_exam;
  }

  public Estudante() {
  }

  
}
