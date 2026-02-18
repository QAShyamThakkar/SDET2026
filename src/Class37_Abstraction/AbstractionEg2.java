package Class37_Abstraction;

class Test{

    public void show(Number n){     //reference of abstract class can be created
        System.out.println(n);
    }

}


public class AbstractionEg2 {

    static void main(String[] args) {

//        Number n = new Number(); //// can not create object of abstract class

        Test t = new Test();
        t.show(10.10);

    }




}
