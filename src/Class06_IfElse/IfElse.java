package Class06_IfElse;

//Syntex
   /*
        if (condition) {
            //executed if the condition is true ;
        }else {
            //executed if the condition is false ;
        }

      */


public class IfElse {
    static void main(String[] args) {

        int fuel = 80;

        System.out.println("1. Starting the Drive");

        if (fuel < 50) {
            System.out.println("2. Get the fuel");
        } else {
            System.out.println("2A. Having breakfast");
        }

        System.out.println("3. Completing the drive");


    }


}
