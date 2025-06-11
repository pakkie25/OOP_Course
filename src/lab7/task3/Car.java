package lab7.task3;

public class Car {

    public String model;
    public String brand;
    public int speed;

    public Car(String model, String brand){
        this.model = model;
        this.brand = brand;
        this.speed = 220;
    }


    public void accelerate(int value){
        System.out.println("Ваша швидкість: " + this.speed );
        speed += value;
        System.out.println("Ви збільшили швидкість на: " + value);
    }

    public void brake(int value) {

        if (value > speed) {
            System.out.println("Швидкість не може бути від'ємною.");
        } else {
            speed -= value;
            System.out.println("Ви зменшили швидкість на: " + value);
        }
    }

    public void currentSpeed(){
        System.out.println("Ваша поточна швидкість: " + speed);
    }

    public void printStatus(){
        System.out.println("Стан вашого авто: ");
        System.out.println("Модель: " + model + "\nБренд:" + brand + "\nШвидкість: " + speed);
    }

}
