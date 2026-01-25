package Class22_ArrayEG;

public class BaseArray_SecondWay {
    static void main(String[] args) {


        //1. Declaration and initialisation of array
        int a [] = {10,20,30,40,50};

        //2. Know the array index, do not know thw value at the time of creating it.
        int num[] = new int[1000];

        num[0] = 80;
        num[1] = 70;
        num[500] = 100;

        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);
        System.out.println(num[3]);
        System.out.println(num[500]);




    }

}
