package lab6.task3;

public class Animal {
    public String name;
    public String sound;

    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public void makeSound(){
        System.out.println("Назва тваринки: " + name + ", звук який вона видає: " + sound);
    }

}