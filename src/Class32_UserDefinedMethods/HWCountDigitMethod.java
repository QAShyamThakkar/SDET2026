package Class32_UserDefinedMethods;

public class HWCountDigitMethod {

    static void main(String[] args) {

        countDigit(1234);

    }

    static void countDigit(int numFromUSer) {

        int num = numFromUSer;  //4
        long count = 0;

        while (num > 0) {
            count = count + 1;   // 1, 2, 3, 4
            num = num / 10;     // 123, 12, 1, 0
        }

        System.out.println(count); //
    }

}
