//Определите сумму элементов одномерного массива, расположенных между
//минимальным и максимальным значениями.

import java.util.Random;

public class Example9 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[rand.nextInt(10) + 5];
        System.out.print("Исходный массив: ");
        int max = 0, maxIndex = 0;
        int min = 0, minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10) + 5;
            if (min == 0) min = array[i];
            if (max <= array[i]) {
                max = array[i];
                maxIndex = i;
            }
            if (min >= array[i]) {
                min = array[i];
                minIndex = i;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        System.out.println("максимальный элемент: " + max + " с индексом: " + maxIndex);
        System.out.println("минимальный элемент: " + min + " с индексом: " + minIndex);
        int count = 0;
        if (maxIndex > minIndex) {
            for (int i = minIndex; i < maxIndex; i++) {
                count += array[i];
            }
        } else {
            for (int i = maxIndex; i < minIndex; i++) {
                count += array[i];
            }
        }
        System.out.println("сумма элементов равна : " + count);

    }
}