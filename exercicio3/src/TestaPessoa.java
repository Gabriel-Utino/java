public class TestaPessoa {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome ( "daniel");
        p1.setIdade(19);
        p1.setEmail("daniel@uol.com");
       
        System.out.println("Dados da 1a pessoa:");
        p1.imprime();

        Pessoa p2 = new Pessoa();
        p2.setNome("Ana");
        p2.setIdade(18);
        p2.setEmail("ana@ana.com");
        System.out.println("Dados da 2a pessoa:");
        p2.imprime();
    }
}