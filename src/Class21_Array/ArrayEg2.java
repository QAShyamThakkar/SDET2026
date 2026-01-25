package Class21_Array;

public class ArrayEg2 {
    static void main(String[] args) {

        //1.  Declaration and initialization
        String a[] = {"Hello", "World", "Jhon", "Arva", "Shyam", "Naveen", "Andrei"};  // 4 index, 5 length

        //What will be the output???????

        //2. to print all the value from array
        System.out.println("Getting value with the help of for loop");
        for (int i = 0; i < a.length; i++) {
            System.out.print("At Index " + i + " the value is: ");
            System.out.println(a[i]);  //0 1 2
        }

    }

}
