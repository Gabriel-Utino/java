
package exercicio4;

public class Exercicio4 {

    public static void main(String[] args) {
//        System.out.println("hello world");
        Curso[] corso_arr = new Curso[5];
        
        corso_arr[0] = new Curso(1,"Ciência da Computação",8);
        corso_arr[1] = new Curso(2,"Sistemas de Informação",8);
        corso_arr[2] = new Curso(3,"Redes",5);
        corso_arr[3] = new Curso(4,"Sistemas para Internet",5);
        corso_arr[4] = new Curso(5,"Gestão de TI",5);
        
        
        Professor[] prof_arr = new Professor[4];
        
        prof_arr[0] = new Professor(10,"Paulo","pg@uol.com.br", "4330-4578");
        prof_arr[1] = new Professor(15,"Alfredo","am@uol.com.br", "5578-9812");
        prof_arr[2] = new Professor(20,"Marcos","ms@uol.com.br", "4125-9976");
        prof_arr[3] = new Professor(25,"Ana","an@bol.com.br", "5678-1145");
        
        Disciplina[] dis_arr = new Disciplina[4];
        
        dis_arr[0] = new Disciplina(100,"Estatística");
        dis_arr[1] = new Disciplina(110,"Algoritmos");
        dis_arr[2] = new Disciplina(120,"Redes");
        dis_arr[3] = new Disciplina(130,"Álgebra");
        
        for (int i=0; i < corso_arr.length; i++) {
            corso_arr[i].Imprime_Curso();
        }
        
        for (int i=0; i < prof_arr.length; i++) {
            prof_arr[i].Imprime_Professor();
        }
        
        for (int i=0; i < dis_arr.length; i++) {
            dis_arr[i].Imprime_Disciplina();
        }
    }
}
