package Class22_ArrayEG;

//Program to find the sum of odd and even

public class ForEachLoop {
    static void main(String[] args) {

        int a[] = {12, 18, 216, 83, 120, 59};  //SumOfOdd - 83+59, SumOfEven - 12+18+216+120

//        for (int i = 0; i < a.length; i++) {  // here i is the index
//            System.out.println(a[i]);
//        }

        //for each loop
        for (int num : a){           // here num itself is an element (it is not index)
            System.out.println(num);
        }
    }

}
