package Class16_ForLoop;

//Print only even number from 1 to 10;   2, 4, 6, 8, 10

public class forloopEg1 {
    static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            if (i % 2 == 0) {
                System.out.println(i);
            }

        }

    }

}
