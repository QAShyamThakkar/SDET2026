package Class04_OperatorPart2;

public class ExpressionandPriority {
    static void main(String[] args) {

        System.out.println(10*4/2); // 20

        System.out.println(10*4/2+5);

        System.out.println(10+20*4-3);

        System.out.println(15*6/3+5*6-10*12/6);
                            //30+30-20
                            //60-20
                            //40
        //1st check priority
        //if the priority is same, go from left to right

        System.out.println(5+6*4+(10+2));
            // ()   *    +


    }

}
