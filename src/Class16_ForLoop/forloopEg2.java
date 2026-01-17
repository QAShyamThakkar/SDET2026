package Class16_ForLoop;

//Print divisior of 5  from 1 to 50;   ---> 5, 10, 15, 20, 25, 30, 35, 40, 45, 50

import java.util.Scanner;

public class forloopEg2 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        for (int i = start; i <= end; i=i+5) {

            if (i % 5 == 0) {
                System.out.println(i);
            }

        }

    }

}

// 1%2
// 2%2
// 3%2
// 4%2