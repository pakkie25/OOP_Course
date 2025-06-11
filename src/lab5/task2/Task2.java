package lab5.task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double balance = 0.0;
        int choice;

        do {
            System.out.println("Меню");
            System.out.println("1. Вивести поточний баланс");
            System.out.println("2. Внести кошти на рахунок");
            System.out.println("3. Зняти кошти з рахунку");
            System.out.println("4. Вийти");
            System.out.print("Оберіть дію (1, 2, 3 або 4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    showBalance(balance);
                    break;
                case 2:
                    balance += deposit(scanner);
                    break;
                case 3:
                    balance = withdraw(scanner, balance);
                    break;
                case 4:
                    System.out.println("Банківська програма завершена!");
                    break;
            }
        } while (choice != 4);

        scanner.close();
    }

    // Метод для відображення балансу
    static void showBalance(double balance) {
        System.out.println("Поточний баланс: " + balance + " грн");
    }

    // Метод для внесення коштів
    static double deposit(Scanner scanner) {
        System.out.print("Введіть суму, яку хочете внести: ");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            System.out.println("Успішно внесено: " + amount + " грн");
            return amount;
        } else {
            System.out.println("Сума має бути більшою за 0");
            return 0;
        }
    }

    // Метод для зняття коштів
    static double withdraw(Scanner scanner, double balance) {
        System.out.print("Введіть суму для зняття: ");
        double amount = scanner.nextDouble();
        if (amount > balance) {
            System.out.println("Недостатньо коштів на раунку");
        } else if (amount <= 0) {
            System.out.println("Сума має бути більшою за 0");
        } else {
            balance -= amount;
            System.out.println("Успішно знято: " + amount + " грн");
        }
        return balance;
    }
}