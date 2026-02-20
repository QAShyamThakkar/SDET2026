package Class39_TypesOfVariable;

class Demo {

    static int a = 10;        // Static or Instance Variable

    void method1() {
        int a = 20;            // Local Variable
        System.out.println(a);
    }

    void method2(){
        System.out.println(a);
    }

}

public class TypesOfVariable {
    static void main(String[] args) {
        Demo d1 = new Demo();
        d1.method1();
        d1.method2();

        System.out.println(Demo.a); //To access Static variable, can directly access by ClassName.variableName

    }


}
