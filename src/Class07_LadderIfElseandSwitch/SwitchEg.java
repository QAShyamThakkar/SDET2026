package Class07_LadderIfElseandSwitch;

// switch(condition){
//    case 1:
//        case 2:
// }

public class SwitchEg {
    static void main(String[] args) {

        int num = 8;

        switch (num) {
            case 1: System.out.println("Monday");break;
            case 2: System.out.println("Tuesday");break;
            case 3: System.out.println("Wednesday");break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday");break;
            case 6: System.out.println("Saturday");break;
            case 7: System.out.println("Sunday");break;
            default: System.out.println("Enter the number from 1 to 7 only");
        }


        //1 - Monday
        //2- Tuesday
        //3 - Wednesday
        //4 - Thursday
        //5-  Friday
        //6- Saturday
        //7- Sunday


    }
}
