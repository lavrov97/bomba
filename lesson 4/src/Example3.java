//Создайте число. Определите, является ли число трехзначным. Определите, является
//ли его последняя цифра семеркой. Определите, является ли число четным.
public class Example3 {
    public static void main(String[] args) {
        int num = 775;

        if (num > 99 & num <= 999) {
            System.out.println("Число " + num + "  трехзначное");
        } else {
            System.out.println("Число " + num + " не трехзначное)");
        }

        if (num % 10 == 7) {
            System.out.println("Последняя цифра числа " + num + "  семь");
        } else {
            System.out.println("Последняя цифра числа " + num + " не семь");
        }

        if (num % 2 == 0) {
            System.out.println("Число " + num + " является четным");
        } else {
            System.out.println("Число " + num + " нечетное");
        }

    }
}
