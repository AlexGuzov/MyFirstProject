package ClassAndObjectSandbox;
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setNameAndAge("Bill", 40);
        String s1 = "Jane";
        person1.speak();

        Person person2 = new Person();
        person2.setNameAndAge(s1, 20);
        person2.speak();
    }
}
