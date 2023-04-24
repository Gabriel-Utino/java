
package exercicioex1;

public class Funcionario extends Pessoa {
    public int matri;
    
    public Funcionario(String name, double height, int weight, int matri) {
        super(name, height, weight);
        this.matri = matri;
    }
    
    public void printFuncionario() {
        //スーパークラスの関数をそのまま呼び出せる！！
        printPessoa();
        System.out.println("Matricula :" + matri);
    }
    
    
}
/*funcionario("beto", 1.65, 75, 1000)*/