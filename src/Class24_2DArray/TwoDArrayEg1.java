package Class24_2DArray;

public class TwoDArrayEg1 {
    static void main(String[] args) {
        //1. To create 2D Array
        int a [][] = { {11,12,13}, {21,22,23,24}, {31,32,33}, {41,42,43} };

        //2. To print value
        System.out.println(a[1][2]);  //22, 23

        //3. Length of array - Count of Rows
        System.out.println(a.length); //4

        //4. Length of array - Count of Columns
        System.out.println(a[0].length); //3
        System.out.println(a[1].length); // 4

        //5. Print all the element with for loop i

        System.out.println(a[0][0]);
        System.out.println(a[0][1]);
        System.out.println(a[0][2]);

        for (int i = 0; i < a.length ; i++) {

            for (int j = 0; j < a[i].length; j++) {

                System.out.print(a[i][j] +" ");
            }
            System.out.println();
            
        }







    }
}
