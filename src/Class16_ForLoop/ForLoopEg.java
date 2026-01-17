package Class16_ForLoop;

// Print number from 1 to 10

public class ForLoopEg {
    static void main(String[] args) {
        /////////////////////////// While loop ////////////////////////////

        int num = 1;   // initialisation

        while (num <= 10) {  // Condition
            System.out.println(num);
            num++;                    // Increment/Decrement
        }

        /////////////////////////// for loop ////////////////////////////

        System.out.println("////////////////////// Ans from for loop ///////////////////");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

    }

}
