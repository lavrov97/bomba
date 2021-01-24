//Даны 3 целых числа. Найти количество положительных и отрицательных чисел в исходном наборе.
public class Example8 {
    public static void main(String[] args) {
        int positive = 0;//колличество положительных чисел
        int negative = 0;//колличество отрицательных чисел
        int a = -5;
        int b = 7;
        int c = 8;
        if (a >= 0) {
            positive = positive + 1;
        } else {
            negative = negative + 1;
        }
        if (b >= 0) {
            positive = positive + 1;
        } else {
            negative = negative + 1;
        }
        if (c >= 0) {
            positive = positive + 1;
        } else {
            negative = negative + 1;
        }
        System.out.println("колличество положительных чисел " + positive + " колличество отрицательных чисел " + negative);
    }
}


