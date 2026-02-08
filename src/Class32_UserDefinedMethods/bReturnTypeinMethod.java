package Class32_UserDefinedMethods;

public class bReturnTypeinMethod {

    static void main(String[] args) {

        int sumOfNum = sum(10, 20); //30
        System.out.println(sumOfNum);

    }

    static int sum(int a, int b) {

        int result = a + b;
        return result;

    }


}

//Return Type = Type of Value a method gives back