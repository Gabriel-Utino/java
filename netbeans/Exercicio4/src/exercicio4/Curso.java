
package exercicio4;

public class Curso {
    private int cod_curso;
    private String desc_curso;
    private int duracao_semestre;

    public Curso() {
    }

    public Curso(int cod_curso, String desc_curso, int duracao_semestre) {
        this.cod_curso = cod_curso;
        this.desc_curso = desc_curso;
        this.duracao_semestre = duracao_semestre;
    }

    public int getCod_curso() {
        return cod_curso;
    }

    public void setCod_curso(int cod_curso) {
        this.cod_curso = cod_curso;
    }

    public String getDesc_curso() {
        return desc_curso;
    }

    public void setDesc_curso(String desc_curso) {
        this.desc_curso = desc_curso;
    }

    public int getDuracao_semestre() {
        return duracao_semestre;
    }

    public void setDuracao_semestre(int duracao_semestre) {
        this.duracao_semestre = duracao_semestre;
    }
    
    public void Imprime_Curso(){
        System.out.println("Código do Curso :" + this.cod_curso
        + "Descrição do Curso :" + this.desc_curso
        + "Total de semestres do curso :" + this.duracao_semestre);
    }
    
}
