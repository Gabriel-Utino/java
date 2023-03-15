public class User {
  private String name;
  private int age;
  private String from;

  public User (String n, int a, String f) {
    this.name = n;
    this.age = a;
    this.from = f;
  }

  public User () {
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public String getFrom() {
    return from;
  }

  public void printUser() {
    System.out.println(name);
    System.out.println(age);
    System.out.println(from);
  }

}
