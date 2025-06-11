package lab7.task1;

import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть свій рахунок: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Введіть початковий баланс: ");
        double initialBalance= scanner.nextDouble();

        BankAccount account = new BankAccount(accountNumber, initialBalance);

        System.out.print("Поточний баланс: " + account.getBalance());

        System.out.print("\nВведіть суму для поповнення: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        System.out.print("Введіть суму для зняття: ");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);

        System.out.println("Остаточний баланс: " + account.getBalance());


        scanner.close();
    }
}