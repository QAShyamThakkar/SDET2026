package Class14_WhileLoopPrograms;

//%10 - will give us the last number
// /10 - remove the last digit

public class SeperateDigitEg2 {
    static void main(String[] args) {

        int num = 1234;  //4

        while (num > 0) {
            System.out.println(num % 10); //1 from 1
            num = num / 10; //new number 0
        }

        System.out.println("Num value after the loop " + num); //

    }
}
