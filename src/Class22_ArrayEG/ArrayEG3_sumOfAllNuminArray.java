package Class22_ArrayEG;

//Program to find the sum of all numbers in array

public class ArrayEG3_sumOfAllNuminArray {
    static void main(String[] args) {

        int a[] = {12, 18, 216, 83, 120};
        int sum=0;

        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }

        System.out.println(sum);

    }

}
