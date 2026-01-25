package Class22_ArrayEG;

public class BaseArray_FirstWay {
    static void main(String[] args) {

        int num = 10;

        //1. Declaration of array
        int a[] = {12, 14, 16, 83, 20};
        //multiple values having same data types
        //Index start with 0

        //2. To print the value from Array
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);

       //3. Exception - Array Out of Bound Exception
//        System.out.println(a[5]); //

        //4. To find length of array
        System.out.println(a.length); //5


        //5. how to print all the value with for loop
        System.out.println("Output with forloop");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }


    }

}
