//Создать последовательность случайных чисел, найти и вывести наибольшее из них.

import java.util.Arrays;
import java.util.Random;

public class Example5 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[rand.nextInt(10)];
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10) + 1;
            if (array[i] > max) max = array[i];
        }
        System.out.println("массив: " + Arrays.toString(array));
        System.out.println("максимальный элемент: " + max);
    }
}


