package lab7.task3;

public class Main {
    public static void main(String [] args){
        Car myCar = new Car("Mustang gt350","Ford");
        myCar.accelerate(210);
        myCar.currentSpeed();
        myCar.brake(30);
        myCar.currentSpeed();
        myCar.printStatus();

    }
}
