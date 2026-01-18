package Class17_ForLoopEg;

// 5! --> 5 * 4 * 3 * 2 * 1 = 120
// 3! --> 3*2*1 = 6


public class forLoopEg7_FactorialOfGivenNumber {
    static void main(String[] args) {
        //input
        int num = 5;
        int fact = 1;

        //Logic
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        //Output
        System.out.println(fact); //120
    }

}
