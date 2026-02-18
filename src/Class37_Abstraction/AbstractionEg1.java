package Class37_Abstraction;

abstract class Car {
    int a;
    Car(){}


    public abstract void drive();

    public abstract void fly();

    public void playMusic() {
        System.out.println("Playing Music" + a);
    }
}

class BMW extends Car {
    @Override
    public void drive() {
        System.out.println("Driving a car");
    }

    @Override
    public void fly() {
        System.out.println("Flying a car");
    }

    public void avengersCar(){
        System.out.println("avengersCar");
    }
}


public class AbstractionEg1 {
    static void main(String[] args) {
//        Car c = new Car();  // No, we can ot create object from Abstract class

        BMW b = new BMW();
        b.playMusic();
        b.drive();
        b.fly();
    }

}
