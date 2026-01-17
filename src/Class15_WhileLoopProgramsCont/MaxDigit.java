package Class15_WhileLoopProgramsCont;

//%10 - will give us the last number
// /10 - remove the last digit

// Java Program to find the maximum digit in given number 12385
public class MaxDigit {
    static void main(String[] args) {

        // Input  19576, Output - 9

        int num = 12385;  //4
        int max = 0;  //

        while (num > 0) {
            int nextDigit = num % 10;  //5, 8, 3, 2, 1

            if (nextDigit > max) {
                max = nextDigit;
            }
            num = num / 10;
        }
        System.out.println(max); //

    }
}
