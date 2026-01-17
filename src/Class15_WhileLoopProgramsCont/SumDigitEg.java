package Class15_WhileLoopProgramsCont;

//%10 - will give us the last number
// /10 - remove the last digit

// Java Program to find the sum of each digit in given number 1238
public class SumDigitEg {
    static void main(String[] args) {
// Input, Output - 10

        int num = 1238;  //4
        int sum = 0;

        while (num>0){
            sum = sum + num%10;      //1st 8 ---> sum, 2nd sum 8 + 3, 11+2
            num=num/10;
        }

        System.out.println(sum); //

    }
}
