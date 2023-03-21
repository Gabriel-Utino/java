public class Curso extends Estudante {
  private String professor;
  private String diciplina;

  public Curso() {
  }

  public Curso(String professor, String diciplina, String name) {
    this.professor = professor;
    this.diciplina = diciplina;
  }

  public String getProfessor() {
    return professor;
  }

  public void setProfessor(String professor) {
    this.professor = professor;
  }

  public String getDiciplina() {
    return diciplina;
  }

  public void setDiciplina(String diciplina) {
    this.diciplina = diciplina;
  }

  public void whoProfessor() {
    System.out.println("professor :" + this.professor + "\nEstudante :" + this.getName());
  }
}
