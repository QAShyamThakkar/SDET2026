package Class17_ForLoopEg;

// Print sum of 1 to 10 --> 55


import java.util.Scanner;

public class forLoopEg6_withScanner {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the start number");
        int start = sc.nextInt(); //1

        System.out.println("Enter the end number");
        int end = sc.nextInt();

        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum = sum + i;

        }

        System.out.println("Sum from " + start + " to " + end + " is: " + sum);  //

    }


}
