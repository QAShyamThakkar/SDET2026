package Class36_Polymorphism;

class Bank {
    public void displayRateOfInterest() {
        System.out.println("4%");
    }
}

class HSBCBank extends Bank {
    @Override
    public void displayRateOfInterest() {
        System.out.println("3.5%");
    }
}

class ChaseBank extends Bank {
    @Override
    public void displayRateOfInterest() {
        System.out.println("5%");
    }
}

public class MethodOverriding {
    static void main() {
        HSBCBank hsbc = new HSBCBank();
        hsbc.displayRateOfInterest();
    }
}
