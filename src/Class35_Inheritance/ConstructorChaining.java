package Class35_Inheritance;

abstract class Parent {
    Parent() {
        System.out.println("Constructor of Parent");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Constructor of Child");
    }
}

public class ConstructorChaining {
    static void main() {
        Child c = new Child();
    }
}
