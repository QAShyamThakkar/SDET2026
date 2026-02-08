package Class32_UserDefinedMethods;

public class cMaxOutOfFourNum {

    static void main(String[] args) {
        int max1 = maxOutOfTwo(100, 20);     //100
        int max2 = maxOutOfTwo(30, 40);    //40

        System.out.println(maxOutOfTwo(max1, max2));

//        System.out.println(maxOutOfTwo(maxOutOfTwo(100,20), maxOutOfTwo(30,40))); //100


    }

    static int maxOutOfTwo(int num1, int num2) {

        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }

    }

}
