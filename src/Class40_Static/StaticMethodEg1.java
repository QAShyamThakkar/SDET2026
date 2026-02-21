package Class40_Static;

class Bank {

    static int speed; // Static Variable - Can be accessed directly with Class Name
    int balance;      // Instance Variable - First create object, then access it with Object

    static void updateData() {
        speed = 100;            //Static Variable
//        balance = 500;          //Instance (non static) Variable
    }

    void noStaticMethod(){
        speed = 100;
        balance = 500;
    }

    static void printData() {
        System.out.println(speed);
    }
}

public class StaticMethodEg1 {
    static void main(String[] args) {
        Bank b1 = new Bank();
        b1.noStaticMethod();
        System.out.println(Bank.speed);
        System.out.println(b1.balance);


//        Bank.updateData();                  //Static method can be accessed with ClassName.MethodName
//        System.out.println(Bank.speed);


    }

}
