package Class12_WhileLoop;

public class WhileLoopEg7 {
    static void main(String[] args) {
        //Print Hello 3 times in the output

        int i = 1;  //1.  Initialization

        while (i <= 5) {      // Condition
            System.out.println("Hello");  // 3,

            i = i - 2;  //1 time, infinity, none -1-2-2 =-5
        }

        System.out.println("End");
    }

}
