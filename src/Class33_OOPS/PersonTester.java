package Class33_OOPS;
// Only one class in a file should be public
// public class name should match with file name
// A class that has main methods that needs to be public

public class PersonTester {
    static void main() {
        Person vlad = new Person();
        Person laureen = new Person();
        vlad.walk();
        vlad.age = 23;
        vlad.name = "Vladimir";

        System.out.println(laureen.age);
        System.out.println(laureen.name);
    }
}

class Person {
    String name;
    int age;
    String hairColor;
    int bankBalance;
    char gender;
    boolean isCitizen;

    public void walk() {
        System.out.println("Person is walking");
    }

    public void run() {
        System.out.println("Person is Running");
    }

    public void talk() {
        System.out.println("Person is talking");
    }
}
