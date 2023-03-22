
package exercicio4;

public class Professor {
    private int cod_professor;
    private String nome_prof;
    private String email_prof;
    private String fone_prof;
    
    public Professor() {
    }
    
    public Professor(int cod_professor, String nome_prof, String email_prof, String fone_prof) {
        this.cod_professor = cod_professor;
        this.nome_prof = nome_prof;
        this.email_prof = email_prof;
        this.fone_prof = fone_prof;
    }
    
    public void setCod_professor(int cod) {
        this.cod_professor = cod;
    }
    
    public int getCod_professor() {
        return cod_professor;
    }
    
    public void setNome_prof(String nome) {
        this.nome_prof = nome;
    }
    
    public String getNome_prof() {
        return nome_prof;
    }
    
    public void setEmail_prof(String email) {
        this.email_prof = email;
    }
    
    public String getEmail_prof() {
        return email_prof;
    }
    
    public void setFone_prof(String fone) {
        this.fone_prof = fone;
    }
    
    public String getFone_prof() {
        return fone_prof;
    }
    
    public void Imprime_Professor() {
        System.out.println("Código do Professor :" + this.cod_professor
        + "Nome do Professor :" + this.nome_prof
        + "Email do Professor :" + this.email_prof
        + "this.fone_prof :" + this.fone_prof);
    }
}
