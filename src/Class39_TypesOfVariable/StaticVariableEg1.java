package Class39_TypesOfVariable;

class Car {

    //    int numOfCar;  //instance variable (object variable)

    static int numOfCar; //Static variable, (class variable)

    Car() {
        numOfCar++;
    }
}

public class StaticVariableEg1 {
    static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 = new Car();
        Car c4 = new Car();
        Car c5 = new Car();

        System.out.println(Car.numOfCar); // Static variable should be called with ClassName.VariableName


    }


}
