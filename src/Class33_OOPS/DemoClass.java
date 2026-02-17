package Class33_OOPS;

class Parent {
    public static void method1() {
        System.out.println("Method from Parent");
    }
}

class Child extends Parent {
    public static void method1() {
        System.out.println("Method from Child");
    }
}

public class DemoClass {
    static void main() {
        Parent p = new Child();
        p.method1();
    }
}
