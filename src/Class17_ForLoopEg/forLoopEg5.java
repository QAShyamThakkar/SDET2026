package Class17_ForLoopEg;

// Print 1 2 4 8 16 32 64   -- For loop


public class forLoopEg5 {
    static void main(String[] args) {

        int num = 1;

        for (int i = 0; i < 7; i++) {
            System.out.println(num); //0, 1, 2, 4,  8, 16, 32, 64, 128
            num = num * 2;


        }

    }


}
