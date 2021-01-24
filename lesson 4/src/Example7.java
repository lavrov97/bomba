//4) Даны 3 целых числа. Найти количество положительных чисел в исходном наборе.
public class Example7 {
    public static void main(String[] args) {
        int quantity = 0;//колличество положительных чисел
        int a = -5;
        int b = 7;
        int c = 8;
        if (a >= 0) {
            quantity = quantity + 1;
        }
        if (b >= 0) {
            quantity = quantity + 1;
        }
        if (c >= 0) {
            quantity = quantity + 1;
        }
        System.out.println("колличество положительных чисел" + quantity);
    }
}
