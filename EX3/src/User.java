public class User {
  private String name;
  private int age;

  public User (String n) {
    name = n;
  }

  public void setAge(int a) {
    age = a;
  }

  public String getName() {
    return name;
  }

  public void display() {
    System.out.println(name + "さん :" + age + "歳");
  }
  
}
