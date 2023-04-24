
package exercicioex1;

public class Pessoa {
    public String name;
    public double height;
    public int weight;
    
    public Pessoa() {
    }
    
    public Pessoa(String name, double height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    public String getName () {
        return name;
    }
    
    public double getHeight () {
        return height;
    }
    
    public int getWeight () {
        return weight;
    }
    
    
    public void printPessoa() {
        System.out.println("Name :" + this.name + "\nHeight :" + this.height
        + "\nWeight :" + this.weight);
    }
    
}
