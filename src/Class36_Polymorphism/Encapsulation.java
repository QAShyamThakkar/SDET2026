package Class36_Polymorphism;

class Phone {
    private String color;
    private int price;

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
}

public class Encapsulation {
    static void main() {
        Phone phone = new Phone();
        phone.setColor("Red");
    }
}
