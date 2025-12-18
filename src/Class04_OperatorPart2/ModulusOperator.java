package Class04_OperatorPart2;

public class ModulusOperator {
    static void main(String[] args) {
        System.out.println(11.20%10); //1.20
//        System.out.println(2/1); //2, 1
//        System.out.println(1/2); // 0
//        System.out.println(1/2.00);


        //To check Odd and Even Number - we can use %2  (modulus 2)
        System.out.println(9%2);   //1
        System.out.println(4%2);   //0
        System.out.println(88%2);  //0
        System.out.println(77%2);  //1
        System.out.println(100%2); //0
        System.out.println(10001%2); //1

        //To get the last digit from the number - we can use %10 (modulus 10)
        System.out.println(11%10); //1
        System.out.println(42%10); //2
        System.out.println(36%10); //6
        System.out.println(121%10); //1
        System.out.println(88%10);  //8

        //To remove last digit from the number - we can use /10 (division 10)
        System.out.println(121/10); //12
        System.out.println(42/10); //4
        System.out.println(100/10); //10
        System.out.println(1259/10); //125


    }



}
