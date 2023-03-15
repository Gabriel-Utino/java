public class App {
    public static void main(String[] args) {
        User person1 = new User();
        person1.setName("gabriel");
        person1.setAge(26);
        person1.setFrom("Brazil");

        
        User person2 = new User("miyuki", 25, "japan");

        person1.printUser();
        person2.printUser();
    }

}
