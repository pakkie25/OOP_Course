package lab5.task6;

import java.util.Scanner;
import java.util.Random;

public class Task6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] options = {"rock", "paper", "scissors"};

        System.out.println("Гра 'Камінь, ножиці, папір' почалась!");

        String playAgain = "yes";

        while (playAgain.equalsIgnoreCase("yes")) {
            String playerChoice = "";
            boolean validInput = false;

            while (!validInput) {
                System.out.print("Оберіть rock, paper або scissors: ");
                playerChoice = scanner.nextLine().toLowerCase();

                for (String option : options) {
                    if (playerChoice.equals(option)) {
                        validInput = true;
                        break;
                    }
                }

                if (!validInput) {
                    System.out.println("Некоректне введення! Спробуйте ще раз.");
                }
            }

            String computerChoice = options[random.nextInt(3)];
            System.out.println("Комп'ютер обрав: " + computerChoice);

            String result;
            if (playerChoice.equals(computerChoice)) {
                result = "Нічия!";
            } else if (
                    (playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                            (playerChoice.equals("scissors") && computerChoice.equals("paper")) ||
                            (playerChoice.equals("paper") && computerChoice.equals("rock"))
            ) {
                result = "Ви перемогли!";
            } else {
                result = "Комп'ютер переміг!";
            }

            System.out.println(result);

            System.out.print("Бажаєте зіграти ще раз? (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();
        }

        System.out.println("Дякую за гру!");
        scanner.close();
    }
}
