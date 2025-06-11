package lab5.task7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task7 {
    public static String[] elements = {"🍒", "🍋", "🍊", "🏆", "⚓"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int balance = 500;
        int stavka;
        int win;
        String game = "yes"; // ← Инициализация переменной перед циклом

        System.out.println("Привіт, ти в грі слот машина!");
        System.out.println("У грі можуть випадати такі символи: " + Arrays.toString(elements));
        System.out.println("Початковий баланс: " + balance + "$");

        do {
            System.out.println("\nПоточний баланс: " + balance + "$");
            System.out.print("Яку ставку ви будете робити? ");

            if (!scanner.hasNextInt()) {
                System.out.println("Будь ласка, введіть число.");
                scanner.nextLine(); // очистка вводу
                continue;
            }

            stavka = scanner.nextInt();
            scanner.nextLine(); // зчитування залишку після числа

            if (stavka <= 0 || stavka > balance) {
                System.out.println("Ви ввели неправильну ставку.");
                continue;
            }

            balance -= stavka;

            String[] result = spinRow();
            printRow(result);

            win = getPayout(result, stavka);
            balance += win;

            if (win > 0) {
                System.out.println("Ви виграли " + win + "$ !");
            } else {
                System.out.println("Ви програли " + stavka + "$.");
            }

            System.out.println("Ваш баланс після: " + balance + "$");

            if (balance == 0) {
                System.out.println("Ваш рахунок 0$. Гру завершено.");
                break;
            }

            System.out.print("Бажаєте зіграти ще (yes/no)?: ");
            game = scanner.nextLine().toLowerCase();

        } while (game.equals("yes"));

        System.out.println("Гра завершена. Дякуємо за участь!");
        scanner.close();
    }

    static String[] spinRow() {
        Random random = new Random();
        String[] randomElements = new String[3];
        for (int i = 0; i < 3; i++) {
            randomElements[i] = elements[random.nextInt(elements.length)];
        }
        return randomElements;
    }

    static void printRow(String[] row) {
        System.out.println("--------------------------");
        System.out.println("| " + row[0] + " | " + row[1] + " | " + row[2] + " |");
        System.out.println("--------------------------");
    }

    static int getPayout(String[] row, int bet) {
        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            return switch (row[0]) {
                case "🍒" -> bet * 2;
                case "🍋" -> bet * 5;
                case "🍊" -> bet * 10;
                case "🏆" -> bet * 50;
                case "⚓" -> bet * 100;
                default -> 0;
            };
        }

        if (row[0].equals(row[1]) || row[0].equals(row[2])) {
            return switch (row[0]) {
                case "🍒" -> bet * 2;
                case "🍋" -> bet * 3;
                case "🍊" -> bet * 4;
                case "🏆" -> bet * 5;
                case "⚓" -> bet * 6;
                default -> 0;
            };
        } else if (row[1].equals(row[2])) {
            return switch (row[1]) {
                case "🍒" -> bet * 2;
                case "🍋" -> bet * 3;
                case "🍊" -> bet * 4;
                case "🏆" -> bet * 5;
                case "⚓" -> bet * 6;
                default -> 0;
            };
        }

        return 0;
    }
}