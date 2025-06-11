package lab6.task3;

public class Main {
    public static void main(String[]args){
        Animal[] Animals = new Animal[3];

        Animals[0] = new Animal("Хряк", "Хрю хрю");
        Animals[1] = new Animal("Бурьонка", "Мууу");
        Animals[2] = new Animal("Півень", "LoL>Dota");

        for (Animal animal : Animals) {
            animal.makeSound();
        }
    }
}
