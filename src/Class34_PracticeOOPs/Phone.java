package Class34_PracticeOOPs;

public class Phone {
    String color;
    int price;
    String model;

    public void call(String phoneNumber) {
        System.out.println("calling from " + model + " to a number " + phoneNumber);
    }

    public void text(String phoneNumber, String text) {
        System.out.println("texting from " + model);
    }
}
