
package exercicioex1;

public class ExercicioEX1 {
    
    public static void main(String[] args) {
        Pessoa x1 = new Pessoa("ze", 1.75, 80);
        
        Funcionario x2 = new Funcionario("beto", 1.65, 75, 1000);
        

        x1.printPessoa();
        System.out.println("");
        x2.printPessoa();
        System.out.println("");
        x2.printFuncionario();
    }
    
}
