package lab6.task2;

public class Task2 {
    static String brand = "Dodge";
    static String model = "Challenger 1969";
    static int speed = 30;

    public static void acceleration (int increment) {
        speed += increment;
    }

    public static void printInfo () {
        System.out.println("Автівка: " + brand + " " + model);
        System.out.println("Поточна швидкість автівки: " + speed + " км/год");
    }
    public static void main(String[] args){
        printInfo();
        acceleration(60);
        printInfo ();
    }
}