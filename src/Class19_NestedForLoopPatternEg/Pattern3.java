package Class19_NestedForLoopPatternEg;

//Write a Java Program to Print following data
//5             R1 --> C1
//54            R2 --> C2
//543           R3 --> C3
//5432          R4 --> C4
//54321         R5 --> C5
public class Pattern3 {

    static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for (int j = 5; j >= 6-i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

    }


}
