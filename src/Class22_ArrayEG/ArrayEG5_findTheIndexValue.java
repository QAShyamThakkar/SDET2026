package Class22_ArrayEG;

public class ArrayEG5_findTheIndexValue {
    static void main(String[] args) {

        //2. Know the array index, do not know thw value at the time of creating it.
        int num[] = new int[1000];

        num[0] = 80;
        num[1] = 90;
        num[100] = 90;
        num[500] = 100;

        int target = 90;

        //Write a program to identify at which index we have 90;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == target) {
                System.out.println("The value " + target +" is at index: " + i);  //1, 100   //1, 100 //100
            }
        }


    }

}
