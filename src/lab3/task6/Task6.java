package lab3.task6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Количество елементов; ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Теперь по очереди вводите: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int min = array[0], max = array[0], sum = 0, evenCount = 0;

        for (int num : array) {
            if (num < min) min = num;
            if (num > max) max = num;
            sum += num;
            if (num % 2 ==0) evenCount++;
        }

        double averege = (double) sum / size;

        System.out.println("Минимум");
        System.out.println("Максимум: " + max);
        System.out.printf("В среднем: %.2f%n", averege);
        System.out.println("Сумма: " + sum);
        scanner.close();
    }
}
