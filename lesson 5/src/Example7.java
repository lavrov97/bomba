// Создать массив, заполнить его случайными элементами, распечатать, перевернуть,
// и снова распечатать (при переворачивании нежелательно создавать еще один массив)

public class Example7 {
    public static void main(String[] args) {
        int[] array = new int[5];
        System.out.print(" массив: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 30);
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[(array.length - 1) - i];
            array[(array.length - 1) - i] = temp;
        }
        System.out.print("перевернутый массив: ");
        for (int x : array) {
            System.out.print(x + " ");
        }
    }
}

