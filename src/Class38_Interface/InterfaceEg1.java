package Class38_Interface;

interface Bank {      //100% abstraction

    final int a = 100;

    public abstract void deposit(int amount);

    void withdraw(int amount);


}

class CitiBank implements Bank {
    @Override
    public void deposit(int amount) {
        System.out.println("Deposited " + amount);
    }

    @Override
    public void withdraw(int amount) {
        System.out.println("Withdrew " + amount);
    }

    public void showInt() {
        System.out.println("6%");
    }
}

public class InterfaceEg1 {
    static void main(String[] args) {
        //    Bank b = new Bank(); // We Can NOT create object on interface

        CitiBank b = new CitiBank();
        b.deposit(100);
        b.withdraw(50);
        b.showInt();
    }


}
