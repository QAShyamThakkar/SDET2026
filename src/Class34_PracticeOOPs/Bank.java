package Class34_PracticeOOPs;

public class Bank {
    int balance;
    String accName;

    // Constructor
    // 1. Default Constructor
    // 2. No Argument Constructor
    // 3. Parameterized Constructor
    Bank(String name, int balance){
        this.balance = balance;
        accName = name;
    }

    public void deposit(int amount) {
        balance = balance + amount;
    }

    public void withdraw(int amount) {
        balance = balance - amount;
    }
}
