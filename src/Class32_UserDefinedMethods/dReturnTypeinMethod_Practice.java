package Class32_UserDefinedMethods;

public class dReturnTypeinMethod_Practice {

    static void main(String[] args) {

        System.out.println(square(10)); //
        System.out.println(average(10, 20)); //15.0

        boolean b = isEven(40);
        System.out.println(b);

        System.out.println(greeting("Good Morning!"));

    }

    static int square(int x) {
        return x * x;
    }

    static double average (int a, int b){
        return (a+b)/2.0;
    }

    static boolean isEven (int n){
        return n%2==0;
    }

    static String greeting (String str){
        return str;
    }

}

//Return Type = Type of Value a method gives back