package Class13_WhileLoopCont;

public class CoffeeMachine {
    static void main(String[] args) {

        int totalCoffee = 10;

        while (totalCoffee > 0) {
            System.out.println("Available coffee is " + totalCoffee);
            System.out.println("Would you like to have one?");
            System.out.println("I have taken it, Thanks");
            System.out.println();
            totalCoffee--;
        }

        System.out.println("Sorry, its not available!!");


    }

}
