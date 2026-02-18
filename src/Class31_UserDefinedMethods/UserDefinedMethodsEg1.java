package Class31_UserDefinedMethods;

import java.util.Scanner;

public class UserDefinedMethodsEg1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        printBigLine();   //  50 --
        System.out.println("Welcome to the calculator");
        printSmallLine();  //25   --

        System.out.println("Please enter Num1 number");
        int num1 = sc.nextInt();

        System.out.println("Please enter Num2 number");
        int num2 = sc.nextInt();

        printSmallLine();  //25 --
        System.out.println("Addition is: " + (num1 + num2));


        printBigLine(); // 50 --
    }
// Write a method by your self (4 min)
    static void printBigLine() {
        System.out.println("--------------------------------------------------");
    }

    static void printSmallLine() {
        System.out.println("-------------------------");
    }

}
