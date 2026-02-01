package Class27_StringMethods;

import javax.sound.midi.Soundbank;

public class StringMethods_Method_1to4 {
    static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "hello";

        String str3 = new String("Hello");

        //1. Equality of String
        System.out.println(str1.equals(str3));// true
        System.out.println(str2.equals(str3));// false,

        //2.  Equality of String ignoring the cases
        System.out.println(str2.equalsIgnoreCase(str3)); //true

        //3. Convert the case
        System.out.println(str1.toUpperCase()); // HELLO
        System.out.println(str3.toLowerCase()); //hello
        System.out.println(str2.equals(str3.toLowerCase())); //true

        //4. Contains
        String str4 = "Hello Superstars, We are learning Java";
        System.out.println(str4.contains("Java")); //true
        System.out.println(str4.contains(str1)); //


    }

}
