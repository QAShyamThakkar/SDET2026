package Class14_WhileLoopPrograms;

//%10 - will give us the last number
// /10 - remove the last digit

// Java Program to find the number of digit in given number 1238
public class CountDigitEg3 {
    static void main(String[] args) {

        long num = 1234l;  //4
        long count = 0;

        while (num > 0) {
            count =  count + 1;   // 1, 2, 3, 4
            num = num / 10;     // 123, 12, 1, 0
        }

        System.out.println(count); //

    }
}
