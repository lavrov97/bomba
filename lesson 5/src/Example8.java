//  Определите сумму элементов одномерного массива, расположенных между
//минимальным и максимальным значениями.

public class Example8 {
    public static void main(String[] args) {
        int[] array = new int[15];
        int sum = 0;
        System.out.print("Исходный массив: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 30);
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        for (int a = 0; a < array.length - 1; a++) {
            for (int b = 0; b < array.length - 1 - a; b++) {
                if (array[b] > array[b + 1]) {
                    int temp = array[b];
                    array[b] = array[b + 1];
                    array[b + 1] = temp;
                }
            }
        }

        System.out.print("Сортированный массив: ");
        for (int x : array) {
            System.out.print(x + " ");
        }

        System.out.println(" ");

        for (int x = 1; x < array.length - 1; x++) {
            sum += array[x];
        }

        System.out.println("Cумма эллементов массива между " + array[0] + " и " + array[array.length - 1] +
                " равна: " + sum);
    }
}

