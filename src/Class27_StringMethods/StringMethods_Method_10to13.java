package Class27_StringMethods;

public class StringMethods_Method_10to13 {
    static void main(String[] args) {

        //10. Trim
        String str1 = "          Hello World!";

        System.out.println(str1);
        System.out.println(str1.trim());

        //11. Substring
        String str2 = "You transferred USD 100 with ref no: 12345";

        System.out.println(str2.indexOf("100"));
        System.out.println(str2.substring(20));
        System.out.println(str2.substring(20, 23));

        //12. Format
        String str3 = "Testing the Amazon Website with UserName %s";
        System.out.println(str3);
        System.out.println(String.format(str3, "Anastasia"));
        System.out.println(String.format(str3, "Vladimir"));

        //13. Split
        System.out.println("==========Split===================");

        String str4 = "Testing the Amazon Website with UserName Vladimir";
        String a[] = str4.split(" ");

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }



    }

}
