package Class24_2DArray;

public class SumOfAllElements {
    static void main(String[] args) {
        //1. To create 2D Array
        int a [][] = { {11,12,13}, {21,22,23,24}, {31,32,33}, {41,42,43} };
        int sum = 0;

        for (int i = 0; i < a.length ; i++) {

            for (int j = 0; j < a[i].length; j++) {

                sum = sum + a[i][j] ; //11 12 13 21
            }

            System.out.println();
            
        }

        System.out.println(sum);

//Output
        //36
        //90
        //96
        //126




    }
}
