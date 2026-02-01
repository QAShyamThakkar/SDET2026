package Class27_StringMethods;

public class StringMethods_Method_5to8 {
    static void main(String[] args) {

        String str5 = "";  // empty, blank
        String str6 = " "; // not empty, blank
        String str7 = "Hello Superstars, We are learning Java";

        //5. Checking the String is empty or blank
//        System.out.println(str5.isEmpty());   //t
//        System.out.println(str5.isBlank());   //t
        System.out.println(str6.isEmpty()); //f
        System.out.println(str6.isBlank()); //t

        //6. Length of String
        System.out.println(str7.length()); //38

        //7. Find char at particular index
        System.out.println(str7.charAt(2));  //l

        //8. Find index of particular char
        System.out.println(str7.indexOf('s')); //11
        System.out.println(str7.indexOf("Super")); //6
    }

}
