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

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public int getMatricula() {
    return matricula;
  }

  public void setMatricula(int matricula) {
    this.matricula = matricula;
  }

  public double getNota_ap() {
    return nota_ap;
  }

  public void setNota_ap(double nota_ap) {
    this.nota_ap = nota_ap;
  }

  public double getNota_semestre() {
    return nota_semestre;
  }

  public void setNota_semestre(double nota_semestre) {
    this.nota_semestre = nota_semestre;
  }

  public double getNota_exam() {
    return nota_exam;
  }

  public void setNota_exam(double nota_exam) {
    this.nota_exam = nota_exam;
  }

  public int getTotal_faltas() {
    return total_faltas;
  }

  public void setTotal_faltas(int total_faltas) {
    this.total_faltas = total_faltas;
  }

  
}
