package Class16_ForLoop;

//Print 1 10 2 9 3 8 4 7 5 6

import java.util.Scanner;

public class ScannerClass {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Hey User, enter num1");
        int a = sc.nextInt(); //10

        System.out.println("Now, enter num2");
        int b = sc.nextInt(); //20

        System.out.println("The sum total is " + (a + b));

    }

}

// 1%2
// 2%2
// 3%2
// 4%2