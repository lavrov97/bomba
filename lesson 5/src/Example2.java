////Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).
public class Example2 {
    public static void main(String[] args) {
        int factorial =1;
        for (int i=10; i<15; i++){
            factorial*=i;
        }
        System.out.println("факториал равен" + factorial);
    }
}
