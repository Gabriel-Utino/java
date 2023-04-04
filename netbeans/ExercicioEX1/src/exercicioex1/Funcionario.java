
package exercicioex1;

public class Funcionario extends Pessoa {
    public int matricula;
    
    public Funcionario(String nome, double altura, double peso, int matricula) {
        super(nome, altura, peso);
        this.matricula = matricula;
    }
    
    
    public void printFuncionario() {
        System.out.println("matricula : " + matricula);
    }
}
/*funcionario("beto", 1.65, 75, 1000)*/