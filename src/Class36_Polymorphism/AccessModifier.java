package Class36_Polymorphism;

class Bank1{
    int balance;

    public void deposit(int amount){
        balance = balance + amount;
    }
}

public class AccessModifier {
    static void main() {
        Bank1 hsbcAcc = new Bank1();
        hsbcAcc.deposit(100);
    }
}
