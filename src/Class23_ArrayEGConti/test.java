package Class23_ArrayEGConti;

public class test {
    static void main(String[] args) {

        //input
        int a[] = {10, 30, 20, 40, 15};  // a[i] < a[i+1]

        //Logic/Code

        boolean isAscending = true;   //flag

        for (int i = 0; i < a.length - 1; i++) {  //4,4

            if (a[i] > a[i + 1]) {
                System.out.println("The array is not sorted in ascending order");
            }
        }

        System.out.println("The array is sorted in ascending order");


    }
}
