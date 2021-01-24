//Имеется целове число (задать с помощью Random rand = new Random(); int x =
//rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
//нему слово «рублей» в правильном падеже.
import java.util.Random;
public class Example2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt();
        if (x<0){
            x=x*(-1);
        }
        int lastnumber = x % 10; //находим остаток от деления ( для того чтобы найти последнюю цифру)
        if (x % 100 >= 11 && x % 100 <= 14) {
            System.out.println(x + " рублей");
        } else {
            switch (lastnumber) {
                case 1:
                    System.out.println(x + " рубль ");
                    break;
                case 2:
                    System.out.println(x + " рубля ");
                    break;
                case 3:
                    System.out.println(x + " рубля ");
                    break;
                case 4:
                    System.out.println(x + " рубля ");
                    break;
                default:
                    System.out.println(x + " рублей ");
            }

        }
    }
}