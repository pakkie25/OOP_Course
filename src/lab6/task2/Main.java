package lab6.task2;

public class Main {
    public static void main(String[]args){
        Car myCar = new Car("Ford", "Mustang gt500");
        myCar.printInfo();
        myCar.acceleration(40);
        myCar.printInfo();
    }
}
