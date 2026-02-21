package Class40_Static;

class Test1 {
    int a;
    int b;
    int c = 20;

    Integer d = new Integer("50");

    String s = "Hello";
    String s1 = new String("Hello");

    int ar[] = {10,20,30};



}


public class Test {
    static void main(String[] args) {
        Test1 t1 = new Test1();

        System.out.println(t1.a);
        System.out.println(t1.b);

        System.out.println(t1.ar);

    }
}
