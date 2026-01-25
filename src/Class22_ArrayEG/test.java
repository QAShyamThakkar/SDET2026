package Class22_ArrayEG;

public class test {
    static void main(String[] args) {

        int a[] = {12, 18, 216, 83, 120, 110};
        int max = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) ;
            {
                max = a[i]; //a[5] = 110
            }
        }

        System.out.println(max);


    }


}
