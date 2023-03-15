public class Aluno
{
    private String nome;
    private int codmat;
    private String cpf;
    private char sexo;
    private double nota_P1;
    private double nota_P2;
    private double nota_P3;
   
    public Aluno (String nome, String cpf,char sexo, double nota_P1,
                  double nota_P2, double nota_P3 )
    {
         this.nome = nome;
         this.cpf = cpf;
         this.sexo = sexo;
         this.nota_P1 = nota_P1;
         this.nota_P2 = nota_P2;
         this.nota_P3 = nota_P3;            
    }
           
    public void setCodmat (int codmat)
    {
        this.codmat = codmat;
    }
           
    public String getNome()
    {
        return this.nome;
    }
   
    public void ImprimeAluno ()
    {
        System.out.println (nome +"\n" + codmat+"\n" + cpf +"\n" + sexo +"\n" +
        nota_P1+"\n" + nota_P2 +"\n" + nota_P3);
    }
   
    public void ImprimeSexo ()
    {
       if (sexo == 'M') System.out.println ("Masculino");
       else System.out.println ("estudante : " + nome + "Feminino");
    }
   
    public double MediaAluno()
    {
        if (nota_P1 < nota_P2 && nota_P1 < nota_P3) {
            return ((nota_P2 + nota_P3) / 2);
        } else if (nota_P2 < nota_P1 && nota_P2 < nota_P3) {
            return ((nota_P1 + nota_P3) / 2);
        } else {
            return ( (nota_P1+ nota_P2 )/2);
        }
    }
   
    public String Resultado (double m)
    {
        if (m>=6) return ("Aprovado");
        else return ("Reprovado");
    }
}