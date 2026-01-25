package Class21_Array;

public class ArrayEg1 {
    static void main(String[] args) {

        // Store marks of five students - m1 m2 m3 m4 m5

        // Declaration and initialization
        int m1 = 40;
        int m2 = 70;
        System.out.println(m1); //50

        //1.  Declaration and initialization
        int a[] = {50, 70, 80, 90, 100};  // 4 index, 5 length

        //2.  Printing array value
        System.out.println(a[0]); //50
        System.out.println(a[1]); //70
        System.out.println(a[2]); //80
        System.out.println(a[3]); //90
        System.out.println(a[4]); //100

        //3. .Array Index Out Of Bounds Exception
//        System.out.println(a[5]); // nothing, error

        //4. length of array
        System.out.println(a.length);

        //5. to print all the value from array
        System.out.println("Getting value with the help of for loop");
        for (int i = 0; i <= 4 ; i++) {
            System.out.println(a[i]);  //0 1 2 3 4
        }


    }

}
