package Class24_2DArray;

//Write a program - which will do sum of each row

public class SumOfEachRow {
    static void main(String[] args) {
        //1. To create 2D Array
        int a[][] = {{11, 12, 13}, {21, 22, 23, 24}, {31, 32, 33}, {41, 42, 43}};
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum = sum + a[i][j];

            }
            System.out.println(sum);
            sum = 0;  // break;
        }

//        System.out.println(sum); // Total of all the elements

//Output
        //36
        //90
        //96
        //126


    }
}
