package Class14_WhileLoopPrograms;

//%10 - will give us the last number
// /10 - remove the last digit

public class SeperateDigitEg1_Base {
    static void main(String[] args) {

        int num = 1238;  // 8, 3, 2, 1

        System.out.println(num%10); //8 from 1238
        num = num/10;  // new number 123

        System.out.println(num%10); // 3 from 123
        num = num/10; // new number 12

        System.out.println(num%10); // 2 from 12
        num = num/10; // new number 1

        System.out.println(num%10); // 1 from new number 1
        num = num/10; // new number 0

    }
}
