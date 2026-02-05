package Class29_ReviewClass02;

// The continue statement
// skips the current iteration of a loop and jumps to the next iteration.


public class ContinueKeyword {

    static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            if (i==3){
                continue;  // it will skip the iteration when i becomes 3
            }

            System.out.println(i);
        }

    }

}
