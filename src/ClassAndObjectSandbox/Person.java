package ClassAndObjectSandbox;

class Person {
    String name;
    int age;
    void setNameAndAge(String username, int userage){
        name = username;
        age = userage;
    }
    int calculateYearsToRetirement () {
        int years = 65 - age;
        return years;
    }
    void speak(){
        for (int i = 0; i < 3; i++)
            System.out.println("My name is " + name + " and I am " + age);
    }
    void sayHello(){
        System.out.println("Hello, guys!");
    }
}