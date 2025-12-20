package Class05_StringConcatenation;

public class StringConcatenation {
    static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String space = " ";
        int a = 10;
        int b = 20;

        System.out.println(str1); //Hello
        System.out.println("str1"); //str1
        System.out.println(str1 + space + str2);  // Hello World

        System.out.println(str1 + a); //Hello10
        System.out.println(str1 + str2 + a + b); //HelloWorld1020
        System.out.println(a + b + str1);//30Hello

        System.out.println(str1 + a + b); //hello1020
        System.out.println(str1 + (a + b)); //hello30

        System.out.println(str1 + a * b); //  hello200

//        System.out.println(str1 + a - b); // error

        System.out.println("str1" + a + b);

    }

}
// int + int = add
// int + String = Concat
// String + int = Concat