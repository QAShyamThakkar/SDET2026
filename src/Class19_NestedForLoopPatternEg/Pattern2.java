package Class19_NestedForLoopPatternEg;

//Write a Java Program to Print following data
//    1             R1 --> C1
//   12            R2 --> C2
//  123           R3 --> C3
// 1234          R4 --> C4
//12345         R5 --> C5
public class Pattern2 {

    static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for (int s = 1; s <=5-i; s++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }


    }


}
