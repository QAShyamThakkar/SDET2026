package Class07_LadderIfElseandSwitch;

public class LadderIfELseEg3 {
    static void main(String[] args) {

        //Write a program for grade system: (Time 10 min)

        // > 90 -- "Grade A"
        // 71 to 90 -- "Grade B"
        // 41 to 70 -- "Grade C"
        // 40 - "Passed"
        // <40 - "Better luck next time!!"

        int num = 40;

        if (num > 100) {
            System.out.println("Enter number from 1 to 100 only");
        } else if (num > 90) {
            System.out.println("Grade A");
        } else if (num >= 71) {
            System.out.println("Grade B");
        } else if (num >= 41) {
            System.out.println("Grade C");
        } else if (num == 40) {
            System.out.println("Passed");
        } else {
            System.out.println("Better luck next time!!");
        }


    }
}
