package Class39_TypesOfVariable;

class Bike {

    int speed;          //instance
    static int price;   //static

    void updateData() {
        int price = 100;
    }

    void printData() {
        System.out.println(price);
    }

}

public class PracticeEg1 {
    static void main(String[] args) {
        Bike b1 = new Bike();
        b1.updateData();
        b1.printData();  //0

    }
}
