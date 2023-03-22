
package exercicio4;

public class Disciplina {
    private int cod_disciplina;
    private String desc_disciplina;

    public Disciplina() {
    }

    public Disciplina(int cod_disciplina, String desc_disciplina) {
        this.cod_disciplina = cod_disciplina;
        this.desc_disciplina = desc_disciplina;
    }
    
    public void setCod_disciplina(int cod_disciplina) {
        this.cod_disciplina = cod_disciplina;
    }
    
    public int getCod_disciplina() {
        return cod_disciplina;
    }
    
    public void setDesc_disciplina(String desc_disciplina) {
        this.desc_disciplina = desc_disciplina;
    }
    
    public String getDesc_disciplina() {
        return desc_disciplina;
    }
    
    public void Imprime_Disciplina() {
        System.out.println("Código da Disciplina" + this.cod_disciplina
        + "Descrição da Disciplina :" + this.desc_disciplina);
    }
}
