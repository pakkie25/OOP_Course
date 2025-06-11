package lab5.task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double principal;
        double monthlyDeposit;
        double annualRate;
        int years;
        int timesCompounded;

        System.out.print("Введіть початкову суму вкладу: ");
        principal = scanner.nextDouble();

        System.out.print("Введіть щомісячний платіж: ");
        monthlyDeposit = scanner.nextDouble();

        System.out.print("Введіть річну процентну ставку (у відсотках): ");
        annualRate = scanner.nextDouble();

        System.out.print("Введіть кількість років: ");
        years = scanner.nextByte();

        System.out.print("Введіть кількість нарахувань відсотків на рік: ");
        timesCompounded = scanner.nextInt();

        double r = annualRate / 100;

        double amount = principal * Math.pow(1 + r / timesCompounded, timesCompounded * years);

        System.out.printf("Сума після %d років становить: %.2f грн%n", years, amount);

        scanner.close();

    }
}