//В переменную записываем число. Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
// Например, "это однозначное положительное число".
// Достаточно будет определить, является ли число однозначным, "двузначным или трехзначным и более.
// СДЕЛАЛ ДЛЯ ЛЮБОГО ЧИСЛА
public class Example4 {
    public static void main(String[] args) {
        int x = 0;

        int length = String.valueOf(x).length();
        if(x<0){
            System.out.println("Число отрицательное, колличество цифр" + (length-1));
        }else {
        System.out.println("Число положительное, колличество цифр" + (length));
    }
}
}
