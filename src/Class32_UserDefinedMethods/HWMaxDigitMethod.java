package Class32_UserDefinedMethods;

public class HWMaxDigitMethod {

    static void main(String[] args) {

        maxDigit(1347);  //7

        sumOfDigit(1234); //10

    }


    static void maxDigit(int numFromUser) {

        // Input  19576, Output - 9

        int num = numFromUser;  //4
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

    static void sumOfDigit(int numFromUser) {

        int num = numFromUser;  //4
        int sum = 0;

        while (num > 0) {
            sum = sum + num % 10;      //1st 8 ---> sum, 2nd sum 8 + 3, 11+2
            num = num / 10;
        }

        System.out.println(sum); //

    }


}
