package Class23_ArrayEGConti;

public class ArrayEG6_checkTheGiveArrayIsSorted {
    static void main(String[] args) {

        //input
        int a[] = {10, 20, 100, 70, 70};  // a[i] < a[i+1]

        //Logic/Code

        boolean isAscending = true;   //flag

        for (int i = 0; i < a.length - 1; i++) {  //4,4

            if (a[i] > a[i + 1]) {
                isAscending = false;
            }
        }

//        //Output
        if (isAscending) {
            System.out.println("The array is sorted in ascending order");
        } else {
            System.out.println("The array is not sorted in ascending order");
        }
    }
}