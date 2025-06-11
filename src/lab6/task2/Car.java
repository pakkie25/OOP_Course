package lab6.task2;

public class Car {
    public String brand;
    public String model;
    public int speed;

    public Car(String brand, String model){
        this.brand = brand;
        this.model = model;
        this.speed = 30;
    }
    public void acceleration (int increment){
        speed += increment;
    }
    public void printInfo (){
        System.out.println("Автівка: " + brand + " " + model);
        System.out.println("Поточна швидкість автівки: " + speed + " км/год");
    }
}