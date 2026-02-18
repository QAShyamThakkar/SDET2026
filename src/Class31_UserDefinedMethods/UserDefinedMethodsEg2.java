package Class31_UserDefinedMethods;

import java.util.Scanner;

public class UserDefinedMethodsEg2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        printLine(50, "=");   //  50 ==
        System.out.println("Welcome to the calculator");
        printLine(40, "-");  //40  --

        System.out.println("Please enter Num1 number");
        int num1 = sc.nextInt();

        System.out.println("Please enter Num2 number");
        int num2 = sc.nextInt();

        printLine(30, "$");  //30 --
        System.out.println("Addition is: " + (num1 + num2));

        printLine(20, "*"); // 20 ==
    }

    // Write a method by your self (4 min)
    static void printLine(int lengthOfLine, String str) {
        for (int i = 0; i < lengthOfLine; i++) {
            System.out.print(str);
        }
        System.out.println();
    }


}
