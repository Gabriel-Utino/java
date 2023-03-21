public class App {
    public static void main(String[] args) throws Exception {
        Pessoa testeAluno = new Pessoa("José", "Rua Antonio Marques, 30", "568.234.981-15", "3.698.222-8");
        testeAluno.ImprimePessoa();
        
       System.out.println("\n");

        Aluno aluno = new Aluno("Pedro", "Rua Almeida, 20", "456.876.123-12", "4.687.098-2", "59751", 4.5, 8.0, 10);
        aluno.imprimeAluno();

        Aluno aluno2 = new Aluno("Francisco", "Rua Almeida, 20", "456.876.123-12", "4.687.098-2", "59751", 9.0, 9.5, 10);
        aluno2.imprimeAluno();

        Aluno aluno3 = new Aluno("Gabriel", "Rua Almeida, 20", "456.876.123-12", "4.687.098-2", "59751", 9.0, 9.5, 11);
        aluno3.imprimeAluno();
        
        Aluno aluno4 = new Aluno("Valeria", "Rua Almeida, 20", "456.876.123-12", "4.687.098-2", "59751", 8.0, 9.5, 10);
        aluno4.imprimeAluno();
        
        Aluno aluno5 = new Aluno("Ricardo", "Rua Almeida, 20", "456.876.123-12", "4.687.098-2", "59751", 2.0, 3.5, 10);
        aluno5.imprimeAluno();
    }
}
