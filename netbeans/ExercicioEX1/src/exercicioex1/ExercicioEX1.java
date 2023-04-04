
package exercicioex1;

public class ExercicioEX1 {
    
    public static void main(String[] args) {
        Pessoa x1 = new Pessoa("ze", 1.75, 80.0);
        
        Funcionario x2 = new Funcionario("beto", 1.65, 75, 1000);
        

        x1.printPessoa();
        x2.printPessoa();
        x2.printFuncionario();
        
        /*
        x2.printFuncionario();
        x2.printFuncionario();
        */
    }
    
}
