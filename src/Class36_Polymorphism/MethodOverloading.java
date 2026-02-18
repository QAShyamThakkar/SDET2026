package Class36_Polymorphism;

// 1. Method Overloading
// 2. Method Overriding
class Car {
    public void playMusic(String radio) {
        System.out.println("Playing music");
    }

    public void playMusic(String radio, int volume) {
        System.out.println("Playing music");
    }

    public void playMusic(int songNumber, String songName) {
        System.out.println("Playing music");
    }

    public void playMusic() {
        System.out.println("Playing music");
    }
}

public class MethodOverloading {
    static void main() {
        Car c = new Car();
        c.playMusic( 10, "Hello");
    }
}
