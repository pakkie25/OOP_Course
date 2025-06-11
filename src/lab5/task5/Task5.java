package lab5.task5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        String[] questions = {
                "1. З якою піснею Україна виступала на євробаченні 2025?",
                "2. Яка найбільша тварина на Землі?",
                "3. Сонце це ...?",
                "4. З чого роблять лікарську ковбасу?"
        };
        String[][] answers = {
                {"1) Bird of Pray", "2) Lighter","3) Poison Cake"},
                {"1) Слон ", "2) Синій кит ", "3) Лось "},
                {"1) Планета", "2) Зірка", "c) Куля"},
                {"1) З лікарів", "2) З м'яса", "3) З риб"},
        };
        int[] trueAnswers = {1, 2, 2, 2};
        Scanner scanner = new Scanner(System.in);
        int sumAnswers = 0;

        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);
            for(String answer : answers[i]) {
                System.out.println(answer);
            }
            System.out.print("Ваша відповідь (1, 2, 3): ");
            int answer = scanner.nextInt();

            if(answer == trueAnswers[i]){
                System.out.println("Правильна відповідь!");
                sumAnswers++;
            }else{
                System.out.println("Неправильна відповідь!");
            }
        }
        System.out.println("Правильних відповідей: " + sumAnswers + " з " + questions.length  );
        System.out.println("Вікторина завершина!");

        scanner.close();
    }
}
