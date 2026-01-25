package Class22_ArrayEG;

//Program to find the sum of odd and even

public class ArrayEG4_sumOfOddEven {
    static void main(String[] args) {

        int a[] = {12, 18, 216, 83, 120, 59};  //SumOfOdd - 83+59, SumOfEven - 12+18+216+120
        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1) {
                oddSum = oddSum + a[i];
            } else {
                evenSum = evenSum + a[i];
            }
        }

        System.out.println("Sum of ODD Num is: " + oddSum);
        System.out.println("Sum of ODD Even is: " + evenSum);

    }

}
