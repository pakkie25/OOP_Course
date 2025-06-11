package lab5.task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double num1 = 0;
        double num2 = 0;
        double result = 0;
        String operator;

        System.out.print("Введіть перше число: ");
        num1 = scanner.nextDouble();

        System.out.print("Введіть оператор (+, -, *, /, ^): ");
        operator = scanner.next();

        System.out.print("Введіть друге число: ");
        num2 = scanner.nextDouble();

        boolean validOperation = true;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Помилка: числа на 0 не діляться. ");
                    validOperation = false;
                } else {
                    result = num1 / num2;
                }
                break;
            case "^":
                result = Math.pow(num1, num2);
                break;
        }
        if (validOperation){
            System.out.println("Результат: " + result);
        }
        scanner.close();
    }
}