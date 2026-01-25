package Class22_ArrayEG;

//Program to find the largest number from array

public class ArrayEG2_largestNumFromArray {
    static void main(String[] args) {

        //1. Declaration of array
        int a[] = {12, 18, 216, 83, 120};
        int maxNum = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > maxNum) {
                maxNum = a[i];
            }
        }

        System.out.println(maxNum);

    }

}
