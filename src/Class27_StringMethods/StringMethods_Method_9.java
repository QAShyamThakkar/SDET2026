package Class27_StringMethods;

public class StringMethods_Method_9 {
    static void main(String[] args) {

        //.9 Replace
        String str1 = "You have to pay USD 100, I will give USD 30 and 30";

        String str2 = "Can we go over it one more time?";

        System.out.println(str1.replace("30", "100")); //100, 100
//      System.out.println(str1); // or 100, 30

        System.out.println(str2.replace("one", "ten"));


    }

}
