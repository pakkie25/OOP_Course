package lab3.task7;

import java.util.Arrays;
import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        Random random = new Random();

        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 100) + 1;
        }
        System.out.println("До сортировки: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        Arrays.sort(array);

        System.out.println("После: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
