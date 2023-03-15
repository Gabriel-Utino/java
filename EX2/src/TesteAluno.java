public class TesteAluno
{
    public static void main(String[] args) {
        Aluno x1 = new Aluno ("Ana","23456", 'F', 6, 1, 2 );
        x1.setCodmat (1234);
        x1.ImprimeAluno ();
        x1.ImprimeSexo();
        double media = x1.MediaAluno();
        System.out.println ("Media: " + media);
        System.out.println (x1.Resultado (media));
        System.out.println (x1.getNome ());

        
        Aluno x2 = new Aluno ("Paulo","500876123-15", 'F', 2.0, 6.0, 9.0 );
        x2.setCodmat (991239);
        x2.ImprimeAluno ();
        double media2 = x2.MediaAluno();
        System.out.println ("Media: " + media2);
        System.out.println (x2.Resultado (media2));
        System.out.println (x2.getNome ());
    }
}
