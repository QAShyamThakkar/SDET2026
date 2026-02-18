package Class35_Inheritance;

class BasicCalculator {
    public void sum(int a, int b) {
        System.out.println("sum= " + (a + b));
    }

    public void sub(int a, int b) {
        System.out.println("sub= " + (a + b));
    }
}

class AdvCalculator extends BasicCalculator {

    public void mul(int a, int b) {
        System.out.println(a * b);
    }

    public void div(int a, int b) {
        System.out.println(a / b);
    }
}

public class InheritanceExample {
    static void main() {
        AdvCalculator adv = new AdvCalculator();
        BasicCalculator basic = new BasicCalculator();

        adv.sum(10, 20);
        adv.sub(10, 20);
        adv.mul(10, 20);
        adv.div(10, 20);

        basic.sum(10, 20);
        basic.sub(10, 20);
//        basic.mul(10, 20); - Mul is not available with Basic calculator
    }
}
