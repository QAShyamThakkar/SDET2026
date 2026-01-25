package Class22_ArrayEG;

public class ArrayEG5_findTheIndexValue_WithForEach {
    static void main(String[] args) {

        //2. Know the array index, do not know thw value at the time of creating it.
        int num[] = new int[1000];

        num[0] = 80;
        num[1] = 90;
        num[100] = 90;
        num[500] = 100;

        int count = 0;

        //Write a program to identify at which index we have 90;
        for (int i : num) {

            if (i == 90) {
                System.out.println(count);
            }
            count = count + 1;
        }


    }

}
