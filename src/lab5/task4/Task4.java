package lab5.task4;
import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numOfDice;
        int totalSum = 0;

        System.out.print("Введіть кількість кубиків: ");
        numOfDice = scanner.nextInt();

        if (numOfDice > 0) {
            for (int i = 1; i <= numOfDice; i++) {
                int roll = random.nextInt(1, 7);

                print(roll);
                totalSum += roll;
            }
            System.out.println("Загальна сума: " + totalSum);
        }else{
            System.out.println("Введене число повинно бути більшим за 0.");
        }
        scanner.close();
    }
    static void print(int roll) {
        String dice1 = "1";
        String dice2 = "2";
        String dice3 = "3";
        String dice4 = "4";
        String dice5 = "5";
        String dice6 = "6";
        switch (roll){
            case 1:
                System.out.println(dice1);
                break;
            case 2:
                System.out.println(dice2);
                break;
            case 3:
                System.out.println(dice3);
                break;
            case 4:
                System.out.println(dice4);
                break;
            case 5:
                System.out.println(dice5);
                break;
            case 6:
                System.out.println(dice6);
                break;
        }
    }
}